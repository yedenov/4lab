package org.example.demo1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/info")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        String name = "Ислам Еденов";   // ← впиши свои данные
        String group = "ИС-21";         // ← впиши свою группу
        String date = LocalDate.now().toString();

        resp.getWriter().println("<h1>Ақпарат</h1>");
        resp.getWriter().println("<p>Аты-жөні: " + name + "</p>");
        resp.getWriter().println("<p>Тобы: " + group + "</p>");
        resp.getWriter().println("<p>Күні: " + date + "</p>");
    }
}
