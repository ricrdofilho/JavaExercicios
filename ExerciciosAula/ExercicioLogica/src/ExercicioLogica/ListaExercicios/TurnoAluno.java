/*Exercicio 8 da Lista de Exercicios de Algoritmos e Logica de Programação */
package ExercicioLogica.ListaExercicios;

import javax.swing.JOptionPane;

public class TurnoAluno {
    public static void main(String args[]) {
        String turno = "";
        
        while (turno.equals("")) {
        
            turno = JOptionPane.showInputDialog("Em qual turno você estuda?\n\nDigite:\n'M' para Matutino,\n'V' para Vespertino\n'N' para Noturno\n\n");
        
            if (turno.equalsIgnoreCase("M")) {
                JOptionPane.showMessageDialog(null,"Bom Dia!");
            } else if (turno.equalsIgnoreCase("V")) {
                JOptionPane.showMessageDialog(null,"Boa Tarde!");
            } else if (turno.equalsIgnoreCase("N")) {
                JOptionPane.showMessageDialog(null,"Boa Noite!");        
            } else {
                turno = "";
                JOptionPane.showMessageDialog(null,"Valor Inválido!");
            }
        }
    }    
}
