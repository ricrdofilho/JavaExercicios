/*Exercicio 1 da Lista de Exercicios de Algoritmos e Logica de Programação */
package ExercicioLogica;
import java.util.Scanner;

public class NumeroMaior {

    public static void main(String args[]) {
        double N1, N2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escreva o primeiro numero: ");
        N1 = input.nextDouble();
        System.out.println("Escreva o segundo numero: ");
        N2 = input.nextDouble();
        
        if (N1>N2) {
            System.out.println(N1+" é o maior numero");
        }
        if (N1<N2) {
            System.out.println(N2+" é o maior numero");
        } else {
            System.out.println("Os numeros são iguais");
        }
        
    }
}
