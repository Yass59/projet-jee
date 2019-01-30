package fr.roudane.jee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class remboursement
 */
public class remboursement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public remboursement() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// les paramètres de la reqête.

				String nom = 

					request.getParameter("nom");

				System.out.println("Nom: " + nom);

				String prenom = 

					request.getParameter("prenom");

				String sommeString = 

					request.getParameter("somme");

				// transformer une chaine de caractères en double

				double somme = 

					Double.parseDouble(sommeString);

				

					

				String date = 

					request.getParameter("date");

				// Transmettre les variables à la JSP

				request.setAttribute("nom", nom);

				request.setAttribute("prenom", prenom);

				request.setAttribute("somme", somme);

				request.setAttribute("dateRemboursement", date);

				

				this.getServletContext()

				.getRequestDispatcher("/WEB-INF/remboursement.jsp")

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
