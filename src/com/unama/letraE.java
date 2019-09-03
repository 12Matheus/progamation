package com.unama;

import java.util.Scanner;

public class letraE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalproduzido;
        int totalCopias;
        System.out.println("informe o total de cópias");
        totalCopias=sc.nextInt();

        double totalPago;

        if (totalCopias<=100){
            totalPago = totalCopias*0.25;
        }else {
            totalPago = totalCopias*0.20;
        }
        System.out.println("total a ser pago é R$"+totalPago);
        }
    }

