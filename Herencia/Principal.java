
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Animal animal = new Animal();
		//System.out.println("Super clase: " + animal.comer());
		
		Perro canelo = new Perro("Canelo", 3);
		System.out.println(canelo.ladrar());
		System.out.println(canelo.comer());
		System.out.println(canelo.nombre);
		System.out.println(canelo.edad);
		
		Gato pulgas = new Gato("Bigotes", 2 , "naranja");
		System.out.println(pulgas.comer());
	}
}
