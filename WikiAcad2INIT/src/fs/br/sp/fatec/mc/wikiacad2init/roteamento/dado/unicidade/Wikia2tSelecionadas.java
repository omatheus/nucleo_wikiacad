
package fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.unicidade;




import javax.xml.bind.annotation.XmlRootElement;




@XmlRootElement
public
      class Wikia2tSelecionadas implements java.io.Serializable
      {




      private
            short WId;


      private
            long WIdeditorialresponsavel;


      private
            long WIdplubicacao;


      public
            Wikia2tSelecionadas()
            {
            }


      public
            Wikia2tSelecionadas(short WId, long WIdeditorialresponsavel, long WIdplubicacao)
            {
            this.WId = WId;
            this.WIdeditorialresponsavel = WIdeditorialresponsavel;
            this.WIdplubicacao = WIdplubicacao;
            }


      public
            short getWId()
            {
            return this.WId;
            }


      public
            void setWId(short WId)
            {
            this.WId = WId;
            }


      public
            long getWIdeditorialresponsavel()
            {
            return this.WIdeditorialresponsavel;
            }


      public
            void setWIdeditorialresponsavel(long WIdeditorialresponsavel)
            {
            this.WIdeditorialresponsavel = WIdeditorialresponsavel;
            }


      public
            long getWIdplubicacao()
            {
            return this.WIdplubicacao;
            }


      public
            void setWIdplubicacao(long WIdplubicacao)
            {
            this.WIdplubicacao = WIdplubicacao;
            }




      }



