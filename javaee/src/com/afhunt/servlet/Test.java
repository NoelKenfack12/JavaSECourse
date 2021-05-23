package com.afhunt.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.afhunt.beans.Auteur;
import com.afhunt.db.Auteurrepository;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//String name = request.getParameter("name");
        //request.setAttribute("name", name);
        
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");

        Auteur auteur = new Auteur(nom, prenom, true);
        
        request.setAttribute("auteur", auteur);
        
        String[] noms = {"Mathieu", "Robert", "François"};
        request.setAttribute("noms", noms);
        
        Auteurrepository auteurs = new Auteurrepository();
        request.setAttribute("auteurs", auteurs.recupererUtilisateurs());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");

		Auteurrepository auteurs = new Auteurrepository();
		
        Auteur auteur = new Auteur(nom, prenom, true);
        auteurs.ajouterUtilisateur(auteur);
        request.setAttribute("auteur", auteur);
        request.setAttribute("auteurs", auteurs.recupererUtilisateurs());
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
	}

}
