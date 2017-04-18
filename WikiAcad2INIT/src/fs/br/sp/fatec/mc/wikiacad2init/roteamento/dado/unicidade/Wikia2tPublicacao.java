
package fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.unicidade;




import java.util.Date;




public
      class Wikia2tPublicacao implements java.io.Serializable
      {




      private
            long WIdunico;


      private
            long WIdautor;


      private
            String WCategoria;


      private
            Date WDatapublicacao;


      private
            String WTitulo;


      private
            String WConteudo;


      private
            String WConteudomodifcontribuintes;


      private
            String WConteudomodifeditoriais;


      private
            String WCorrecao;


      private
            String WComentarios;


      private
            Integer WCurtidas;


      private
            char WExibicao;


      public
            Wikia2tPublicacao()
            {
            }


      public
            Wikia2tPublicacao(long WIdunico, long WIdautor, Date WDatapublicacao, String WTitulo, String WConteudo,
                              char WExibicao)
            {
            this.WIdunico = WIdunico;
            this.WIdautor = WIdautor;
            this.WDatapublicacao = WDatapublicacao;
            this.WTitulo = WTitulo;
            this.WConteudo = WConteudo;
            this.WExibicao = WExibicao;
            }


      public
            Wikia2tPublicacao(long WIdunico, long WIdautor, String WCategoria, Date WDatapublicacao, String WTitulo,
                              String WConteudo, String WConteudomodifcontribuintes, String WConteudomodifeditoriais,
                              String WCorrecao, String WComentarios, Integer WCurtidas, char WExibicao)
            {
            this.WIdunico = WIdunico;
            this.WIdautor = WIdautor;
            this.WCategoria = WCategoria;
            this.WDatapublicacao = WDatapublicacao;
            this.WTitulo = WTitulo;
            this.WConteudo = WConteudo;
            this.WConteudomodifcontribuintes = WConteudomodifcontribuintes;
            this.WConteudomodifeditoriais = WConteudomodifeditoriais;
            this.WCorrecao = WCorrecao;
            this.WComentarios = WComentarios;
            this.WCurtidas = WCurtidas;
            this.WExibicao = WExibicao;
            }


      public
            long getWIdunico()
            {
            return this.WIdunico;
            }


      public
            void setWIdunico(long WIdunico)
            {
            this.WIdunico = WIdunico;
            }


      public
            long getWIdautor()
            {
            return this.WIdautor;
            }


      public
            void setWIdautor(long WIdautor)
            {
            this.WIdautor = WIdautor;
            }


      public
            String getWCategoria()
            {
            return this.WCategoria;
            }


      public
            void setWCategoria(String WCategoria)
            {
            this.WCategoria = WCategoria;
            }


      public
            Date getWDatapublicacao()
            {
            return this.WDatapublicacao;
            }


      public
            void setWDatapublicacao(Date WDatapublicacao)
            {
            this.WDatapublicacao = WDatapublicacao;
            }


      public
            String getWTitulo()
            {
            return this.WTitulo;
            }


      public
            void setWTitulo(String WTitulo)
            {
            this.WTitulo = WTitulo;
            }


      public
            String getWConteudo()
            {
            return this.WConteudo;
            }


      public
            void setWConteudo(String WConteudo)
            {
            this.WConteudo = WConteudo;
            }


      public
            String getWConteudomodifcontribuintes()
            {
            return this.WConteudomodifcontribuintes;
            }


      public
            void setWConteudomodifcontribuintes(String WConteudomodifcontribuintes)
            {
            this.WConteudomodifcontribuintes = WConteudomodifcontribuintes;
            }


      public
            String getWConteudomodifeditoriais()
            {
            return this.WConteudomodifeditoriais;
            }


      public
            void setWConteudomodifeditoriais(String WConteudomodifeditoriais)
            {
            this.WConteudomodifeditoriais = WConteudomodifeditoriais;
            }


      public
            String getWCorrecao()
            {
            return this.WCorrecao;
            }


      public
            void setWCorrecao(String WCorrecao)
            {
            this.WCorrecao = WCorrecao;
            }


      public
            String getWComentarios()
            {
            return this.WComentarios;
            }


      public
            void setWComentarios(String WComentarios)
            {
            this.WComentarios = WComentarios;
            }


      public
            Integer getWCurtidas()
            {
            return this.WCurtidas;
            }


      public
            void setWCurtidas(Integer WCurtidas)
            {
            this.WCurtidas = WCurtidas;
            }


      public
            char getWExibicao()
            {
            return this.WExibicao;
            }


      public
            void setWExibicao(char WExibicao)
            {
            this.WExibicao = WExibicao;
            }




      }



