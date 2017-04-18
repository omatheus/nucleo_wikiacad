
package fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.unicidade;




import java.util.Date;




public
      class Wikia2tAdministrador implements java.io.Serializable
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
            Integer WPublicacoesavaliadas;


      private
            String WPublicacoescorrigidas;


      private
            Integer WPublicacoesexcluidas;


      private
            String WPublicacoesremovidas;


      private
            String WContasexcluidas;


      private
            short WChaveautadm;


      private
            String WDiretorioutil;


      public
            Wikia2tAdministrador()
            {
            }


      public
            Wikia2tAdministrador(long WIdunico, String WNomecompleto, Date WDatanascimento, char WSexo, String WEmailcomunicao,
                                 short WChaveautadm, String WDiretorioutil)
            {
            this.WIdunico = WIdunico;
            this.WNomecompleto = WNomecompleto;
            this.WDatanascimento = WDatanascimento;
            this.WSexo = WSexo;
            this.WEmailcomunicao = WEmailcomunicao;
            this.WChaveautadm = WChaveautadm;
            this.WDiretorioutil = WDiretorioutil;
            }


      public
            Wikia2tAdministrador(long WIdunico, String WNomecompleto, Date WDatanascimento, char WSexo, String WEmailcomunicao,
                                 Integer WPublicacoesavaliadas, String WPublicacoescorrigidas, Integer WPublicacoesexcluidas,
                                 String WPublicacoesremovidas, String WContasexcluidas, short WChaveautadm,
                                 String WDiretorioutil)
            {
            this.WIdunico = WIdunico;
            this.WNomecompleto = WNomecompleto;
            this.WDatanascimento = WDatanascimento;
            this.WSexo = WSexo;
            this.WEmailcomunicao = WEmailcomunicao;
            this.WPublicacoesavaliadas = WPublicacoesavaliadas;
            this.WPublicacoescorrigidas = WPublicacoescorrigidas;
            this.WPublicacoesexcluidas = WPublicacoesexcluidas;
            this.WPublicacoesremovidas = WPublicacoesremovidas;
            this.WContasexcluidas = WContasexcluidas;
            this.WChaveautadm = WChaveautadm;
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
            Integer getWPublicacoesavaliadas()
            {
            return this.WPublicacoesavaliadas;
            }


      public
            void setWPublicacoesavaliadas(Integer WPublicacoesavaliadas)
            {
            this.WPublicacoesavaliadas = WPublicacoesavaliadas;
            }


      public
            String getWPublicacoescorrigidas()
            {
            return this.WPublicacoescorrigidas;
            }


      public
            void setWPublicacoescorrigidas(String WPublicacoescorrigidas)
            {
            this.WPublicacoescorrigidas = WPublicacoescorrigidas;
            }


      public
            Integer getWPublicacoesexcluidas()
            {
            return this.WPublicacoesexcluidas;
            }


      public
            void setWPublicacoesexcluidas(Integer WPublicacoesexcluidas)
            {
            this.WPublicacoesexcluidas = WPublicacoesexcluidas;
            }


      public
            String getWPublicacoesremovidas()
            {
            return this.WPublicacoesremovidas;
            }


      public
            void setWPublicacoesremovidas(String WPublicacoesremovidas)
            {
            this.WPublicacoesremovidas = WPublicacoesremovidas;
            }


      public
            String getWContasexcluidas()
            {
            return this.WContasexcluidas;
            }


      public
            void setWContasexcluidas(String WContasexcluidas)
            {
            this.WContasexcluidas = WContasexcluidas;
            }


      public
            short getWChaveautadm()
            {
            return this.WChaveautadm;
            }


      public
            void setWChaveautadm(short WChaveautadm)
            {
            this.WChaveautadm = WChaveautadm;
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



