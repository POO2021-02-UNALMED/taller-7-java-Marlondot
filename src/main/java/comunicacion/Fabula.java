package comunicacion;

public class Fabula extends Escrito{
	
	private String ense�anza;
	private String interpretacion;
	
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ense�anza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ense�anza = ense�anza;
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
		answer+= this.getEnse�anza(); 
		return answer;
	}

	//
	//methods
	//
	public String getEnse�anza() {
		return ense�anza;
	}
	public void setEnse�anza(String ense�anza) {
		this.ense�anza = ense�anza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	

}
