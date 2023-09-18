/*Exercicio 6 da Lista de Exercicios de Algoritmos e Logica de Programação */
package ExercicioLogica;
import javax.swing.JOptionPane;

public class NumMaiorMenor {
    public static void main(String args[]) {
        double N1, N2, N3, Maior, Menor;
        
        N1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        N2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        N3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número"));
        
        Maior = Math.max(Math.max(N1,N2),N3);
        Menor = Math.min(Math.min(N1,N2),N3);
        
        JOptionPane.showMessageDialog(null, "O maior número é " + Maior + " e o menor número é " + Menor);
    }
}