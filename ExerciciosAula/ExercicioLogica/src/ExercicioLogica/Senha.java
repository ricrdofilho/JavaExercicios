package ExercicioLogica;

import javax.swing.JOptionPane;

public class Senha {
    public static void main(String[] args) {
        final String senhaDefinida = "NoMe";
        int tentativas = 3;

        while (tentativas > 0) {
            String senha;

            senha = JOptionPane.showInputDialog("Digite a senha: ");

            if (senha.equals(senhaDefinida)) {
                tentativas = 0;
                JOptionPane.showMessageDialog(null, "Senha correta.");
            } else {
                tentativas -= 1;
                JOptionPane.showMessageDialog(null, "Senha invalida! Você ainda tem " + tentativas + " tentativas.");
            }

        }
    }

}
