package com.company;
import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите количество элементов массива: ");
        Scanner sca = new Scanner(System.in);
        int size;
        size = sca.nextInt();
        double[] arra = new double[size];
        for (int i = 0; i < size; i++) {
            arra[i] = (int) (Math.random()*(100-1)+1)+1;
        }
        int d;
        while(true) {
            System.out.println("1. Вывести массив");
            System.out.println("2. Увеличить элемент массива на 10%");
            System.out.println("3. Выход");
            Scanner scan = new Scanner(System.in);
            d = scan.nextInt();
            switch(d) {
                case 1:
                    outArray(arra);
                    System.out.println();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Введите номер элемента [] " ) ;
                    Scanner sc = new Scanner(System.in);
                    int u = sc.nextInt();
                    arra[u] = (arra[u] + arra[u] / 10);
                    System.out.println();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Введено что-то другое " );
                    System.out.println();
                    break;
            }
            //2. Увеличить элемент массива на 10%
        }
    }
    static void outArray(double[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
