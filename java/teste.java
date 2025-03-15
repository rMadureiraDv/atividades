
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        double [] notas = new double[2];
        Scanner teclado = new Scanner(System.in);
        double media = 0;
        for (int i = 0; i < 2 ; i++)
        {
            System.out.println("Digite a " + i + " nota");
            notas[i] = teclado.nextDouble();
            if (notas[i] > 10 || notas[i] < 0)
            {
                notas[i] = 0;
                i--;
            }
        }
        for (double j: notas)
        {
            media = media + j;
        }
        if (media / 2 < 5)
        {
            System.out.println("reprovado");
        }
        else{
            System.out.println("Aprovado");
        }
    }
}