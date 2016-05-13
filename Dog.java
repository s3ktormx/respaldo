package herencia;

public class Dog extends Animal {
 public Dog(String nombre){
	 super(nombre);
	 System.out.println("Construyendo al perro"+nombre);
	 
	 
 }
	
	public void speak(){
		super.speak();
		System.out.println("Woof!!");
		System.out.println("El perro"+super.getNombre()+" esta ladrando");
		
	}
}
