//Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno for maior ou igual a 7.0 imprime no console... 
//... "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso contrário imprime no console "Reprovado".
package atividades;

//Imports
import java.util.Scanner;

//Inicio
public class NotaParcial {
   
    public static void main(String[] args) {
        
        //Variáveis
        Scanner entrada = new Scanner(System.in);
        double nota1 = 0;
        double nota2 = 0;

        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Agora digite a segunda nota: ");
        nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media >= 7.0){
            System.out.println("Aprovado.");
        }else if(media < 7.0 && media > 4.0){
            System.out.println("Recuperação.");
        }else{
            System.out.println("Reprovado.");
        }
        System.out.printf("Média: %f", media);
        entrada.close();
    }
}
//Fim do código