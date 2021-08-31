package geekbrains.quess_the_number;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //выводим надпись
        System.out.println("Ваша задача угадать число.");
        //задаем число
        int range = 10;
        //пишем чтоб программа рандомно выбирала загадаемое число до 10
        int number = (int)(Math.random() * range);
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали.");
                break;
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше.");
            } else {
                System.out.println("Загаданное число больше.");
            }
        }
        scanner.close();
    }

}

