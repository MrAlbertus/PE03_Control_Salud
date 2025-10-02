import java.util.Scanner;

public class PE02_FloriachAlbert {
    public static void main(String[] args) {

        boolean clasesball;
        String desempatarantiga;
        String accio2;
        String accio1 = "";

        Scanner Scanner1 = new Scanner(System.in);
        
        System.out.println("Tot comença quan eres petit.. Estaves jugant al parc amb els teus amics quan la teva mare, sense sentit et pregunta: Vols fer classes de ball? (si o no) : ");
        clasesball = Scanner1.next().equals("si");

        System.out.println("\n");


        System.out.println("Pasen els anys, et tornes polític ja que el teu pare et va introduïr a l'industria i, no mentirem, es guanya molt!. Ara ets al parlament, que son les eleccións.");
        System.out.println("Les votacións han sigut molt igualades entre Tu i el señor Pepe Sanchez.");
        
        System.out.println("Pepe Sanchez et mira furiosament i et exigeix desempatar-ho a l'antiga. Acceptes? (si / no) :");
        desempatarantiga = Scanner1.next();



        if (desempatarantiga.equals("si")) {
            
            System.out.println("\n");


            System.out.println("Veus que el Pepe Sanchez que desesperadament es puja assobre la taula i comença a ballar reagueton. Quan acaba et senyala ");
            
            System.out.println("Que fás? Et pujes a la taula i respons fent uns pasos de ball: ");
            System.out.println("o");
            System.out.println("Et quedes sentat anonedat uns segons i preguntes, 'que fa?' (ballar/seure) :");
            accio1=Scanner1.next();
            if(accio1.equals("ballar")){
                
                System.out.println("\n");


                System.out.println("Et pujes a la taula e intentes respondre fent uns pasos de ball");}
            

                if (accio1.equals("ballar") && clasesball == true) {
                    System.out.println("Balles Breakdance i ets sorprenent, el deixes amb la boca oberta");
                    
                    System.out.println("En Pepe Sanchez et mira i mentre s'apropa t'intenta donar la má: (donar ma / no donar) : ");
                    Scanner1.nextLine();

                    accio2 = Scanner1.nextLine();


                    System.out.println("\n");


                    if (accio2.equals("donar ma")) {
                
                System.out.println("\n");
                

                    System.out.println("Et mira mentre sonriu i.. El parlament explota.");
            }
            else if (accio2.equals("no donar")) {
                
                System.out.println("\n");

                        System.out.println("Es sorprén de que hagis vist la seva trampa i et proclama nou president.");
                        System.out.println("(Good Ending ^^)");
                        
                    }
            else if (accio1.equals("ballar") && clasesball == false) {
                
                System.out.println("\n");

                System.out.println("Intentes ballar, però al no saber ballar et puges a la taula i caus, rebotant amb totes les escales i mors.");
                    
                    
                }
                }
                

            }
            else if (accio1.equals("seure")) {
                
                System.out.println("\n");

                System.out.println("Et miren tots i al cap de 3 segons explota tot el parlament");
                System.out.println("(Bad Ending)");
            } 
                
            
        else if (desempatarantiga.equals("no")) {
            
            System.out.println("\n");


            System.out.println("Els diputats del parlament de Catalunya et miren malament per no acceptar. Acabes sota un pont sense diners");
            System.out.println("(Bad Ending)");
        }
    Scanner1.close();
}}
