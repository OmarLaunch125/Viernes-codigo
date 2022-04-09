package semana1.Viernes;

class Animal{
    //Caso1
    String color = "Blanco";

    //Caso 2
    //Metodo eat para redefinir instancias
    void eat  (){
        System.out.println("Comiendo..");
    }

    //Caso 3
    Animal(){
        System.out.println("Se crea un animal");

    }
}


class   Gato extends Animal {
    //Caso1
    String color = "Cafe";
    void printColor (){
        System.out.println("Color de la clase Gato:"+color);
        System.out.println("Color de la clase Animal:"+super.color);

    }

    void eat(){
        System.out.println("Come atún");
    }

    void call(){
        super.eat();
        dormir();
    }

    Gato(){
    super();
        System.out.println("Se ha creado un gato");
    }
}


public class SuperTest {
    public static void main(String[] args) {
        //Objetos anónimos
        //Caso1
       // new Gato().printColor();

        //Caso2
        //new Gato().call();

        //Caso 3 Objeto anonimos
        new Gato();
    }
}
