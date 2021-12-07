package comunicacion;

public class Alfabeto extends Pictograma {
	private String[] letras;
	private String interpretacion;
	
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}

	//
	//methods
	//
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public int cantidadLetras() {
		return letras.length;
	}
	
	public String toString() {
		String answer= "";
		for(int i=1; i<=letras.length;i++) {
			if(i!=letras.length) {
				answer+=i+", ";
			}
			else {
				answer+=i;
			}
		}
		return answer;
	}

	//
	//getting and setting
	//
	public String[] getLetras() {
		return letras;
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	

}
