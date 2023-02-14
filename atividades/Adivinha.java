/* Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. 
 * Armazene um numero aleatório em uma variável.
 * O Jogador tem 10 tentativas para adivinhar o número gerado. 
 * Ao final de cada tentativa, imprima a quantidade de tentativas restantes... 
 * ... e imprima se o número inserido é maior ou menor do que o número armazenado.
*/
package atividades;

//Imports
import java.util.Scanner;

//Início
public class Adivinha {
    
    public static void main(String[] args) {
    
    //Variáveis
    Scanner entrada = new Scanner(System.in);
    int valRandom = 50;
    int valSelecionado = 0;

    System.out.println("Tente adivinhar o valor de 0 a 100.");
    
    for(int i = 10; i >= 1; i--){
        System.out.printf("Restam %d tentativas: ", i);
        valSelecionado = entrada.nextInt();
        
        if(valSelecionado > valRandom){
                System.out.println("Incorreto, número maior do que o selecionado.");
            }else if(valSelecionado < valRandom){
                System.out.println("Incorreto, número menor do que o selecionado.");
            }else{
                System.out.println("Número correto! Para beins.");
            break;
            }
    }
        entrada.close();
    }
}
//Fim do código