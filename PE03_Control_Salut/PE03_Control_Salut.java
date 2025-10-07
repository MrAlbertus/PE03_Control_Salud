import java.util.Scanner;

public class PE03_Control_Salut {
    public static void main(String[] args) {
        //-----------------------Variables-----------------------
        String nom;
        String cognom1;
        String cognom2;
        int edad;
        double pes;
        double alçada;
        String menu;
        String opcio;
        //-------------------------------------------------------
        Scanner Scanner1 = new Scanner(System.in);
        
        System.out.println("-------------------MENU-------------------");
        System.out.println("Opció 'a' Dades: ");
        System.out.println("Opció 'b' Modificació Dades: ");
        System.out.println("Opció 'c' Visualitzar dades: ");
        System.out.println("------------------------------------------");

        opcio = Scanner1.next();

        switch (opcio) {
            case "a":
                System.out.println("Has seleccionat Opció 'a' Dades");

                System.out.println("Introdueix el teu nom: ");
                nom = Scanner1.next();

                System.out.println("Introdueix el teu 1r cognom: ");
                cognom1 = Scanner1.next();

                System.out.println("Introdueix el 2n cognom: ");
                cognom2 = Scanner1.next();

                System.out.println("Quin es el teu pes (kg): ");
                pes = Scanner1.nextDouble();

                System.out.println("Quina es la teva altura (cm): ");
                alçada = Scanner1.nextDouble();


                break;

            case "b":
                System.out.println("Has seleccionat Opció 'b' Modificació Dades");


                break;

            case "c":
                System.out.println("Has seleccionat Opció 'c' Visualitzar dades");


                break;

            default:
                break;
        }


        
        
        

    }
}
