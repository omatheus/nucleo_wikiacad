
package br.gov.sp.cps.fmc.wikiacad2wsx.web.eventos;




import br.gov.sp.cps.fmc.wikiacad2wsx.web.eventos.estrutura.WA2WSXagent;
import br.gov.sp.cps.fmc.wikiacad2wsx.web.eventos.estrutura.adendo.WA2WSXagentPadroes;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet(name = "WA2ReqConSelecionado", urlPatterns =
    {
    "/wa2reqconselecionado"
    })
public
      class WA2ReqConSelecionado extends HttpServlet
    {




    private static final
          WA2WSXagent agent = new WA2WSXagent();


    protected
          void WA2ReqConSelecionado(HttpServletRequest request,
                                    HttpServletResponse response)
          throws ServletException, IOException
        {

        
        response.setContentType("text/html;charset=UTF-8");

        final
              StringBuffer indagacao = new StringBuffer();

        agent.requisicaoLocal(WA2WSXagentPadroes.OPERACAO_SELECIONAR_PUBLICACOES,
              indagacao);

        
        request.setAttribute("wa2revista", indagacao.toString());
        request.getRequestDispatcher("bemvindo.jsp").forward(request, response);
        
        
        //response.getWriter().print(indagacao.toString() + "<br>");


        }


    @Override
    protected
          void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException
        {
        WA2ReqConSelecionado(request, response);
        }




    @Override
    public
          String getServletInfo()
        {
        return "DESCRICAO";
        }


    }



