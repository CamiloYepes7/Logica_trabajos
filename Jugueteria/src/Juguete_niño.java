
public class Juguete_niño {
//atributos
       private String color;
	private int precio;
	 private double stock;
	
	 
	 
	 public Juguete_niño(String C, int p, double s) {
		System.out.print(" se creo un objeto juguete de niño");
		
	 }

	 public void revisar() {
		 System.out.print(" el juguete se ha revisado");	 
	 }
	public void empacado() {
		System.out.print(" el juguete se ha empacado");

		}
	
	
	public String getcolor() {
		return this.color;
		
	}
	
	public int getprecio() {
		return this.precio;
		
	}
	
	public double getstock() {
		return this.stock;
	}
	
	public void setcolor(String c){
		this.color = c;
	}
	
public void setprecio(int p) {
	this.precio = p;
	
}
	 public void setstock(double s) {
		 this.stock = s;
		 
	 }
}

		