package wsb.po.dwa;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię studenta: ");
        String student = scanner.nextLine();

        System.out.print("Podaj jego oceny oddzielone spacjami: ");
        String[] gradesInput = scanner.nextLine().split(" ");
        scanner.close();

        double sum = 0;
        for (String grade : gradesInput) {
            sum += Double.parseDouble(grade);
        }

        double average = sum / gradesInput.length;
        System.out.printf("Średnia ocen %s: %.2f%n", student, average);
    }

    public static void robieCos(){
        System.out.println("coś");
    }
}

