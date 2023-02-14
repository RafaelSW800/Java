//Criar um programa que receba um número e diga se ele é um número primo

/* !!!!!! DICAS !!!!!!
 *  São números inteiros positivos.
 *  São apenas divididos por 1 e por eles mesmos.
 *  O único número par primo é o 2 (0 e 1 não contam).
 */
package atividades;

//Imports
import java.util.Scanner;

//Início
public class NumeroPrimo {
    
    public static void main(String[] args) {

        //variáveis
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int num = entrada.nextInt();

        if(num >= 2){
            if(num / num == 1 && num % 2 != 0){
                System.out.println("É um número primo.");
            /* }else if (num / 1 != num){
                System.out.println("Não é um número primo.");*/
            }else if(num == 2){
                System.out.println("É um número primo.");
            }else{
                System.out.println("Número não primo.");
            }
        }else{
            System.out.println("Número inválido, digite novamente.");
        }
    entrada.close();
    }    
}
//Fim do código 