package servlet;

import entity.Student;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import service.studentService;
import service.studentServiceImpl;

import java.io.IOException;

@WebServlet(name = "addServlet", value = "/add")
public class addServlet extends HttpServlet {
    studentService service = new studentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student student=new Student();
        student.setlName("ahmed");
        student.setfName("slim");
        service.add(student);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
