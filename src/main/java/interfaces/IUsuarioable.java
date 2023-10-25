package interfaces;

import java.util.List;

import model.TblUsuariocl2;

public interface IUsuarioable {

	public void RegitrarUsuario(TblUsuariocl2 tblusuario);
	public void ActualizarUsuario(TblUsuariocl2 tblusuario);
	public void EliminarUsuario(TblUsuariocl2 tblusuario);
	public List<TblUsuariocl2>ListadoUsuario();
	public TblUsuariocl2 BuscarUsuario(TblUsuariocl2 tblusuario);
    public Boolean ValidarUsuario(String usuario, String contraseña);
}
