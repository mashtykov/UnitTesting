package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FullResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int number;

        try {
            number = sc.nextInt();
            System.out.println(number);
            int count = 1;

            int operationNumber = number;
            while (operationNumber / 10 > 0) {
                count++;
                operationNumber /= 10;
            }
            if (count != 3){
                System.out.println("Введите трехзначное число ");
                System.out.println("Количество цифр в числе: " + count );
            }else {
                System.out.println("Введенное число: " + number);
            }
        } catch (InputMismatchException e) {
            System.out.println("Введено некорректное выпражение. Повторите ввод. ");

        } finally {
            System.out.println("Конец выведения программы");

        }





    }

}
