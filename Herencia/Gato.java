
public class Gato extends Animal implements Mascota, Cuidados{
	int num_bigotes;
	String color;
	int vidas_disponibles = 9;
	
	public Gato(String nombre, int edad, String color) {
		super(nombre, edad);
		this.color = color;
	}
	
	@Override
	public String comer() {
		return "Comiendo atun";
	}
	
	public String dormir() {
		return "Zzzzzzz";
	}

	@Override
	public String trucos() {
		// TODO Auto-generated method stub
		return "Caer de pie";
	}

	@Override
	public String premios() {
		// TODO Auto-generated method stub
		return "Bola de estambre";
	}

	@Override
	public String jugar() {
		// TODO Auto-generated method stub
		return "Jugar con el laser";
	}

	@Override
	public String irAlVeterinario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String paseo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String banio() {
		// TODO Auto-generated method stub
		return null;
	}

}
