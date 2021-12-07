package comunicacion;

import java.util.*;

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
		for(int i=0; i<letras.length;i++) {
			if(i!=letras.length-1) {
				answer+=Arrays.asList(letras).get(i)+", ";
			}
			else {
				answer+= Arrays.asList(letras).get(i);
			}
		}
		return answer;
	}
	
	/*
	public static void main(String[] args) {
		Alfabeto alfabeto = new Alfabeto("alfabeto griego, occidente",
				new String [] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"},
				"Alfabeto latino");
		System.out.print(alfabeto);
	}*/

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
