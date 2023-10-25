package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassCrudProductoImp;
import model.TblProductocl2;

/**
 * Servlet implementation class servletPro
 */
public class servletPro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletPro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("nombre");
		double precioVe = Double.parseDouble(request.getParameter("precioVe"));
		double precioCo = Double.parseDouble(request.getParameter("precioCo"));
		String estado = request.getParameter("estado");
		String descrip = request.getParameter("descripcion");
		
		TblProductocl2 prod = new TblProductocl2();
		ClassCrudProductoImp crud= new ClassCrudProductoImp();
		
		prod.setNombrecl2(nombre);
		prod.setPrecioventacl2(precioVe);
		prod.setPreciocompcl2(precioCo);
		prod.setEstadocl2(estado);
		prod.setDescripcl2(descrip);
		
		crud.RegitrarProducto(prod);
		List<TblProductocl2> listar = crud.ListadoProducto();
		request.setAttribute("list", listar);
		request.getRequestDispatcher("/RegistrarProducto.jsp").forward(request, response);
	}

}
