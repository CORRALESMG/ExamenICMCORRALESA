package ui;

import java.util.List;
import java.util.Scanner;

import dol.Vehiculos;

public class VehiculosForm {
	private Scanner scan;
	private Vehiculos vehiculo;
	private List<Vehiculos> vehiculos;
	
	public VehiculosForm(Scanner scan) {
		super();
		this.scan = scan;
	}
	public VehiculosForm(Vehiculos vehiculo) {
		super();
		this.vehiculo = vehiculo;
	}
	
	public VehiculosForm(List<Vehiculos> vehiculos) {
		super();
		this.vehiculos = vehiculos;
	}
	

	
	public Vehiculos catchVehiculos() {
		Vehiculos b = new Vehiculos();
		System.out.println("Marca: ");
		scan.nextLine();
		b.setMarca(scan.nextLine());  
		
		System.out.println("Modelo: ");
		b.setModelo(scan.nextLine());
		
		return b;
	}
	
	
	public void showBook() {
		System.out.printf("Marca: %s\n", vehiculo.getMarca());
		System.out.printf("Modelo: %s\n", vehiculo.getModelo());
		System.out.printf("year: %s\n", vehiculo.getYear());
		System.out.printf("chasis: %s\n", vehiculo.getYear());

		}

		public void showBooks() {
		for(int i=0; i<vehiculos.size(); i++) {
			System.out.printf("%d | %s | %s\n", i+1, vehiculos.get(i).getMarca(), vehiculos.get(i).getModelo() );
		}
	
}
}















































/*public void showBook() {
System.out.printf("Marca: %s\n", book.getTitle());
System.out.printf("Modelo: %s\n", book.getAuthor());

}

public void showBooks() {
for(int i=0; i<books.size(); i++) {
	System.out.printf("%d | %s | %s\n", i+1, books.get(i).getTitle(), books.get(i).getAuthor());
}
}*/






