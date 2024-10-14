package org.lessons.java.ciclabile;

public class Main {


	public static void main(String[] args) {
		
		//CREO ARREY DI NUMERI
		int[] numeri = {10, 20, 30, 40, 50};
		
		//CREO NUOVO ELENCO IN BASE AL COSTRUTTORE
        ElencoInteri nuovoElenco = new ElencoInteri(numeri);
        
        //CICLO WHILE PER CICLARE IL CONTENITORE
        while(nuovoElenco.hasAncoraElementi()) { //fino a quando ha ancora elementi
        	System.out.println(nuovoElenco.getElementoSuccessivo()); //stampa il metodo
        }
        
        
        if(nuovoElenco.getElementoSuccessivo() == -1) {
        	System.out.println("Non ci sono più elementi");//prova stampa -1
        }
	}
	
}
