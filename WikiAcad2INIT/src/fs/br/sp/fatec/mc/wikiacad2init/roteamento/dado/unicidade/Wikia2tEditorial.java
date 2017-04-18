
package fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.unicidade;




import java.util.Date;




public
      class Wikia2tEditorial implements java.io.Serializable
      {




      private
            long WIdunico;


      private
            String WNomecompleto;


      private
            Date WDatanascimento;


      private
            char WSexo;


      private
            String WEmailcomunicao;


      private
            String WPublicacoescurtidas;


      private
            String WPublicacoescomentadas;


      private
            String WAdvertencias;


      private
            short WChaveautedi;


      private
            String WPublicacoesselecionadas;


      private
            String WDiretorioutil;


      public
            Wikia2tEditorial()
            {
            }


      public
            Wikia2tEditorial(long WIdunico, String WNomecompleto, Date WDatanascimento, char WSexo, String WEmailcomunicao,
                             short WChaveautedi, String WDiretorioutil)
            {
            this.WIdunico = WIdunico;
            this.WNomecompleto = WNomecompleto;
            this.WDatanascimento = WDatanascimento;
            this.WSexo = WSexo;
            this.WEmailcomunicao = WEmailcomunicao;
            this.WChaveautedi = WChaveautedi;
            this.WDiretorioutil = WDiretorioutil;
            }


      public
            Wikia2tEditorial(long WIdunico, String WNomecompleto, Date WDatanascimento, char WSexo, String WEmailcomunicao,
                             String WPublicacoescurtidas, String WPublicacoescomentadas, String WAdvertencias,
                             short WChaveautedi, String WPublicacoesselecionadas, String WDiretorioutil)
            {
            this.WIdunico = WIdunico;
            this.WNomecompleto = WNomecompleto;
            this.WDatanascimento = WDatanascimento;
            this.WSexo = WSexo;
            this.WEmailcomunicao = WEmailcomunicao;
            this.WPublicacoescurtidas = WPublicacoescurtidas;
            this.WPublicacoescomentadas = WPublicacoescomentadas;
            this.WAdvertencias = WAdvertencias;
            this.WChaveautedi = WChaveautedi;
            this.WPublicacoesselecionadas = WPublicacoesselecionadas;
            this.WDiretorioutil = WDiretorioutil;
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
            String getWNomecompleto()
            {
            return this.WNomecompleto;
            }


      public
            void setWNomecompleto(String WNomecompleto)
            {
            this.WNomecompleto = WNomecompleto;
            }


      public
            Date getWDatanascimento()
            {
            return this.WDatanascimento;
            }


      public
            void setWDatanascimento(Date WDatanascimento)
            {
            this.WDatanascimento = WDatanascimento;
            }


      public
            char getWSexo()
            {
            return this.WSexo;
            }


      public
            void setWSexo(char WSexo)
            {
            this.WSexo = WSexo;
            }


      public
            String getWEmailcomunicao()
            {
            return this.WEmailcomunicao;
            }


      public
            void setWEmailcomunicao(String WEmailcomunicao)
            {
            this.WEmailcomunicao = WEmailcomunicao;
            }


      public
            String getWPublicacoescurtidas()
            {
            return this.WPublicacoescurtidas;
            }


      public
            void setWPublicacoescurtidas(String WPublicacoescurtidas)
            {
            this.WPublicacoescurtidas = WPublicacoescurtidas;
            }


      public
            String getWPublicacoescomentadas()
            {
            return this.WPublicacoescomentadas;
            }


      public
            void setWPublicacoescomentadas(String WPublicacoescomentadas)
            {
            this.WPublicacoescomentadas = WPublicacoescomentadas;
            }


      public
            String getWAdvertencias()
            {
            return this.WAdvertencias;
            }


      public
            void setWAdvertencias(String WAdvertencias)
            {
            this.WAdvertencias = WAdvertencias;
            }


      public
            short getWChaveautedi()
            {
            return this.WChaveautedi;
            }


      public
            void setWChaveautedi(short WChaveautedi)
            {
            this.WChaveautedi = WChaveautedi;
            }


      public
            String getWPublicacoesselecionadas()
            {
            return this.WPublicacoesselecionadas;
            }


      public
            void setWPublicacoesselecionadas(String WPublicacoesselecionadas)
            {
            this.WPublicacoesselecionadas = WPublicacoesselecionadas;
            }


      public
            String getWDiretorioutil()
            {
            return this.WDiretorioutil;
            }


      public
            void setWDiretorioutil(String WDiretorioutil)
            {
            this.WDiretorioutil = WDiretorioutil;
            }




      }



