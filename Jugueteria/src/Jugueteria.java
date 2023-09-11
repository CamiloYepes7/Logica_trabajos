
public class Jugueteria {

	public static void main(String[] args) {
		System.out.print("inicio de programa");	
		
		Juguete_niño carro = new Juguete_niño("rojo", 5000, 50);
		
		carro.revisar();
		carro.empacado();
		
	carro.setcolor("rojo");
carro.setprecio(5000);
carro.setstock(50);

System.out.println("el juguete tipo carro es de color: " + carro.getcolor());
System.out.println("el juguete tipo carro tiene precio de: " + carro.getprecio());
System.out.println("el stock del juguete tipo carro es: " + carro.getstock());


Juguete_niña barbie = new Juguete_niña("vestido", 10000, 80);

barbie.agaccesorio();
barbie.empacado();

barbie.setaccesorio("vestido");
barbie.setprecio(10000);
barbie.setstock(80);

System.out.println(" elaccesorio del juguete tipo barbie es: " + barbie.getaccesorio());
System.out.println("el juguete tipo barbie tiene pecio de: " + barbie.getprecio());
System.out.println("el stock del juguete tipo barbie es: " + barbie.getstock());












	 
		
		
		
	
		
			
		
				
		
		
		
		
		

	}

}
