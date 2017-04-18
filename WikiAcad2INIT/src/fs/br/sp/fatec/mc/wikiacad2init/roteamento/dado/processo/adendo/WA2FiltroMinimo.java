
package fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.processo.adendo;




import fs.br.sp.fatec.mc.wikiacad2init.logistico.adendo.WA2Coletor;
import fs.br.sp.fatec.mc.wikiacad2init.logistico.adendo.WA2SaidaPadrao;
import fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.unicidade.Wikia2tAdministrador;
import fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.unicidade.Wikia2tChaveautadm;
import fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.unicidade.Wikia2tChaveautedi;
import fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.unicidade.Wikia2tContribuinte;
import fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.unicidade.Wikia2tEditorial;
import fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.unicidade.Wikia2tPublicacao;
import fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.unicidade.Wikia2tSelecionadas;
import java.io.PrintStream;
import java.util.List;




public
      class WA2FiltroMinimo implements WA2SaidaPadrao
      {




      private
            String localclassname;


      private
            boolean permissivo = false;


      public
            WA2FiltroMinimo(final
                  String classname)
            {

            if (classname.contains(WA2Dados.estes()[0]))
                  {
                  this.permissivo = true;
                  this.localclassname = classname;
                  }
            else if (classname.contains(WA2Dados.estes()[1]))
                  {
                  this.permissivo = true;
                  this.localclassname = classname;
                  }
            else if (classname.contains(WA2Dados.estes()[2]))
                  {
                  this.permissivo = true;
                  this.localclassname = classname;
                  }
            else if (classname.contains(WA2Dados.estes()[3]))
                  {
                  this.permissivo = true;
                  this.localclassname = classname;
                  }
            else if (classname.contains(WA2Dados.estes()[4]))
                  {
                  this.permissivo = true;
                  this.localclassname = classname;
                  }
            else if (classname.contains(WA2Dados.estes()[5]))
                  {
                  this.permissivo = true;
                  this.localclassname = classname;
                  }


            }


      @Override
      public
            PrintStream informe()
            {
            return System.out;
            }


      public final
            int impressaoSimples(final
                  List recurso)
            {

            if (recurso == null || this.permissivo == false || this.localclassname.equals(""))
                  {
                  this.informe().println("$WA2FiltroMinimo=Unidade incompleta. Nada a fazer.$");
                  return -1;
                  }


            this.informe().printf("$Filtrando (impressaoSimples<%s>)...$\n", this.localclassname);


            switch (this.localclassname)
                  {

                  case "wikia2tadministrador":
                        {
                        for (Object percorre
                             : recurso)
                              {

                              final
                                    Wikia2tAdministrador wal = (Wikia2tAdministrador) percorre;

                              this.informe().println("+--------------------------------+");

                              this.informe().printf("ID->%s\n", wal.getWIdunico());
                              this.informe().printf("Nome->%s\n", wal.getWNomecompleto());
                              this.informe().printf("e-mail->%s\n", wal.getWEmailcomunicao());
                              this.informe().printf("Nascimento->%s\n", wal.getWDatanascimento().toString());
                              this.informe().printf("Sexo->%c\n", wal.getWSexo());

                              this.informe().println("+--------------------------------+");
                              }
                        }
                  break;
                  case "wikia2teditorial":
                        {
                        for (Object percorre
                             : recurso)
                              {

                              final
                                    Wikia2tEditorial wal = (Wikia2tEditorial) percorre;

                              this.informe().println("+--------------------------------+");

                              this.informe().printf("ID->%s\n", wal.getWIdunico());
                              this.informe().printf("Nome->%s\n", wal.getWNomecompleto());
                              this.informe().printf("e-mail->%s\n", wal.getWEmailcomunicao());
                              this.informe().printf("Nascimento->%s\n", wal.getWDatanascimento().toString());
                              this.informe().printf("Sexo->%c\n", wal.getWSexo());

                              this.informe().println("+--------------------------------+");
                              }
                        }
                  break;
                  case "wikia2tcontribuinte":
                        {
                        for (Object percorre
                             : recurso)
                              {

                              final
                                    Wikia2tContribuinte wal = (Wikia2tContribuinte) percorre;

                              this.informe().println("+--------------------------------+");

                              this.informe().printf("ID->%s\n", wal.getWIdunico());
                              this.informe().printf("Nome->%s\n", wal.getWNomecompleto());
                              this.informe().printf("e-mail->%s\n", wal.getWEmailcomunicao());
                              this.informe().printf("Nascimento->%s\n", wal.getWDatanascimento().toString());
                              this.informe().printf("Sexo->%c\n", wal.getWSexo());

                              this.informe().println("+--------------------------------+");
                              }
                        }
                  break;
                  case "wikia2tpublicacao":
                        {
                        for (Object percorre
                             : recurso)
                              {

                              final
                                    Wikia2tPublicacao wal = (Wikia2tPublicacao) percorre;

                              this.informe().println("+--------------------------------+");

                              this.informe().printf("ID->%s\n", wal.getWIdunico());
                              this.informe().printf("Data->%s\n", wal.getWDatapublicacao());
                              this.informe().printf("Categoria->%s\n", wal.getWCategoria());
                              this.informe().printf("Titulo->%s\n", wal.getWTitulo());
                              this.informe().printf("IDAutor->%s\n", wal.getWIdautor());

                              this.informe().println("+--------------------------------+");
                              }
                        }
                  case "wikia2tselecionadas":
                        {
                        for (Object percorre
                             : recurso)
                              {

                              final
                                    Wikia2tSelecionadas wal = (Wikia2tSelecionadas) percorre;

                              this.informe().println("+--------------------------------+");

                              this.informe().printf("IDPublicacao->%s\n", wal.getWId());

                              this.informe().println("+--------------------------------+");
                              }
                        }
                  default:
                        {

                        this.informe().println("$Identificador de atribuicao ao objeto indisponivel.$");

                        }
                  break;
                  }

            new WA2Coletor().desalocar();

            return 0;
            }


      }



