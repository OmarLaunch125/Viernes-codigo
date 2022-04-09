package semana1.Viernes;

//Clase empleado de base
public class Empleado {
    double  salario = 40000;
}

// Herencia simple Emplelado programador
//Puedo tener una clase programador que viene de empleado
class Programador extends Empleado {
    int bono = 1000;

    //Misma asignatura y valor de retorno
    //Redefiniendo metodo Main que no existe
    public void main(){
        //Programador omar del objeto programador
        Programador omar = new programador();
        System.out.println("El salario de el programador es"+
                omar.salario);
        System.out.println("El bono del programador es:+" +
                omar.bono);
    }

    //Mensaje
    void mensaje(){
        System.out.println("Soy programador");
        main();
    }
    // Herencia Multi nivel Empleado , programador , web

    // Herencia Gerargica Empleado a Programador y/o web

    class Web extends Programador {
        public static void main(String[] args) {
            Web w = new Web();
            w.mensaje();
        }
    }
}

//Herencia simple de Empleado a Programador  con salario base

//Clase Programador salario base + bono

//Al usar la palabra extends ya trae el salario.

