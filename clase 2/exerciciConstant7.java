import java.util.Scanner;

public class exerciciConstant7 {
    public static void main(String[] args) {
        //Introduir els anys d’una persona i obtenir l’equivalent en dies i segons.
        int anys;
        float dies;
        float segons;

        Scanner Scanner1 = new Scanner(System.in);
        System.out.println("Introdueix els teus anys: ");
        anys = Scanner1.nextInt();

        dies = anys * 360;
        segons = dies * 86400;

        System.out.println("Tens " + anys + " anys. " + dies + " Dies. " + segons + " segons." );

        Scanner1.close();
    }
    
}
