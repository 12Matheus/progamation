package com.unama;

import java.util.Scanner;

public class letrab {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int produzido, defeito;
        System.out.println("informe o total produzido");
        produzido=sc.nextInt();
        System.out.println("informe o total com defeito");
        defeito=sc.nextInt();
        double linear=produzido*0.1;
        if(defeito<=linear){
            System.out.println("não é necessária uma manuntenção");
            }else{
        System.out.println("é necessária uma manuntenção");
    }
   }
}