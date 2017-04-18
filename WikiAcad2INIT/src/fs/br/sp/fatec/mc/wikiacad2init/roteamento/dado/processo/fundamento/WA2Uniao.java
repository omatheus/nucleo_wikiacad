
package fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.processo.fundamento;




import fs.br.sp.fatec.mc.wikiacad2init.logistico.adendo.WA2Coletor;
import fs.br.sp.fatec.mc.wikiacad2init.logistico.adendo.WA2SaidaPadrao;
import java.io.PrintStream;
import java.util.Date;
import java.util.List;




public
      class WA2Uniao<C> implements WA2SaidaPadrao
      {




      private
            C estrutura;


      private
            C ponteiro[];


      public
            WA2Uniao()
            {
            }


      @Override
      public
            PrintStream informe()
            {

            return System.out;

            }


      public final synchronized
            C getEstruturaParticular(final
                  List registro)
            {

            assert (registro.size() > 0);

            this.informe().printf("$bloco getEstruturaParticular em execucao, solicitado em%d$\n", new Date().getTime());

            this.estrutura = (C) registro.get(0);
            return this.estrutura;

            }



      public final synchronized
            C[] getEstruturas(final
                  List registros)
            {

            this.informe().printf("$bloco getEstruturas em execucao, solicitado em%d$\n", new Date().getTime());

            assert (registros.size() > 1);

            short index = -1;

            this.ponteiro = (C[]) new Object[registros.size()];

            for (Object percorre
                 : registros)
                  {

                  index++;

                  this.ponteiro[index] = (C) percorre;

                  }


            new WA2Coletor().desalocar();

            return this.ponteiro;

            }


      }



