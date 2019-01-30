package fr.roudane.jee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExoChiffre
 */
public class ExoChiffre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExoChiffre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nombreSTring = 

			request.getParameter("nombre");

		int nombre =

			Integer.parseInt(nombreSTring);

		

		String modSTring = 

			request.getParameter("mod");

		int mod = 

			Integer.parseInt(modSTring);

		

		request.setAttribute("nombre", nombre);

		request.setAttribute("mod", mod);

		

		this.getServletContext()

		.getRequestDispatcher("/WEB-INF/exo-chiffres.jsp")

		.forward(request, response);

	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
