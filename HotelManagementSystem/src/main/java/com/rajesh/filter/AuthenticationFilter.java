package com.rajesh.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter("/AuthenticationFilter")
public class AuthenticationFilter implements Filter {

    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if ("admin".equals(username) && "123".equals(password)) {

            chain.doFilter(request, response);

        } else {

            response.getWriter().println("Invalid Username or Password");
        }
    }
}
