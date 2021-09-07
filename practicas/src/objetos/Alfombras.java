package objetos;

public class Alfombras {
    public static void main(String[] args){
        Rectangulo alfom1, alfom2, piso;
        double areaCub, areaDescub;

        //instancia de los objetos usando el constructor con parametros
        alfom1 = new Rectangulo(3.8,  4.6);
        alfom2 = new Rectangulo(4.5,2.3);
        piso = new Rectangulo(7.0, 6.5);

        //Uso del metodo de la clase Rectangulo para calcular area
        areaCub = alfom1.calculaArea() + alfom2.calculaArea(); //Area Cubierta
        areaDescub = piso.calculaArea() - areaCub; //Area sin cubrir

        System.out.println("\nArea del salon cubierta con alfombras " + areaCub+" m2");
        System.out.println("\nArea del salon sin cubrir con alfombras " + areaDescub+" m2");
    }
}
