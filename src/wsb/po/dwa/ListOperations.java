package wsb.po.dwa;

import java.util.Arrays;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczby oddzielone spacjami: ");
        String[] input = scanner.nextLine().split(" ");
        scanner.close();

        int[] numbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        int sum = Arrays.stream(numbers).sum();
        double avg = sum / (double) numbers.length;
        int min = Arrays.stream(numbers).min().orElse(0);
        int max = Arrays.stream(numbers).max().orElse(0);

        Arrays.sort(numbers);
        System.out.println("Suma: " + sum);
        System.out.println("Średnia: " + avg);
        System.out.println("Najmniejsza liczba: " + min);
        System.out.println("Największa liczba: " + max);
        System.out.println("Sortowanie rosnąco: " + Arrays.toString(numbers));

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
