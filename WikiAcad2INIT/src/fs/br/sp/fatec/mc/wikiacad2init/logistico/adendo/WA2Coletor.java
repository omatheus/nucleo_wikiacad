
package fs.br.sp.fatec.mc.wikiacad2init.logistico.adendo;




import java.io.PrintStream;
import java.util.Date;




public
      class WA2Coletor implements WA2SaidaPadrao
      {




      public
            WA2Coletor()
            {
            }


      @Override
      public
            PrintStream informe()
            {
            return System.out;
            }


      public final
            void desalocar()
            {

            new Thread(new Runnable()
                  {


                  @Override
                  public
                        void run()
                        {

                        try
                              {
                              Runtime.getRuntime().gc();
                              informe().printf("$desalocar solicitado em(Ls):%d$\n", new Date().getTime());

                              this.finalize();
                              }
                        catch (Exception ex)
                              {

                              informe().println("!!!!" + ex.toString());

                              }
                        catch (Throwable ex)
                              {

                              informe().println("!!!!" + ex.toString());

                              }
                        }


                  }).start();


            }


      }



