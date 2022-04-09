package semana1.Viernes;

class Animal2 {
 void eat(){
  System.out.println("comiendo..");
 }
}

class Dog extends Animal {
 void eat(){
  System.out.println("Comiendo croquetas");

 }
}

class Cachorro extends Animal {
 void eat(){
  //redefiniendo el comportamineto
  System.out.println("Tomando agua");
 }
}
public class Polimorfismo2 {
 //Ligaduras dinamicas
 public static void main(String[] args) {
  Animal dander;
  dander = new Animal();
  dander.eat();
  dander = new Dog();
  dander.eat();
  dander = new Cachorro();
  dander.eat();
 }
}
