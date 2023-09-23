/*Exercicio 5 da Lista de Exercicios de Algoritmos e Logica de Programação */
package ExercicioLogica;
import javax.swing.JOptionPane;

public class NumeroMaior2 {
    public static void main(String args[]) {
        double N1, N2, N3;
        
        N1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        N2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        N3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número"));
        
        if (N1>N2 && N1>N3){
            JOptionPane.showMessageDialog(null, N1 + " É o maior número");
        } else if (N2>N1 && N2>N3){
            JOptionPane.showMessageDialog(null, N2 + " É o maior número");
        } else {
            JOptionPane.showMessageDialog(null, N3 + " É o maior número");
        }
    }
}
