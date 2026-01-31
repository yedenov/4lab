package org.example.demo1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/data")
public class DataServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        resp.setContentType("text/html; charset=UTF-8");

        resp.getWriter().println("<h2>GET request received</h2>");
        resp.getWriter().println("<p>Open form: <a href='form.html'>Go to form</a></p>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        String name = req.getParameter("name");
        String group = req.getParameter("group");   // второй параметр

        resp.setContentType("text/html; charset=UTF-8");

        resp.getWriter().println("<h2>POST request received</h2>");
        resp.getWriter().println("<p>Name: " + name + "</p>");
        resp.getWriter().println("<p>Group: " + group + "</p>");
    }
}