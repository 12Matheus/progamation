package com.unama;

import java.util.Scanner;

public class letrac2 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("informe a idade");
        idade = sc.nextInt();
        if(idade<=10) {
            System.out.println("infantil");
        }else if(idade>10&&idade<-17) {
            System.out.println("juvenil");
        }else{
            System.out.println("sênior");
        }

    }

}
