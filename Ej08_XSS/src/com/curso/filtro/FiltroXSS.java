package com.curso.filtro;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
//El objetivo de este filtro sería sanear los parametros de entrada

@WebFilter("/SVPeliculas")
public class FiltroXSS implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		System.out.println("FiltroXSS");
		HttpServletRequest rq = (HttpServletRequest) request;
		XSSRequestWrapper xssRq = new XSSRequestWrapper(rq);
		chain.doFilter(xssRq, response);
	}

}







