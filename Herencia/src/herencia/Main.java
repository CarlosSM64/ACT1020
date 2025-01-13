package herencia;

public class Main {

	public static void main(String[] args) {
		
		Hijas obj1 = new Hijas("Melina","093892128","No");
		Hijas2 obj2 = new Hijas2("Paula","093892939","Si");
		
		Padre obj = new Padre("José","Activa","30000$","2 hijas");
		obj.mostrar("");
		obj.mostrar("Confidencial");
	}

}
