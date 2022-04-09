package semana1.Viernes;

//Clase Maestra  y Constructor son el modelado de nuestro objeto principal
//Clase Maestra
class Persona {
 int id;
 String nombre;

 //Constructor de la clase
 Persona (int id , String nombre){
     this.id = id;
     this.nombre = nombre;
 }
}

public class Emp extends Persona{
    double salario;

    //Preedefinir un constructor

    Emp(int id, String nombre, double salario){
        super(id, nombre);
        this.salario = salario;

    }
    void display (){
        System.out.println(id+" "+nombre+ " "+ salario);
    }

    class TestPersonaEmpleado{
        public static void main(String[] args) {
            Emp e = Emp(1,"Omar",salario: 4550.32);
            e.display();
        }
}
