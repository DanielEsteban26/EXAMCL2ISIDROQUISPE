package TestEntidades;

import model.TblProductocl2;

import java.util.List;

import Dao.ClassCrudProductoImp;

public class testProducto {

	public static void main(String[] args) {
		TblProductocl2 pro= new TblProductocl2();
		ClassCrudProductoImp crud= new ClassCrudProductoImp();
		
		//REGISTRAR
		/*
		
		pro.setNombrecl2("pan");
		pro.setPrecioventacl2(5.50);
		pro.setPreciocompcl2(2.50);
		pro.setEstadocl2("caducado");
		pro.setDescripcl2("limitado");
        crud.RegitrarProducto(pro);
        */
		
		//LISTAR
		
		 List<TblProductocl2> listar= crud.ListadoProducto();
		    for(TblProductocl2 lis:listar){
		    	System.out.println("\n" + "codigo : " + lis.getIdproductocl2() + "\n"+
		                                  "nombre : " + lis.getNombrecl2() + "\n"+
		    			                  "precio Venta : " + lis.getPrecioventacl2() + "\n"+
		                                  "precio Compra : " + lis.getPreciocompcl2() + "\n"+
		    			                  "Estado : " + lis.getEstadocl2() + "\n"+
		                                  "Descripcion : " + lis.getDescripcl2() + "\n" + "\n"    
		    			);
		    
		   }
		   
	}

}
