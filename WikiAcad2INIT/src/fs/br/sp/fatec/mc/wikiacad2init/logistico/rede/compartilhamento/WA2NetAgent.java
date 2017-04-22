
package fs.br.sp.fatec.mc.wikiacad2init.logistico.rede.compartilhamento;




import fs.br.sp.fatec.mc.wikiacad2init.logistico.adendo.WA2SaidaPadrao;
import fs.br.sp.fatec.mc.wikiacad2init.logistico.rede.compartilhamento.adendo.WA2NetAgentMascara;
import fs.br.sp.fatec.mc.wikiacad2init.logistico.rede.compartilhamento.adendo.WA2NetAgentPadrao;
import fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.processo.WA2Motor;
import fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.processo.adendo.WA2MotorOpcoes;
import fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.processo.orientado.WA2MotorImagem;
import fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.processo.orientado.especificado.WA2MotorAtividade;
import fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.unicidade.Wikia2tPublicacao;
import fs.br.sp.fatec.mc.wikiacad2init.seguranca.shadow.metodos.WA2Margem;
import fs.br.sp.fatec.mc.wikiacad2init.seguranca.shadow.metodos.WA2MargemAutenticado;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;




public final
      class WA2NetAgent implements WA2SaidaPadrao
    {




    private final static
          char FIM_LINHA = '\n';


    private static
          ServerSocket socketinterno;


    private static
          Socket socketexterno;


    private static
          PrintWriter saida;


    private static
          BufferedReader entrada;


    private static
          String _receptor;


    private static
          String _tunel[];


    private static
          WA2Motor wmotor;


    private static
          WA2Margem.WA2DES_Descriptografar_Runtime wad;


    private static
          WA2MotorImagem waimg;


    @Override
    public
          PrintStream informe()
        {

        return System.out;
        }


    public static
          PrintStream informeAlocado()
        {

        return System.out;
        }


    private final
          Runnable WA2AgentNetRunnable()
        {

        return new Runnable()
            {


            @Override
            public
                  void run()
                {

                WA2NetAgent.informeAlocado().println("$'Ouvindo'...$\n");
                for (;;)
                    {

                    try

                        {

                        WA2NetAgent.socketexterno = WA2NetAgent.socketinterno.accept();


                        WA2NetAgent.saida =
                              new PrintWriter(
                                    WA2NetAgent.socketexterno.getOutputStream(),
                                    true);

                        WA2NetAgent.entrada = new BufferedReader(
                              new InputStreamReader(
                                    WA2NetAgent.socketexterno.getInputStream()));

                        while (true)
                            {


                            final
                                  int byte_ = WA2NetAgent.entrada.read();
                            if ((byte_ < 0) || (byte_ == '\n'))
                                {
                                break;
                                }

                            WA2NetAgent.informeAlocado().printf("\\%c\\",
                                  (char) byte_);
                            WA2NetAgent._receptor += (char) byte_;

                            }
                        WA2NetAgent.informeAlocado().println();


                        WA2NetAgent.informeAlocado().println("-");
                        WA2NetAgent.informeAlocado().println(
                              "=>" + WA2NetAgent._receptor);


                        WA2NetAgent.informeAlocado().println("=>Em recepcao");


                        switch (WA2NetAgent.wad.executarD(
                              WA2MargemAutenticado._CHAVE, _receptor.replaceAll(
                                    "null", ""),
                              WA2MargemAutenticado.H_EXEC2))
                            {


                            case "reto**publ**sele":
                                {

                                WA2NetAgent.informeAlocado().println(
                                      "=>Respondendo! proc:reto**publ**sele");
                                WA2NetAgent._tunel = new String[2];


                                WA2NetAgent.waimg = new WA2MotorImagem<Wikia2tPublicacao>();

                                final
                                      HashMap<Long, Wikia2tPublicacao> buscatemp =
                                      WA2NetAgent.waimg.getEntidades(
                                            WA2MotorAtividade.PUBLICACOES_SELECIONADAS);




                                for (Wikia2tPublicacao iterando
                                     : buscatemp.values())
                                    {

                                    WA2NetAgent.informeAlocado().printf(
                                          "$Destrinchando #%s,%s$\n",
                                          iterando.getWIdunico(),
                                          iterando.getWDatapublicacao().toString());




                                    WA2NetAgent._tunel[0] += WA2NetAgentMascara.formatacaoMinima(
                                          iterando.getWTitulo(), "</h2>",
                                          " <h2 class=\"post-preview-title\">");


                                    final
                                          String id_p_autor =
                                          new WA2Motor(
                                                WA2MotorAtividade.CONTRIB_NOMINAL_POR_ID
                                                + String.valueOf(
                                                      iterando.getWIdautor()),
                                                WA2MotorOpcoes.DIRETIVA_RETORNO_BRUTO).
                                          getDiretivaRetornoBruto();


                                    final
                                          String casa_p_autor =
                                          new WA2Motor(
                                                WA2MotorAtividade.CONTRIB_CASA_POR_ID
                                                + String.valueOf(
                                                      iterando.getWIdautor()),
                                                WA2MotorOpcoes.DIRETIVA_RETORNO_BRUTO).
                                          getDiretivaRetornoBruto();


                                    WA2NetAgent._tunel[0] += WA2NetAgentMascara.formatacaoMinima(
                                          id_p_autor.replaceAll(new String(
                                                WA2Motor._separador_local),
                                                ""),
                                          "</a>" + " em " + iterando.getWDatapublicacao().toString() + "</p>",
                                          "<p class=\"post-preview-meta\">"
                                          + "Por <a href=\"" + casa_p_autor.replaceAll(
                                                new String(
                                                      WA2Motor._separador_local),
                                                "")
                                          + "\">");


                                    WA2NetAgent._tunel[0] += WA2NetAgentMascara.formatacaoMinima(
                                          iterando.getWConteudo(), "</div>",
                                          "<div class=\"post-content\">");


                                    WA2NetAgent._tunel[0] += WA2NetAgentMascara.formatacaoMinima(
                                          String.valueOf(iterando.getWCurtidas()),
                                          "</div>",
                                          "<div id=\"tag-options\">"
                                          + "                                <a href=\"#\"><span class=\"tag tag-pill tag-default\">"
                                          + "                                        <i class=\"fa fa-thumbs-up\"></i>"
                                          + "                                    </span></a>");




                                    WA2NetAgent._tunel[1] +=
                                          WA2NetAgentMascara.corpoApresentacaoSelecionadas(
                                                WA2NetAgent._tunel[0]
                                          );
                                    WA2NetAgent._tunel[0] = "";


                                    }
                                WA2NetAgent._tunel[1] += WA2NetAgent.FIM_LINHA;


                                Thread.sleep(256);
                                WA2NetAgent.saida.write(
                                      WA2NetAgent._tunel[1]);
                                WA2NetAgent._tunel[1] = "";


                                WA2NetAgent.saida.flush();

                                }
                            break;


                            default:
                                {
                                WA2NetAgent.informeAlocado().println(
                                      "!!=>Respondendo!");

                                WA2NetAgent.saida.write(
                                      "O servidor nao teve permissao para aceitar esta requisicao.\n");
                                WA2NetAgent.saida.flush();

                                }
                            break;

                            }


                        WA2NetAgent._receptor = "";
                        WA2NetAgent._tunel = null;


                        WA2NetAgent.socketexterno.close();

                        WA2NetAgent.wad.desalocar();
                        Thread.sleep(512);


                        WA2NetAgent.informeAlocado().printf("\n\n+%s\n\n",
                              String.valueOf(WA2NetAgentPadrao.FNANO()));
                        }

                    catch (Exception ex)
                        {

                        WA2NetAgent.informeAlocado().printf("&&%s&&",
                              ex.toString());

                        }

                    catch (Throwable ex)
                        {

                        WA2NetAgent.informeAlocado().printf("&&%s&&",
                              ex.toString());

                        }


                    }

                }


            };

        }


    private final
          Thread WA2NetAgentThread()
        {

        return new Thread(this.WA2AgentNetRunnable());

        }


    private final
          void inicializarCamadaComunicativa()
        {
        try
            {

            this.informe().println("$inicializarCamadaComunicativa em chamada$");
            this.socketinterno = new ServerSocket(WA2NetAgentPadrao.PORTA);


            this.informe().printf(
                  "$Servidor aberto apartir de %s, logicamente em %d$\n",
                  this.getClass().getPackage().getName(),
                  WA2NetAgentPadrao.PORTA
            );

            WA2NetAgent.wad =
                  new WA2Margem().new WA2DES_Descriptografar_Runtime();

            WA2NetAgent._receptor = new String();

            }
        catch (Exception ex)
            {

            this.informe().printf("&&%s&&", ex.toString());

            }
        }


    public
          WA2NetAgent()
        {

        this.inicializarCamadaComunicativa();
        this.WA2NetAgentThread().run();

        }


    }



