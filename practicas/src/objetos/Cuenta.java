package objetos;

public class Cuenta {
    private static int totalCuentas = 0; //atributo estatico
    private int numCta;
    private String nomTitular;
    private double saldo = 0.0;

    public Cuenta(){
        numCta = ++totalCuentas; //Se incrementa la variable y luego se asigna
    }
    public  Cuenta(String  nom, double sal){
        this();
        nomTitular = nom;
        saldo = sal;
    }

    public String toString(){

        return "Titular: " + nomTitular + "\nNúmero de cuenta: " + numCta;
    }

    public static int getTotalCuentas() {
        return Cuenta.totalCuentas;
    }

}
