
package fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.unicidade;




import java.util.Date;




public
      class Wikia2tContribuinte implements java.io.Serializable
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
            String WPerfilquemsou;


      private
            String WPerfildescricao;


      private
            String WPerfilgostos;


      private
            Short WTentativaspublicadas;


      private
            String WPublicacoescurtidas;


      private
            String WPublicacoescomentadas;


      private
            String WAdvertencias;


      private
            String WDiretorioutil;


      public
            Wikia2tContribuinte()
            {
            }


      public
            Wikia2tContribuinte(long WIdunico, String WNomecompleto, Date WDatanascimento, char WSexo, String WEmailcomunicao,
                                String WDiretorioutil)
            {
            this.WIdunico = WIdunico;
            this.WNomecompleto = WNomecompleto;
            this.WDatanascimento = WDatanascimento;
            this.WSexo = WSexo;
            this.WEmailcomunicao = WEmailcomunicao;
            this.WDiretorioutil = WDiretorioutil;
            }


      public
            Wikia2tContribuinte(long WIdunico, String WNomecompleto, Date WDatanascimento, char WSexo, String WEmailcomunicao,
                                String WPerfilquemsou, String WPerfildescricao, String WPerfilgostos,
                                Short WTentativaspublicadas, String WPublicacoescurtidas, String WPublicacoescomentadas,
                                String WAdvertencias, String WDiretorioutil)
            {
            this.WIdunico = WIdunico;
            this.WNomecompleto = WNomecompleto;
            this.WDatanascimento = WDatanascimento;
            this.WSexo = WSexo;
            this.WEmailcomunicao = WEmailcomunicao;
            this.WPerfilquemsou = WPerfilquemsou;
            this.WPerfildescricao = WPerfildescricao;
            this.WPerfilgostos = WPerfilgostos;
            this.WTentativaspublicadas = WTentativaspublicadas;
            this.WPublicacoescurtidas = WPublicacoescurtidas;
            this.WPublicacoescomentadas = WPublicacoescomentadas;
            this.WAdvertencias = WAdvertencias;
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
            String getWPerfilquemsou()
            {
            return this.WPerfilquemsou;
            }


      public
            void setWPerfilquemsou(String WPerfilquemsou)
            {
            this.WPerfilquemsou = WPerfilquemsou;
            }


      public
            String getWPerfildescricao()
            {
            return this.WPerfildescricao;
            }


      public
            void setWPerfildescricao(String WPerfildescricao)
            {
            this.WPerfildescricao = WPerfildescricao;
            }


      public
            String getWPerfilgostos()
            {
            return this.WPerfilgostos;
            }


      public
            void setWPerfilgostos(String WPerfilgostos)
            {
            this.WPerfilgostos = WPerfilgostos;
            }


      public
            Short getWTentativaspublicadas()
            {
            return this.WTentativaspublicadas;
            }


      public
            void setWTentativaspublicadas(Short WTentativaspublicadas)
            {
            this.WTentativaspublicadas = WTentativaspublicadas;
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



