package Program;

public class Proceso  {
	
	private int Id;
	private String Tipo;
	private int CantPasos;
	private String Nombre;
	
	public Proceso () {
		
	}
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public int getCantPasos() {
		return CantPasos;
	}
	public void setCantPasos(int cantPasos) {
		CantPasos = cantPasos;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

}
