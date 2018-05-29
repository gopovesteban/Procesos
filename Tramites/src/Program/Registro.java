package Program;

public class Registro {
	
	private int Id;
	private String Tipo;
	private String Input;
	private int IdPaso;
	private int IdUsuario;
	
	public Registro() {
		
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

	public String getInput() {
		return Input;
	}

	public void setInput(String input) {
		Input = input;
	}

	public int getIdPaso() {
		return IdPaso;
	}

	public void setIdPaso(int idPaso) {
		IdPaso = idPaso;
	}

	public int getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}
}
