package semana1.Viernes;


//Clase A
class Bike2 {
    void rur(){
        System.out.println("runing..");
    }
}

//Sobrecarga de metodos sabes que bicicleta, vas a ser de tipo bici2 , construye con lo que hay abajo


//Clase B, que viene de clase A

//Clase Hija
public class Polimorfismo extends Bike2{
    //Ligadura dinamica
@Override
    void run(){
    System.out.println("Ruuning safely with 60miles per hour");
}

    public static void main(String[] args) {
    //Ligadura dinamica
        Bike2 bike2 = new Polimorfismo();
        bike.run();
    }
}
