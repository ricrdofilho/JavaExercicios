package ExercicioLogica;

import javax.swing.JOptionPane;

public class AlunosEleitores {
    public static void main(String[] args) {
        int qtdApto = 0, qtdNaoApto = 0, somaIdadeNaoApto = 0;
        double mediaIdadeNaoApto = 0;

        for (int i = 1; i <= 10; i++) {
            int idadeAluno = 0;

            idadeAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno " + i + ":"));

            if (idadeAluno >= 16) {
                qtdApto += 1;
            } else {
                qtdNaoApto += 1;
                somaIdadeNaoApto += idadeAluno;
            }
        }

        mediaIdadeNaoApto = somaIdadeNaoApto / qtdNaoApto;

        JOptionPane.showMessageDialog(null, "Quantidade de alunos aptos a votar (16 anos ou mais): " + qtdApto
            + ".\nMédia de idade dos alunos não aptos a votar (menores de 16 anos): " + mediaIdadeNaoApto + ".");
    }
}

