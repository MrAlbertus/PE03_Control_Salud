import java.util.Scanner;

public class principal {
    public static void main(String[] args){
        int valor1;
        int nombre1,nombre2;
        double decimalnumber;
        boolean married;
        char capitalletter;
        String name;
        //no podem definir variables amb caracters extranys.
        // int 1a;
        //int true; (true ja es una paraula reservada per java)

        //assignació de valors
        valor1 = 88;
        nombre1 = 99; nombre2 = 10;
        decimalnumber = 7.4; //no utilizar la coma
        capitalletter  = 'i'; //aixó no serveix /capitalletter = "i";
        married = true;
        name = "Albert";

        //operacións amb variables
        System.out.println("Resultat suma" + nombre1);
        boolean esMesGran = (decimalnumber>7);
        System.out.println("El nombre decimal es mes gran de 7?");

        //Comprovem que valor1 te un numero 50
        boolean esIgual = (valor1==50);
        System.out.println("La variable es 50?" + esIgual);

        //la variable valor 3 es més petita e igual a 0?
        boolean esMesPetitaIgualZero = (valor1<=0);
        System.out.println("la variable valor3 es més petita e igual a 0" + esMesPetitaIgualZero);

        //la variable valor3 es més petita o igual a 0?
        boolean esmespetitaoigualque = (valor3 <=0 || valor3 == 0);
        System.out.println("la variable3 es més metita o igual a 0" + esmespetitaoigualque);
}
}