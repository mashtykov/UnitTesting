package com.company;

import java.util.Scanner;

public class FoolPoof {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int number = sc.nextInt();
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



    }
}
