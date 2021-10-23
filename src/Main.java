import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Caneta c = new Caneta();
        Scanner sc = new Scanner (System.in);

        c.setMarca("Faber Castell\n");
        //metodo que informa a marca
        System.out.println(c.getMarca());

        c.setCor("Preta\n");
        //metodo que informa a cor
        System.out.println(c.getCor());

        c.setValor(5);
        //metodo que informa valor
        System.out.println(c.getValor());
        System.out.println("Reais: ");



    }
}
