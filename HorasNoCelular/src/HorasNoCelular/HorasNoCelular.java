package HorasNoCelular;
import javax.swing.JOptionPane;

public class HorasNoCelular {

    public static void main(String[] args) {
        
        String strngNome, strngCostume, strngInput;
        float fltDiasDoAno,fltDiasNoAno, fltDiasDaSemana;
        float fltHorasDeUso, fltHorasTotalSemana, fltHorasTotalMes, fltHorasTotal;
        
        strngNome = JOptionPane.showInputDialog("Ola, qual o seu nome? ");
        strngCostume = JOptionPane.showInputDialog(strngNome + ", voce costuma usar o celular todos os dias da semana?");
        
        if (strngCostume.equalsIgnoreCase("Não") || 
            strngCostume.equalsIgnoreCase("n") || 
            strngCostume.equalsIgnoreCase("nao")) {
            strngInput = JOptionPane.showInputDialog("Quantos dias da semana voce usa o celular?");
            fltDiasDaSemana = Float.parseFloat(strngInput);
            fltDiasDoAno = fltDiasDaSemana*52;
        } 
        else {
            fltDiasDaSemana = 7;
            fltDiasDoAno = 365;
        }
        
        strngInput = JOptionPane.showInputDialog("Voce usa o celular, em media quantas horas por dias?");
        fltHorasDeUso = Float.parseFloat(strngInput);
        
        fltHorasTotal = fltHorasDeUso*fltDiasDoAno;
        fltHorasTotalMes = fltHorasDeUso*30;
        fltHorasTotalSemana = fltHorasDeUso*fltDiasDaSemana;
        
        JOptionPane.showMessageDialog(null, strngNome + ", voce passa em media " + fltHorasTotalSemana + " horas da sua semana no celular.");
        JOptionPane.showMessageDialog(null, "Isso da, em media, " + fltHorasTotalMes + " no mes"); 
        JOptionPane.showMessageDialog(null, "e " + fltHorasTotal + " horas no ano.");       
        
    }
    
}