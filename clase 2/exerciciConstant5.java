import java.util.Scanner;
public class exerciciConstant5 {
    public static void main(String[] args) {
        //Demanar el nom de l’usuari per teclat i que l’ordinador el saludi a posteriori.
        Scanner Scanner1 = new Scanner(System.in);
        
        String nom;
        System.out.println("Quin es el teu nom?: ");
        nom = Scanner1.nextLine();

        System.out.println("Hola " + nom + "!");
        Scanner1.close();
    }
}
