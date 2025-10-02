public class exerciciConstant9 {
    public static void main(String[] args) {
        //Si tenim tres variables A,B i C. Intercanviar els valors de la següent manera:
        //B pren del valor de A 
        //C pren el valor de B
        //A pren el valor de C.

        double valor1;
        double valor2;
        double valor3;
        double valor4;

        valor1 = 25;
        valor2 = 35;
        valor3 = 45;

        valor4 = valor2;
        valor2 = valor1;
        valor1 = valor3;
        valor3 = valor4;

        System.out.println("Valor1: "+valor1+" Valor2: "+valor2+" valor3: "+valor3);
    }
}
