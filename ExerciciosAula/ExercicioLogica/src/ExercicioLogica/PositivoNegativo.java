/*Exercicio 2 da Lista de Exercicios de Algoritmos e Logica de Programação */
package ExercicioLogica;
import java.util.Scanner;

public class PositivoNegativo {

    public static void main(String args[]) {
        double N;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        N = input.nextDouble();
        
        
        if (N>0){
            System.out.println(N + " e positivo");
        } else if (N<0) {
            System.out.println(N + " e negativo");
        } else {
            System.out.println("O numero 0 e considerado um numero nao-negativo e tambem nao-positivo.");
        }
        
    }   
}
