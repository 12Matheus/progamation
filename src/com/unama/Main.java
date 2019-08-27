package com.unama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double numero;
        double resultado;
        Scanner sc=new Scanner(System.in);
        System.out.println("informe o numero");
        numero=sc.nextDouble();
        resultado=numero*2;
        System.out.println("o dobro do numero é" +resultado);    }
}
