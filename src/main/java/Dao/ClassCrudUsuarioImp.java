package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import interfaces.IUsuarioable;
import model.TblUsuariocl2;

public class ClassCrudUsuarioImp implements IUsuarioable{

	@Override
	public void RegitrarUsuario(TblUsuariocl2 tblusuario) {
		EntityManagerFactory conex = Persistence.createEntityManagerFactory("BDisidro");
		EntityManager eman= conex.createEntityManager();
		eman.getTransaction().begin();
		eman.persist(tblusuario);
		eman.getTransaction().commit();
		eman.close();
		
	}

	@Override
	public void ActualizarUsuario(TblUsuariocl2 tblusuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarUsuario(TblUsuariocl2 tblusuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TblUsuariocl2> ListadoUsuario() {
		
		EntityManagerFactory conex = Persistence.createEntityManagerFactory("BDisidro");
		EntityManager eman= conex.createEntityManager();
		eman.getTransaction().begin();
		List<TblUsuariocl2> listado = eman.createQuery("select u from TblUsuariocl2 u", TblUsuariocl2.class).getResultList();
		eman.getTransaction().commit();
		eman.close();
		return listado;
	}

	@Override
	public TblUsuariocl2 BuscarUsuario(TblUsuariocl2 tblusuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean ValidarUsuario(String usuario, String contraseña) {
		
		EntityManagerFactory conex = Persistence.createEntityManagerFactory("BDisidro");
		EntityManager eman= conex.createEntityManager();
		Query consul = eman.createQuery("select u from TblUsuariocl2 u where u.usuariocl2=:y and u.passwordcl2=:z",TblUsuariocl2.class);
		         
		      consul.setParameter("y", usuario);
		      consul.setParameter("z", contraseña);
		      List<TblUsuariocl2> ing= consul.getResultList();
		
		return !ing.isEmpty();
	}
	

}
