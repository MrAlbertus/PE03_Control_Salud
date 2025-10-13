import java.util.Scanner;

public class PE03_Control_Salut {
    public static void main(String[] args) {
        //-----------------------Variables-----------------------
        String nom = "";
        String cognom1 = "";
        String cognom2 = "";
        int edad = 0;;
        double pes = 0;
        double alçada = 0;;
        String menu;
        String opcio;
        int bucle;
        String opcio2;
        double imc;
        String descripcio;
        int fc_max = 220;
        int fc_obj_max = fc_max * 0.85; //arreglar
        //-------------------------------------------------------
        Scanner Scanner1 = new Scanner(System.in);
        
        bucle = 60; //para que el while siga

    while (bucle > 50) {
            
        
        System.out.println("-------------------MENU-------------------");
        System.out.println("Opció 'a' Dades: ");
        System.out.println("Opció 'b' Modificació Dades: ");
        System.out.println("Opció 'c' Visualitzar dades: ");
        System.out.println("Opció 'd' Sortir: ");
        System.out.println("------------------------------------------");

        
        opcio = Scanner1.next();

        switch (opcio) {
            case "a":
                System.out.println("Has seleccionat Opció 'a' Dades");
            try {

                System.out.println("Introdueix el teu nom: ");
                nom = Scanner1.next();
                if (nom.isEmpty()){
                    System.out.println("Error: El nom no pot quedar buit.");;
                }

                System.out.println("Introdueix el teu 1r cognom: ");
                cognom1 = Scanner1.next();
                if (cognom1.isEmpty()) {
                    System.out.println("Error: El 1r cognom no pot quedar buit.");
                }


                System.out.println("Introdueix el 2n cognom: ");
                cognom2 = Scanner1.next();
                if (cognom2.isEmpty()) {
                    System.out.println("Error: El 2n cognom no pot quedar buit.");
                }

                System.out.println("Quina es la teva edad: ");
                edad = Scanner1.nextInt();
                if (!(edad <=120)) {
                    System.out.println("Error: La edat introduida no es valida.");
                }
                
                System.out.println("Quin es el teu pes (kg): ");
                pes = Scanner1.nextDouble();
                if (!(pes <=400)) {
                    System.out.println("Error: El pes introduit no es valid.");
                    
                }

                System.out.println("Quina es la teva altura (cm): ");
                alçada = Scanner1.nextDouble();
            } catch (Exception InputMismatchException) {
            }
                
            

                break;

            case "b":
                System.out.println("Has seleccionat Opció 'b' Modificació Dades");

                    System.out.println("Quines dades vols modificar?");
                    System.out.println("a) Nom complet");
                    System.out.println("b) Edat");
                    System.out.println("c) Pes (KG)");
                    System.out.println("d) Alçada (M)");

                    opcio2 = Scanner1.next();

                    switch (opcio2) {
                        case "a":
                        System.out.println("\n");
                            System.out.println("Has seleccionat 'Nom'");
                            System.out.println("Introdueix el nou Nom: ");
                            nom = Scanner1.next();

                            break;
                        
                        case "b":
                            System.out.println("\n");
                            System.out.println("Has seleccionat 'Edat'");
                            System.out.println("Introdueix la nova Edat: ");
                            edad = Scanner1.nextInt();

                            break;
                        
                        case "c":
                            System.out.println("\n");
                            System.out.println("Has seleccionat 'Pes'");
                            System.out.println("Introdueix el nou Pes: ");
                            pes = Scanner1.nextInt();

                            break;
                    
                        default:
                            break;
                    }

                break;

            case "c":
                System.out.println("Has seleccionat Opció 'c' Visualitzar dades");
                System.out.println("\n");

                System.out.println("Hola, " + nom + "" + cognom1 + "" + cognom2 + "!");
                
                imc = pes/ (alçada * alçada);

                if (imc <= 18.5 ) {
                    descripcio = "pes baix";
                }
                else if (imc >= 18.5 && imc <= 24.9) {
                    descripcio = "pes normal";
                }
                else if (imc >= 25 && imc <= 29.9) {
                    descripcio = "sobrepès";
                }
                else if (imc >= 30) {
                    descripcio = "obesitat";
                }
                
                System.out.println("FC màxima estimada: " + );
                
                break;
            
            case "d":
                System.out.println("has seleccionat Opció 'd' Sortir!");
                bucle = 25; //para que termine el while

                break;

            default:
                System.out.println("ERROR 'default'");
                break;
        }

    }
        
        Scanner1.close();
        

    }
}
