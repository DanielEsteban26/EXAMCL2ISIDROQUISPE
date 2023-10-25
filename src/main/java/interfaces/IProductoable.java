package interfaces;
import java.util.List;

import model.TblProductocl2;

public interface IProductoable {
	
	public void RegitrarProducto(TblProductocl2 tblproducto);
	public void ActualizarProducto(TblProductocl2 tblproducto);
	public void EliminarProducto(TblProductocl2 tblproducto);
	public List<TblProductocl2>ListadoProducto();
	public TblProductocl2 BuscarProducto(TblProductocl2 tblproducto);

}
