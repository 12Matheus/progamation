package com.unama;

import java.util.Scanner;

public class LetraD {

        public static void main(String args[])

        {

            Scanner sc = new Scanner(System.in);

            System.out.print("Raio? ");
            double raio = sc.nextDouble();

            double area = Math.PI * Math.pow(raio,2.0);

            System.out.printf("area = %.2f ",area);
        }
    }
