/*Exercicio 3 da Lista de Exercicios de Algoritmos e Logica de Programação */
package ExercicioLogica;
import java.util.Scanner;

public class Sexo {
    
    public static void main(String args[]) {
        String Sexo;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual seu sexo? [M/F]");
        Sexo = input.next();
        
        if (Sexo.equalsIgnoreCase("M")) {
            System.out.println("M - Masculino");
        } else if (Sexo.equalsIgnoreCase("F")) {
            System.out.println("F - Feminino");
        } else {
            System.out.println("Sexo invalido");
        }
    }
}
