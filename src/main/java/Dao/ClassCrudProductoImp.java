package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IProductoable;
import model.TblProductocl2;

public class ClassCrudProductoImp implements IProductoable{

	@Override
	public void RegitrarProducto(TblProductocl2 tblproducto) {
		EntityManagerFactory conex= Persistence.createEntityManagerFactory("BDisidro");
		EntityManager eman= conex.createEntityManager();
		eman.getTransaction().begin();
		eman.persist(tblproducto);
		eman.getTransaction().commit();
		eman.close();
	}

	@Override
	public void ActualizarProducto(TblProductocl2 tblproducto) {
		
	}

	@Override
	public void EliminarProducto(TblProductocl2 tblproducto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TblProductocl2> ListadoProducto() {
		EntityManagerFactory conex= Persistence.createEntityManagerFactory("BDisidro");
		EntityManager eman= conex.createEntityManager();
		eman.getTransaction().begin();
		List<TblProductocl2> listado= eman.createQuery("select p from TblProductocl2 p",TblProductocl2.class).getResultList();
		eman.getTransaction().commit();
		eman.close();
	    return listado;
	}

	@Override
	public TblProductocl2 BuscarProducto(TblProductocl2 tblproducto) {
		// TODO Auto-generated method stub
		return null;
	}

}
