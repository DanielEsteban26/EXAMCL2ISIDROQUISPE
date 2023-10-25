package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassCrudUsuarioImp;

/**
 * Servlet implementation class servletInicio
 */
public class servletIni extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletIni() {
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
		ClassCrudUsuarioImp crud= new ClassCrudUsuarioImp();
		String usuario = request.getParameter("usuario");
		String contraseña = request.getParameter("contraseña");
          
		if(crud.ValidarUsuario(usuario, contraseña)){
			request.getRequestDispatcher("/RegistrarProducto.jsp").forward(request, response);
		}
		else{
			response.sendRedirect("/InicioSesion.jsp");
			
	}

	}
	}
