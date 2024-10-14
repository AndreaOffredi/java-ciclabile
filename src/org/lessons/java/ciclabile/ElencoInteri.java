package org.lessons.java.ciclabile;

public class ElencoInteri {

	//CREO ARRAY E VARIABILE INDICE
	public int[] elenco;
	private int indiceElenco;

	//CREO COSTRUTTORE CON RICHIESTA PARAMETRI
	public ElencoInteri(int[] elenco) {
		this.elenco = elenco;
		this.indiceElenco = 0; //parte dalla posizione 0
	}
	
	//CREO METODO VERIFICA ELENCO
	public boolean hasAncoraElementi() {
		return indiceElenco < elenco.length; //ritornami TRUE
	}
	
	//CREO METODO PER RESTITUIRE ELEMENTO
	public int getElementoSuccessivo() {
		if(hasAncoraElementi()) {
			return elenco[indiceElenco++];
		}else {
			return -1;
		}
	}
}
