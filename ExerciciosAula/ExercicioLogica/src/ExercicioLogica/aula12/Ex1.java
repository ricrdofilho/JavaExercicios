package aula12;
import java.util.Scanner;
        
public class Ex1 {
    public static void main (String args []){
       
       Scanner in = new Scanner (System.in);
       
       float notas[] = new float [10];
       int j=1;
       for (int i=0; i<10; i++) {
           System.out.println("Digite a " + j + "° nota: ");
           notas[i] = in.nextFloat();
           
           j = j+1;
        }
        
       System.out.println("A oitava nota é: " + notas[7]);
       System.out.println("A decima nota é: " + notas[9]);
    }
}
