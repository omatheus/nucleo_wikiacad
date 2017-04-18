
package fs.br.sp.fatec.mc.wikiacad2init.logistico.funcional;




import fs.br.sp.fatec.mc.wikiacad2init.logistico.adendo.WA2SaidaPadrao;
import java.io.File;
import java.io.PrintStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;




public
      class WA2Vertice<C> implements WA2SaidaPadrao
      {




      @Override
      public
            PrintStream informe()
            {
            return System.out;
            }


      private
            C w_analiseBruta;


      private
            String w_localAbsoluto;


      public
            WA2Vertice(final
                  C n_w_analiseBruta, final
                       String n_w_localAbsoluto)
            {

            this.w_analiseBruta = n_w_analiseBruta;
            this.w_localAbsoluto = n_w_localAbsoluto;

            }


      public synchronized
            short
            getNotacaoConversora()
            {

            File unidadeSaida = null;

            try
                  {

                  assert (this.w_analiseBruta != null && this.w_localAbsoluto != null && this.w_localAbsoluto.length() > 3);


                  this.informe().println("$Bloco operacao getNotacaoConversora em execucao$");

                  this.informe().printf("$Caracteristicas do objeto %s$\n",
                        this.w_analiseBruta.getClass().getCanonicalName().toUpperCase());

                  this.informe().printf("$%s;%s$\n", this.w_analiseBruta.getClass().getSimpleName(),
                        this.w_analiseBruta.getClass().getPackage().getName()
                  );


                  this.informe().println("$Instrucoes principais em andamento$");

                  unidadeSaida = new File(this.w_localAbsoluto);

                  final
                        JAXBContext jaxbContexto = JAXBContext.newInstance(this.w_analiseBruta.getClass());
                  final
                        Marshaller jaxbMarshaller = jaxbContexto.createMarshaller();



                  jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);


                  jaxbMarshaller.marshal(this.w_analiseBruta, unidadeSaida);


                  if (unidadeSaida.exists())
                        {

                        this.informe().println("$Concluido$");
                        this.informe().printf("$Gravado:%s$\n", unidadeSaida.getAbsolutePath().toUpperCase());

                        return 0;

                        }

                  else
                        {

                        this.informe().printf("$A gravacao=%s nao pode ser realizada.\n",
                              unidadeSaida.getAbsolutePath().toUpperCase());

                        return -1;

                        }

                  }
            catch (Exception ex)
                  {

                  this.informe().printf("&&%s&&\n\n", ex.toString());

                  return -1;

                  }



            }


      }



