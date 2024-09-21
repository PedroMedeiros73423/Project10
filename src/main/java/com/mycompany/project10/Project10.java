package com.mycompany.project10;
import java.util.Scanner;
public class Project10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        int X = in.nextInt();
        System.out.println("Informe o segundo valor: ");
        int Y = in.nextInt();
        int soma =X + Y;
        if(soma > 10){
            System.out.println("A soma dos valores é: " + soma);
        }
    }
}
