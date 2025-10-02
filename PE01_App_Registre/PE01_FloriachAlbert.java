package PE01_App_Registre;
import java.util.Scanner;

public class PE01_FloriachAlbert {
    public static void main(String[] args) {
        //S’han de demanar a l’usuari les següents dades personals en el registre:
        //Nom
        //Cognoms
        //Data de naixement
        //Ciutat
        //Codi postal
        //Nom d’usuari
        //Contrasenya
        //Estudiant (Sí/no)

        String nom; //Perque el nom es text
        String cognom; //Pel mateix motiu, cognom es només text
        int dianaixement; //faré (Dia, Mes, any) com a int separat per després fer les operacións.
        int mesnaixement; 
        int anynaixement;

        String ciutat;
        int codipostal; //el codi postal es int.
        String nomusuari;
        String contrasenya;
        boolean estudiantsiono;
        String contrasenyalogin;
        String usuarilogin;
        String[] missatges; //per l'array
        boolean bdatos; //Per comprovar que es el matix usuari i contrasenya.
        int edat;
        boolean majoredadsiono;


        Scanner Scanner1 = new Scanner(System.in);

        System.out.println("Com es el teu nom?: ");
        nom = Scanner1.next();

        System.out.println("Com es el teu cognom?: ");
        cognom = Scanner1.next();

        System.out.println("Quin es el teu dia de naixement?: ");
        dianaixement = Scanner1.nextInt();

        System.out.println("Quin es el teu mes de naixament?: ");
        mesnaixement = Scanner1.nextInt();

        System.out.println("Quin es el teu any de naixament?: ");
        anynaixement = Scanner1.nextInt();

        System.out.println("En quina ciutat vius?: ");
        ciutat = Scanner1.next();

        System.out.println("Quin es el teu códig postal?: ");
        codipostal = Scanner1.nextInt();

        System.out.println("Quin es el teu nom d'usuari?: ");
        nomusuari = Scanner1.next();

        System.out.println("Quina es la teva contrasenya");
        contrasenya = Scanner1.next();

        System.out.println("Ets un estudiant? (true o false): ");
        estudiantsiono = Scanner1.nextBoolean();

        edat = (2025 - anynaixement);
    
        majoredadsiono = (edat >= 18);

        System.out.println("Les dades s'han introduït correctament!");

        //ARA TOCA FER EL INICI DE SESSIÓ

        System.out.println("Inici sessió - Nom usuari: ");
        usuarilogin = Scanner1.next();

        System.out.println("Inici sessió - Contrasenya: ");
        contrasenyalogin = Scanner1.next();

        //ARA ELS MISSATGES
        
        missatges = new String[] {
            "Nom d'usuari o contrasenya incorrectes", //MISSATGE 0 (ERROR)
            "Inici de sessió correcte. Benvingut"+nom+"!"//MISSATGE 1 (SUCCESFULL LOGIN)
        };

        bdatos = (usuarilogin.equals(nomusuari)) && (contrasenyalogin.equals(contrasenya)) ;
        //AIXÓ DIU QUE SI EL LOGIN DEL USUARI ES IGUAL AL NOM I EL LOGIN DE CONTRASENYA
        //ES IGUAL A LA CONTRASENYA IMPRIMEIX EL MISSATGE 0, SINÓ EL 1

        System.out.println("inici correcte?: " + bdatos);

        System.out.println("nom complet: "+nom+cognom);
        System.out.println("Edat: "+ edat);
        System.out.println("Major edat: "+majoredadsiono);
        System.out.println("Estudiant: "+estudiantsiono);

        Scanner1.close();
    }   
    
}
