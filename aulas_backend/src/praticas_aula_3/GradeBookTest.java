package praticas_aula_3;

import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        GradeBook myGradeBook = new GradeBook();

        System.out.println( "Digite o nome do curso:" );
        String courseName = input.nextLine();
        System.out.println();

        myGradeBook.displayMessage(courseName);
    }
}

