package ExercicioLogica;
import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        float N1, N2, P1, P2, MediaP;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Calcularemos a media ponderada de duas notas");
        System.out.println("Sabendo que a Nota 1 tem um peso");
        System.out.println("E a Nota 2 tem outro peso");
        System.out.println();
        
        System.out.println("Digite a primeira Nota:");
        N1 = input.nextFloat();
        System.out.println("Qual o peso da Nota 1:");
        P1 = input.nextFloat();
        
        System.out.println("Digite a segunda Nota:");
        N2 = input.nextFloat();
        System.out.println("Qual o peso da Nota 2:");
        P2 = input.nextFloat();
        
        MediaP = (N1*P1 + N2*P2)/(P1+P2);
        
        System.out.println("A media ponderada e: " + MediaP);
    }
}
