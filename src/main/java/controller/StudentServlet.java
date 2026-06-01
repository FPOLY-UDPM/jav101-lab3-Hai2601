package controller;

import dao.StudentDAO;
import model.Student;

import java.servlet.*;
import java.servlet.http.*;
import java.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/students")
public class StudentServlet extends HttpServlet {

    private StudentDAO dao = new StudentDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        List<Student> list = dao.findAll();

        req.setAttribute("students", list);
        req.getRequestDispatcher("student-list.jsp").forward(req, resp);
    }
}
