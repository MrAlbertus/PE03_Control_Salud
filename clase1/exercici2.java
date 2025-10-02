import java.util.Scanner;

public class exercici2 {
    public static void main(String[] args) {
    
    //Exercici 2 Demanar per teclat el nostre nom i el nostre cognom en variables separades. Imprimir-les per pantalla un
    
    System.out.println("Introdueix el teu nom:");
    Scanner scanner1 = new Scanner (System.in);

    String nom = scanner1.nextLine();

    System.out.println("Introdueix el teu cognom:");
    String cognom = scanner1.nextLine();
    
    scanner1.close();

    System.out.println("El teu nom es: " + nom + cognom);

}
}
