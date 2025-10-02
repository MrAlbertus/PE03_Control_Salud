public class exercici3 {
    public static void main(String[] args) {
    boolean tard;
    boolean plou;
    boolean vaga;
    boolean tren;

    plou = true;
    vaga = false;
    tren = true;
    tard = (plou || vaga) && tren;

    System.out.println("Arribaré tard a classe? " + tard);
    }
    
}
