/*Exercicio 4 da Lista de Exercicios de Algoritmos e Logica de Programação */
package ExercicioLogica;
import javax.swing.JOptionPane;

public class NotaAluno {
    public static void main(String args[]) {
        float N1, N2, Media;
        
        N1 = Float.parseFloat (JOptionPane.showInputDialog(null,"Digite a primeira nota"));
        N2 = Float.parseFloat (JOptionPane.showInputDialog(null,"Digite a segunda nota"));
        
        Media = (N1+N2)/2;
        
        if (Media == 10){
            JOptionPane.showMessageDialog(null, "Aprovado com Distinção");
        } else if (Media>=7){
            JOptionPane.showMessageDialog(null, "Aprovado");
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }
}
