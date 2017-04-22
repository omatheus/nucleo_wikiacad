
package fs.br.sp.fatec.mc.wikiacad2init.execucao.inicio;




import fs.br.sp.fatec.mc.wikiacad2init.logistico.adendo.WA2SaidaPadrao;
import java.io.PrintStream;




public final
      class WA2AINApresentacao implements WA2SaidaPadrao
      {




      private final
            String HEAD = "| WikiAcad2INIT (C) FATEC MC - Modalidade Sub-servico |";


      private final
            long SV = 100429;


      public
            WA2AINApresentacao()

            {

            informe().println(HEAD + "\n" + String.valueOf(SV) + "\n");

            }


      @Override
      public
            PrintStream informe()
            {

            return System.out;
            }


      }



