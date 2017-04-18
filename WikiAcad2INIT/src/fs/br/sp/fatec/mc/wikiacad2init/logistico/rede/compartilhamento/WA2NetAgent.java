
package fs.br.sp.fatec.mc.wikiacad2init.logistico.rede.compartilhamento;




import fs.br.sp.fatec.mc.wikiacad2init.logistico.adendo.WA2SaidaPadrao;
import fs.br.sp.fatec.mc.wikiacad2init.logistico.rede.compartilhamento.adendo.WA2NetAgentPadrao;
import fs.br.sp.fatec.mc.wikiacad2init.seguranca.shadow.metodos.WA2Margem;
import fs.br.sp.fatec.mc.wikiacad2init.seguranca.shadow.metodos.WA2MargemAutenticado;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;




public final
      class WA2NetAgent implements WA2SaidaPadrao
      {




      private static
            ServerSocket socketinterno;


      private static
            Socket socketexterno;


      private static
            PrintWriter saida;


      private static
            BufferedReader entrada;


      private static
            String _receptor[];


      private static
            WA2Margem.WA2DES_Descriptografar_Runtime wad;


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

                        WA2NetAgent.informeAlocado().println("$'Ouvindo'...$");
                        for (;;)
                              {

                              try

                                    {

                                    WA2NetAgent.socketexterno = WA2NetAgent.socketinterno.accept();

                                    WA2NetAgent.saida =
                                          new PrintWriter(WA2NetAgent.socketexterno.getOutputStream(), true);

                                    WA2NetAgent.entrada = new BufferedReader(
                                          new InputStreamReader(WA2NetAgent.socketexterno.getInputStream()));




                                    while ((WA2NetAgent._receptor[0] = WA2NetAgent.entrada.readLine()) != null)
                                          {

                                          WA2NetAgent.informeAlocado().println(
                                                "=>" + WA2NetAgent._receptor[0]);

                                          WA2NetAgent._receptor[1] += WA2NetAgent._receptor[0];

                                          }


                                    WA2NetAgent.informeAlocado().println(
                                          "=>\\" + WA2NetAgent._receptor[1] + "\\");




                                    WA2NetAgent.informeAlocado().println("=>Em recepcao");


                                    switch (WA2NetAgent.wad.executarD(WA2MargemAutenticado._CHAVE, _receptor[1].replaceAll(
                                          "null", ""),
                                          WA2MargemAutenticado.H_EXEC2))
                                          {


                                          case "reto**publ**sele":
                                                {

                                                WA2NetAgent.informeAlocado().println("=>Respondendo! proc:reto**publ**sele");

                                                WA2NetAgent.saida.println("Processado!");
                                                //WA2NetAgent.saida.close();

                                                }
                                          break;


                                          default:
                                                {
                                                WA2NetAgent.informeAlocado().println("!!=>Respondendo!");

                                                WA2NetAgent.saida.println(
                                                      "O servidor nao teve permissao para aceitar esta requisicao.");
                                                //WA2NetAgent.saida.close();

                                                }
                                          break;

                                          }


                                    WA2NetAgent.socketexterno.close();


                                    WA2NetAgent.wad.desalocar();

                                    
                                    this.finalize();

                                    break;

                                    }

                              catch (Exception ex)
                                    {

                                    WA2NetAgent.informeAlocado().printf("&&%s&&", ex.toString());

                                    }

                              catch (Throwable ex)
                                    {

                                    WA2NetAgent.informeAlocado().printf("&&%s&&", ex.toString());

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


                  this.informe().printf("$Servidor aberto apartir de %s, logicamente em %d$\n",
                        this.getClass().getPackage().getName(), WA2NetAgentPadrao.PORTA
                  );

                  WA2NetAgent.wad =
                        new WA2Margem().new WA2DES_Descriptografar_Runtime();

                  WA2NetAgent._receptor = new String[2];

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



