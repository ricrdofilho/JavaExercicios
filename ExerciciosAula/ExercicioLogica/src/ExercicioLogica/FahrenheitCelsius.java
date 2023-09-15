package ExercicioLogica;
import javax.swing.JOptionPane;

public class FahrenheitCelsius {
    public static void main(String[] args) {
        int C = 1, F = 1;
        String strResposta = "";
        
        while (strResposta.equals("OPÇÃO INVALIDA!") || strResposta.equals("")) {
            
            strResposta = JOptionPane.showInputDialog(null, "Digite o número da operação que deseja realizar:\n1 - Fahrenheit (°F) para Celsius (°C)\n2 - Celsius (°C) para Fahrenheit (°F)\n");
        
            switch (strResposta){
                case "1":
                        F = Integer.parseInt(JOptionPane.showInputDialog("Digite os graus Fahrenheit (°F)"));
                        C = (int) ((5.0/9)*(F-32)); 
                        break;
                case "2":
                        C = Integer.parseInt(JOptionPane.showInputDialog("Digite os graus Celsius (°C)"));
                        F = (int) ((C*(9.0/5))+32);
                        break;
                default: strResposta = "OPÇÃO INVALIDA!" ; break;
            }
            
            if (strResposta.equals("OPÇÃO INVALIDA!")) {
                JOptionPane.showMessageDialog(null, strResposta);
            }
        }    
        
        if (strResposta.equals("1")){
            JOptionPane.showMessageDialog(null, F + "° graus Fahrenheit" + " equivale a " + C + "° graus Celsius");
        } else {
            JOptionPane.showMessageDialog(null, C + "° graus Celsius" + " equivale a " + F + "° graus Fahrenheit");
        }
    }
}
