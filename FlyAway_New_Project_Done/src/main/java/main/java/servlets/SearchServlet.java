package main.java.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import main.java.model.Search;

import java.io.PrintWriter;
import java.time.*;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SearchServlet extends HttpServlet {

    @Override
    public void service (HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Search.date_of_travel = req.getParameter("date_of_travel");
        Search.source_place = req.getParameter("source_place");
        Search.destination_place = req.getParameter("destination_place");
        Search.persons = Integer.parseInt(req.getParameter("persons"));

        if (Search.date_of_travel.equals("")) {
            PrintWriter out = resp.getWriter();
            out.println("Please enter Date");
        }
        else {
        	try {
            resp.sendRedirect("search-results.jsp");
        	} catch (Exception ex) {
        		 PrintWriter out = resp.getWriter();
                 out.println("Please enter a valid date");
        	}
        }
    }

}
