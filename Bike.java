package semana1.Viernes;

/*
Overload: Sobrecarga
Override: Redefine
Overwrite: Sobreescribe
 */

public class Bike {
    //SobreCarga
    private int velocidad;
    private String color, marca;

    //Constructor por omision
    public Bike() {     }

    //Sobrecargar el constructor en otro caso que lo podemos utilizar
    public Bike(String color) {this.color =  color; }

    //Sobrecargar 2 el constructor en otro caso que lo podemos utilizar

    public Bike()(String color, int velocidad){
        this.velocidad = velocidad;
        this.color = color;
    }

    public Bike()(String color, String marca,  int velocidad){
        this.velocidad = velocidad;
          public Bike()(String color, int velocidad){
            this.velocidad = velocidad;
            this.color = color;
            this.marca = marca;
        }

        public int getVelocidad(){ return velocidad; }
        public String getColor(){ return color; }
        public String getMarca(){ return marca; }

    }
}
