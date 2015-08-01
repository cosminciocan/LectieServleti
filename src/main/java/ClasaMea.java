
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


public class ClasaMea extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out =resp.getWriter();

        String sNr1=req.getParameter("nr1");
        String sNr2=req.getParameter("nr2");

        int nr1=Integer.parseInt(sNr1);
        int nr2=Integer.parseInt(sNr2);
        int suma = nr1+nr2;



        out.println("<html>");
        out.println("<head>");
        out.println("<title>Calcul Suma</title>");
        out.println("</head>");

        out.println("<body>");


        out.println("suma este:<b>"+suma+"</b>");

        out.close();



        out.println("</body>");
    }
}