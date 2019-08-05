
package controller;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import dao.PesoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.peso;
@WebServlet(urlPatterns = "/peso")
public class Peso_Servlet extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Chamou GET ....");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("método post requisitado ....");
        
        PrintWriter resposta = resp.getWriter();
        
        Integer idpeso = Integer.parseInt(req.getParameter("idpeso"));
        Integer pesoCache = Integer.parseInt(req.getParameter("pesoCache"));
        Integer pesoArm = Integer.parseInt(req.getParameter("pesoArm"));
        Integer pesoBat = Integer.parseInt(req.getParameter("pesoBat"));
        Integer pesoRam = Integer.parseInt(req.getParameter("pesoRam"));
        Integer pesoMIPS = Integer.parseInt(req.getParameter("pesoMIPS"));
        Integer pesoCPU = Integer.parseInt(req.getParameter("pesoCPU"));
        String idcoletor = req.getParameter("idcoletor");
        
        peso p;
        p = new peso(idpeso ,pesoCache , pesoArm , pesoBat , pesoRam , pesoMIPS , pesoCPU ,idcoletor );
        
        boolean retorno = new PesoDAO().create(p);
        
        if(retorno){

            req.setAttribute("pesoCache", pesoCache);
            RequestDispatcher disp = req.getRequestDispatcher("coletor.jsp");
            disp.forward(req, resp);
           // resp.sendRedirect(req.getContextPath()+"/sucesso.html");
            
        }else{            
            resposta.println("<html><body><strong>ERRO</strong></body></html>");
        }
    }

}
