//Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
package atividades;

//Imports
import java.util.Scanner;

//Início
public class DesafioParOuImpar {

    public static void main(String[] args) {

        //Variáveis
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        if(num >= 0 && num <= 10) {
            if(num % 2 == 0) {
                System.out.println("Sim, este número é par.");
                    } else {
                        System.out.println("Números ímpares não serão aceitos.");
                    }
        } else {
            System.out.println("Número inválido, digite novamente.");      
        }
    entrada.close();
    }
}
//Fim do código