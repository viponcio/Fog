
package controller;

import dao.ColetorDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.coletor;


@WebServlet(urlPatterns = "/coletor")
public class Coletor_Servlet extends HttpServlet{
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Chamou GET ....");

    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("método post requisitad....");   
        PrintWriter resposta = resp.getWriter();
        
        String nomeFog= req.getParameter("nomeFog");
        String CPU = req.getParameter("CPU");
        String MIPS = req.getParameter("MIPS");
        String RAM = req.getParameter("RAM");
        String BAT = req.getParameter("BAT");
        String CORE = req.getParameter("CORE");
        String DISC = req.getParameter("DISC");
        String CACHE = req.getParameter("CACHE");
                                    
        System.out.println("nomeFog:"+nomeFog);
        System.out.println("CPU:"+CPU);
        System.out.println("MIPS:"+MIPS);
        System.out.println("RAM:"+RAM);
        System.out.println("BAT:"+BAT);
        System.out.println("CORE:"+CORE);
        System.out.println("DISC:"+DISC);
        System.out.println("CACHE:"+CACHE);
                
        coletor Coletor = new coletor(nomeFog,CPU,MIPS,RAM,BAT,CORE,DISC,CACHE);
        boolean retorno = new ColetorDAO().create(Coletor);

        if(retorno){
            req.setAttribute("mensagem", Coletor);
            RequestDispatcher disp = req.getRequestDispatcher("coletor.jsp");
            disp.forward(req, resp);
        }else{
            resposta.println("<html><body><strong>ERRO</strong></body></html>");
        }
        
    }
}
