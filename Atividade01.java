package atividade1303;

public class Atividade01 {

	public static void main(String[] args) {
		String fraseErr = "Tedro Tescava Teixes no Tier.";
		String fraseCor = fraseErr.replaceAll("T", "P");
		
		System.out.println("Frase errada: " + fraseErr );
		System.out.println("Frase correta: " + fraseCor );

	}

}