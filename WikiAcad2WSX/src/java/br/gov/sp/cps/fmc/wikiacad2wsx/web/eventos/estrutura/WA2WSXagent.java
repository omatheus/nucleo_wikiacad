
package br.gov.sp.cps.fmc.wikiacad2wsx.web.eventos.estrutura;




import br.gov.sp.cps.fmc.wikiacad2wsx.web.servidor.particular.WA2Report;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;




public
      class WA2WSXagent
      {




      private static final
            String hostname = "localhost";


      private static final
            int porta = 20020;


      private static final
            String c_com[] =
                  {

                  "UsVT2NUw+P8EdaUX5g7JKoD2QHHtFxH4",
                  "",
                  ""

                  };


      private static
            Socket sc_comunicar;


      private static
            PrintWriter saida;


      private static
            BufferedReader entrada;


      public
            WA2WSXagent()
            {
            }


      public final
            boolean requisicaoLocal(final
                  short operar, final
                                    StringBuffer blocoRs)
            {


            switch (operar)
                  {

                  case 0xA1:
                        {

                        new Thread(new Runnable()
                              {


                              @Override
                              public
                                    void run()
                                    {

                                    try
                                          {

                                          WA2WSXagent.sc_comunicar = new Socket(WA2WSXagent.hostname, WA2WSXagent.porta);


                                          WA2WSXagent.saida = new PrintWriter(WA2WSXagent.sc_comunicar.getOutputStream(), true);


                                          WA2WSXagent.entrada = new BufferedReader(
                                                new InputStreamReader(WA2WSXagent.sc_comunicar.getInputStream()));


                                          WA2WSXagent.saida.println(WA2WSXagent.c_com[0]);
                                          WA2WSXagent.saida.close();


                                          String absorver = "";
                                          while ((absorver = WA2WSXagent.entrada.readLine()) != null)
                                                {
                                                blocoRs.append(absorver.replace("null", ""));
                                                }




                                          }
                                    catch (Exception ex)
                                          {

                                          WA2Report.armazenarLOG(WA2WSXagent.class.getName(), ex.getMessage());

                                          }
                                    catch (Throwable ex)
                                          {

                                          WA2Report.armazenarLOG(WA2WSXagent.class.getName(), ex.getMessage());

                                          }

                                    }


                              }).run();



                        }
                  break;

                  case 0xA3:
                        {

                        }
                  break;

                  }




            return true;
            }




      }



