/*Exercicio 7 da Lista de Exercicios de Algoritmos e Logica de Programação */
package ExercicioLogica;
import javax.swing.JOptionPane;

public class MenorPreco {
    public static void main(String args[]){
        double P1,P2,P3,Menor;
        
        P1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro preço"));
        P2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo preço"));
        P3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro preço"));
        
        Menor = Math.min(Math.min(P1, P2),P3);
        
        JOptionPane.showMessageDialog(null, "Você deve comprar o produto de valor: " + Menor);
    }    
}
