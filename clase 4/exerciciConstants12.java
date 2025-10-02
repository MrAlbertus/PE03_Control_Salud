import java.util.Scanner;
public class exerciciConstants12 {
    public static void main(String[] args) {
    
        int c1, c2;

        System.out.println("Digues el numero de 'c1': ");
        Scanner Scanner1 = new Scanner(System.in);

        c1 = Scanner1.nextInt();

        System.out.println("Digues el numero de 'c2': ");
        c2 = Scanner1.nextInt();

        if (c1 >=1 && c1 <=10) { //MAL, TIENES QUE PONER QUE SI NO ESTA ENTRE 1-10 IMPRIMA -1
            System.out.println("-1");
            if (c1 == c2) {
                System.out.println("0");
            }
            
        }

        
        
        
}
}