import java.util.LinkedList;

public class main {

    public static void main(String[] args){
        LinkedList lista = new LinkedList();

        lista.add("Palabra");
        lista.add(5);
        lista.add(1,17);

        System.out.println("El tama;o de la lista es de: " + lista.size());
        System.out.println(lista.getFirst());

    }
}
