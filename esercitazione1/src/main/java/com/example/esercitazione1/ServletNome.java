package com.example.esercitazione1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletName", value = "/Servlet")
public class ServletNome extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String nome = "roberto" ;
    String path = "nome.jsp";
    request.setAttribute("VariabileNome",nome);
    RequestDispatcher pagina = request.getRequestDispatcher(path);
    pagina.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
