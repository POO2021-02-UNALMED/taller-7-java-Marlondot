package comunicacion;

public class Fabula extends Escrito{
	
	private String enseñanza;
	private String interpretacion;
	
	
	public Fabula(String origen, String titulo, String autor, int paginas, String enseñanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.enseñanza = enseñanza;
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
		answer+= this.getEnseñanza(); 
		return answer;
	}

	//
	//methods
	//
	public String getEnseñanza() {
		return enseñanza;
	}
	public void setEnseñanza(String enseñanza) {
		this.enseñanza = enseñanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	

}
