package atividade1303;

public class Substituindo {

	public static void main(String[] args) {
		String espacos = "ispaço";
		String corrigir = espacos.replace("i", "e");
		
		String todosEspacos="e s p a ç o";
		String tiraEspacos = todosEspacos.replaceAll(" ", "");
		
		System.out.println("Antes: " + espacos + " Depois: " + corrigir);
		System.out.println("Antes: " + todosEspacos +" Depois: " + tiraEspacos);

	}

}