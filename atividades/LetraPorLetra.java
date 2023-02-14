//Criar um programa que receba uma palavra e imprime no console letra por letra
package atividades;

//Imports
import java.util.Scanner;

//Início
public class LetraPorLetra {
    
    public static void main(String[] args) {
        
        //Variáveis
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite uma palavra qualquer: ");
        String palavra = entrada.nextLine();

        for(int i = 0; i < palavra.length(); i++){
            System.out.println(palavra.charAt(i));
        }
    entrada.close();
    }
}
//Fim do código