
package br.gov.sp.cps.fmc.wikiacad2wsx.web.servidor.particular;




import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;




public abstract
      class WA2Report
      {




      public static final
            void armazenarLOG(final
                  String origem, final
                              String cadeia)
            {

            try
                  {

                  final
                        File arquivologfinal = new File("/var/log/was/" + origem + new Date().toInstant().toString() + ".txt");

                  final
                        FileWriter fw = new FileWriter(arquivologfinal);

                  BufferedWriter bw = new BufferedWriter(fw);

                  bw.write(cadeia);
                  bw.close();

                  }
            catch (Exception ex)
                  {
                  }

            }


      }



