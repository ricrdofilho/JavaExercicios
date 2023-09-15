package ExercicioLogica;
import java.util.Scanner;

public class VolumeCirculo {
    
    public static void main(String[] args) {
        double dblRaio, dblVolume;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Digite o raio do circulo para descobrir o volume");
        dblRaio = input.nextDouble();
        
        dblVolume = Math.PI * Math.pow(dblRaio, 3);
        
        System.out.println("O volume do circulo e: " + dblVolume);
    }    
}
