package objetos;

public class Rectangulo {
    private double base;
    private double altura;

    //constructor por omision. Los atributos toman los valores dados por omision

    public Rectangulo(){
        base = 0.0;
        altura= 0.0;
    }

    //constructor por parametros toman los valores de los atributos
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    //calcula el area del teclado
    public double calculaArea(){
        return base * altura;
    }

    //calcula el perimetro de un rectangulo
    public double calculaPerimetro(){
        return 2 * (base + altura);
    }
}
