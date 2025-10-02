public class exerciciConstant8 {
    public static void main(String[] args) {
        //Intercanviar els valors de dues variables prèviament introduïdes.

        double valor1;
        double valor2;
        double valor3;

        valor1 = 25;
        valor2 = 10;

        System.out.println("Introdueix la variable A: ");
        System.out.println("Introdueix la variable B: ");

        valor3 = valor1;
        valor1 = valor2;
        valor2 = valor3;

        System.out.println("Valor1: " + valor1 + " Valor2: " + valor2);



    }
    
}
