package com.curso.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.curso.modelo.entidad.Usuario;

@WebServlet("/SVInyeccionHibernate")
public class _04_SVInyeccionHibernate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private SessionFactory sf;
	
    public _04_SVInyeccionHibernate() {
        super();
    }

    public void init(){
    	//creamos la factoria de sessiones de hibernate para hacer el acceso a bd
	    Configuration configuration = new Configuration();
	    configuration.configure("com/curso/persistencia/cfg/hibernate.cfg.xml");
	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
	    		.applySettings(configuration.getProperties())
	    		.buildServiceRegistry();        
	    sf = configuration.buildSessionFactory(serviceRegistry);		
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String login = request.getParameter("login");
		String pw    = request.getParameter("pw");

		Session s = sf.openSession();
		
		//Aunque utilicemos frameworks apliamente utilizados como hibernate, debemos de tener igual
		//cuidado con las inyecciones
		//Este ejemplo, aunque por debajo hibernate use prepared statement, en este caso no lo estamos
		//usando, por lo que seguiria siendo un coladero
		List<Usuario> rs = 
			s.createQuery("select u from Usuario u where u.login='"+login+"' and pw='"+pw+"'").list();
		
		//deberemos de usar algo así, que seria el equivalente a prepared statement en hibernate
		//Query q = s.createQuery("from Usuario u where u.login=:login and pw=:pw");
		//q.setParameter("login", login);
		//q.setParameter("pw", pw);
		//List<Usuario> rs = q.list();		
		
		if(rs.size()>0){
			response.sendRedirect("inicio.html");
		} else {
			response.sendRedirect("04_loginInyeccionHibernate.html");
		}			
			
		
		s.close();
		
	}

}












