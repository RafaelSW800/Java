/*Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos...
... caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.
*/
package atividades;

//Imports
import java.util.Scanner;

//Início
public class Soma {
    
    public static void main(String[] args) {
        
        //Variáveis
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        int numero = 0;

        System.out.println("Digite um número qualquer. Digite um número negativo para encerrar o programa./n");
        do {
            numero = entrada.nextInt();
            soma += numero;
            System.out.printf("Soma atual: %d\n", soma);
        }while(numero >= 0);
    
    entrada.close();
    }
}
//Fim do código