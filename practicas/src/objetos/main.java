package objetos;

public class main {

    public static void main(String[] args){

        //Metodos staticos
        Cuenta cuenta = new Cuenta("nietsnie", 2000);
        Cuenta cuenta2 = new Cuenta("nietsnie", 2000);

        System.out.println(Cuenta.getTotalCuentas());
    }
}
