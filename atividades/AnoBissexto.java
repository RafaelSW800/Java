//Criar um programa informa se o ano atual é um ano bissexto
package atividades;

//Imports
import java.util.Scanner;

//Início
public class AnoBissexto {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o ano:");
        int valor = entrada.nextInt();

        if(valor % 4 == 0){
            System.out.println("Esse é um ano bissexto.");
        }else{
            System.out.println("Não é um ano bissexto.");
        }

    entrada.close();    
    }
}
//Fim do código