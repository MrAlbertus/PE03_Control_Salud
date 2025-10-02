import java.util.Scanner;

public class menuswitch {
    public static void main(String[] args) {
        
    String opcio;
    String opcioa;
    String opciob;
    String opcioc;

    Scanner Scanner1 = new Scanner(System.in);

    opcioa = "Has impres la opció A";
    opciob = "Has impres la opció B";
    opcioc = "Has impres la opcio C";
    
    System.out.println("Escolleix una opció: A, B, C : ");

    opcio = Scanner1.next();

    switch (opcio) {
        case "A":
            System.out.println(opcioa);
            break;
        
        case "B":
            System.out.println(opciob);
            break;
    
        case "C":
            System.out.println(opcioc);
            break;

        default:
            System.out.println("No has selecionat ni el A, B, C.");
            break;
    }

    Scanner1.close();



    }
}
