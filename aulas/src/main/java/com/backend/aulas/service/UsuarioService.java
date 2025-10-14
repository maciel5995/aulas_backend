package com.backend.aulas.service;
import com.backend.aulas.dto.UsuarioCreateDTO;
import com.backend.aulas.dto.UsuarioDTO;
import com.backend.aulas.models.Usuario;
import com.backend.aulas.repository.UsuarioRepository;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // Mapeamento manual: entidade → DTO
    private UsuarioDTO toDTO(Usuario usuario) {
        return new UsuarioDTO(usuario.getId(), usuario.getNome(), usuario.getEmail());
    }

    // Mapeamento manual: DTO de entrada → entidade
    private Usuario toEntity(UsuarioCreateDTO dto) {
        Usuario usuario = new Usuario();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());
        return usuario;
    }

    public List<UsuarioDTO> listarTodos() {
        return usuarioRepository.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public UsuarioDTO buscarPorId(UUID id) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Usuário não encontrado"));
        return toDTO(usuario);
    }

    public UsuarioDTO salvar(UsuarioCreateDTO dto) {
        if (usuarioRepository.existsByEmail(dto.getEmail())) {
            throw new EntityExistsException("Já existe um usuário cadastrado com o e-mail informado.");
        }

        Usuario usuario = toEntity(dto);
        return toDTO(usuarioRepository.save(usuario));
    }

    public UsuarioDTO atualizar(UUID id, UsuarioCreateDTO dto) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Usuário não encontrado"));
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());
        return toDTO(usuarioRepository.save(usuario));
    }

    public UsuarioDTO deletar(UUID id) {
        Usuario removido = usuarioRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Usuário não encontrado"));
        usuarioRepository.delete(removido);
        return toDTO(removido);
    }
}
