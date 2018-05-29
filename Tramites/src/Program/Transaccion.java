package Program;
import java.util.Date;

public class Transaccion {
	
	private int Id;
	private Date Fecha;
	private String Estado;
	private int IdProceso;
	private int IdUsuario;
	
	public Transaccion() {
		
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public int getIdProceso() {
		return IdProceso;
	}
	public void setIdProceso(int idProceso) {
		IdProceso = idProceso;
	}
	public int getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}

}
