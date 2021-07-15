
public class Perro extends Animal implements Mascota, Cuidados{

	String raza = "";
	String color = "";
	float peso = 0;
	
	public Perro (String nombre, int edad) {
		super(nombre, edad);
	}
	
	public String ladrar() {
		return "Guaf";
	}
	
	public String comer() {
		return "Comiendo croquetas";
	}

	@Override
	public String trucos() {
		// TODO Auto-generated method stub
		return "Dar la patita";
	}

	@Override
	public String premios() {
		// TODO Auto-generated method stub
		return "Recibir galletas";
	}

	@Override
	public String jugar() {
		// TODO Auto-generated method stub
		return "Jugando a la pelota";
	}

	@Override
	public String irAlVeterinario() {
		// TODO Auto-generated method stub
		return "Perro Saludable";
	}

	@Override
	public String paseo() {
		// TODO Auto-generated method stub
		return "Pasear al parque";
	}

	@Override
	public String banio() {
		// TODO Auto-generated method stub
		return "Baniarse";
	}
}
