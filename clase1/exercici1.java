import java.util.Scanner;
public class exercici1 {
    public static void main(String[] args) {
        //Exercici 1, Calcular la nota del mòdul si hem fer dos examens i cada examen conta el mateix. Les notes poden tenir decimals
        float nota1 = 6.2f;
        float nota2 = 4.8f;
        float notaFinal = (nota1 + nota2) / 2;
        System.out.println("la nota del mòdul es:" + notaFinal);

        //Que ho demani l'usuari
        Scanner Scanner1 = new Scanner(System.in);

        System.out.println("Introdueix la primera nota:");
        float notaExamen1 = Scanner1.nextFloat();

        System.out.println("Introdueix la segona nota:");
        float notaExamen2 = Scanner1.nextFloat();

        float notaFinal2 = (notaExamen1 + notaExamen2) / 2;
        System.out.println("la nota del mòdul es: " + notaFinal2);
        Scanner1.close();
    }
}
