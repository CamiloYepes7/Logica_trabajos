
public class Juguete_niña {
	
private String accesorio;
private int precio;
private double stock;

public Juguete_niña(String ac, int pre, double st) {
	System.out.print(" se creo un objeto juguete de niña");

	
}
	 public void agaccesorio() {
		 System.out.print(" al juguete se le ha agregado su accesorio");	 
	 }
	public void empacado() {
		System.out.print(" el juguete se ha empacado con su accesorio");
		
}
	
	public String getaccesorio() {
		return this.accesorio;
		
	}
	
	public int getprecio() {
		return this.precio;
		
	}
	
	public double getstock() {
		return this.stock;
	}
	
	public void setaccesorio(String ac){
		this.accesorio = ac;
	}
	
public void setprecio(int pre) {
	this.precio = pre;
	
}
	 public void setstock(double st) {
		 this.stock = st;
		 
		 
	 }

}


	





