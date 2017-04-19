
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

              "UsVT2NUw+P8EdaUX5g7JKoD2QHHtFxH4\n",
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
          void requisicaoLocal(final
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

                            WA2WSXagent.sc_comunicar = new Socket(
                                  WA2WSXagent.hostname, WA2WSXagent.porta);


                            WA2WSXagent.saida = new PrintWriter(
                                  WA2WSXagent.sc_comunicar.getOutputStream(),
                                  true);


                            WA2WSXagent.entrada = new BufferedReader(
                                  new InputStreamReader(
                                        WA2WSXagent.sc_comunicar.getInputStream()));




                            WA2WSXagent.saida.write(WA2WSXagent.c_com[0]);
                            WA2WSXagent.saida.flush();


                            String absorver = new String();
                            while (true)
                                {

                                final
                                      int byte_ = WA2WSXagent.entrada.read();

                                if ((byte_ < 0) || (byte_ == '\n'))
                                    {
                                    break;
                                    }


                                absorver += (char) byte_;
                                }

                            blocoRs.append(absorver.replaceAll("null", ""));


                            WA2WSXagent.entrada.close();
                            WA2WSXagent.saida.close();


                            }
                        catch (Exception ex)
                            {

                            WA2Report.armazenarLOG(WA2WSXagent.class.getName(),
                                  ex.getMessage());

                            ex.printStackTrace();

                            }
                        catch (Throwable ex)
                            {

                            WA2Report.armazenarLOG(WA2WSXagent.class.getName(),
                                  ex.getMessage());

                            ex.printStackTrace();
                            }

                        }


                    }
                ).run();


                }
            break;


            case 0xA3:
                {

                }
            break;

            }


        }




    }



