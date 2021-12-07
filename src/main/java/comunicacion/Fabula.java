package comunicacion;

public class Fabula extends Escrito{
	
	private String ensenanza;
	private String interpretacion;
	
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	//
	//methods
	//
	
	public int palabrasTotales(int palabras) {
		return palabras*this.getPaginas()*1;
	}
	
	public String interpretacion(){
		return interpretacion;
	}
	
	public String toString() {
		String answer = this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" ;
		/*Object[] fields = this.getClass().getDeclaredFields();
		for(Object field: fields) {
			answer +=  field.toString() + "\n";
		}*/
		answer+= this.getEnsenanza(); 
		return answer;
	}

	//
	//methods
	//
	public String getEnsenanza() {
		return ensenanza;
	}
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	

}
