
package fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.processo;




import fs.br.sp.fatec.mc.wikiacad2init.logistico.adendo.WA2Coletor;
import fs.br.sp.fatec.mc.wikiacad2init.logistico.adendo.WA2SaidaPadrao;
import fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.crucial.WA2HibernateInterno;
import fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.processo.adendo.WA2Dados;
import fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.processo.adendo.WA2FiltroMinimo;
import fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.processo.fundamento.WA2Uniao;
import fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.unicidade.Wikia2tAdministrador;
import fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.unicidade.Wikia2tChaveautadm;
import fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.unicidade.Wikia2tChaveautedi;
import fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.unicidade.Wikia2tContribuinte;
import fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.unicidade.Wikia2tPublicacao;
import fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.unicidade.Wikia2tSelecionadas;
import java.io.PrintStream;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;




public final
      class WA2Motor implements WA2SaidaPadrao
      {




      public
            WA2Motor(final
                  String parametro, final
                     short modo)
            {

            switch (modo)
                  {

                  case 0:
                        {
                        this.informe().printf("$Operacao num.%d$\n", modo);
                        this.getDiretivaPersistenciaSimples(parametro);

                        new WA2Coletor().desalocar();
                        }
                  break;
                  case -1:
                        {
                        this.informe().printf("$Operacao num.%d$\n", modo);
                        this.getDiretivaUnitaria(parametro);

                        new WA2Coletor().desalocar();
                        }
                  break;
                  case -2:
                        {
                        this.informe().printf("$Operacao num.%d$\n", modo);
                        this.getPonteiroADiretiva(parametro);

                        new WA2Coletor().desalocar();
                        }
                  break;
                  default:
                        {
                        }
                  break;
                  }

            }



      @Override
      public
            PrintStream informe()
            {
            return System.out;
            }


      public final static
            PrintStream informeAlocado()
            {
            return System.out;
            }


      private final
            void getDiretivaPersistenciaSimples(final
                  String parametro)
            {


            new Thread(new Runnable()
                  {


                  @Override
                  public
                        void run()
                        {


                        try
                              {

                              WA2Motor.informeAlocado().printf(
                                    "$getDiretivaPersistenciaSimples em andamento! Solicitada em %d$\n",
                                    new Date().getTime());


                              final
                                    Session session = WA2HibernateInterno.getSessionFactory().openSession();
                              session.beginTransaction();

                              final
                                    Query q = session.createQuery(parametro);

                              final
                                    List resultList = q.list();


                              if (resultList.isEmpty())
                                    {

                                    WA2Motor.informeAlocado().println("$Vazio$");

                                    }


                              else if (parametro.toLowerCase().contains(WA2Dados.estes()[0]))
                                    {

                                    new WA2FiltroMinimo(
                                          Wikia2tAdministrador.class.getSimpleName().toLowerCase()).impressaoSimples(
                                          resultList);
                                    }
                              else if (parametro.toLowerCase().contains(WA2Dados.estes()[1]))
                                    {

                                    new WA2FiltroMinimo(
                                          Wikia2tChaveautadm.class.getSimpleName().toLowerCase()).impressaoSimples(
                                          resultList);
                                    }
                              else if (parametro.toLowerCase().contains(WA2Dados.estes()[2]))
                                    {

                                    new WA2FiltroMinimo(
                                          Wikia2tChaveautedi.class.getSimpleName().toLowerCase()).impressaoSimples(
                                          resultList);
                                    }
                              else if (parametro.toLowerCase().contains(WA2Dados.estes()[3]))
                                    {

                                    new WA2FiltroMinimo(
                                          Wikia2tContribuinte.class.getSimpleName().toLowerCase()).impressaoSimples(
                                          resultList);
                                    }
                              else if (parametro.toLowerCase().contains(WA2Dados.estes()[4]))
                                    {

                                    new WA2FiltroMinimo(Wikia2tPublicacao.class.getSimpleName().toLowerCase()).impressaoSimples(
                                          resultList);
                                    }
                              else if (parametro.toLowerCase().contains(WA2Dados.estes()[5]))
                                    {

                                    new WA2FiltroMinimo(
                                          Wikia2tSelecionadas.class.getSimpleName().toLowerCase()).impressaoSimples(
                                          resultList);
                                    }




                              session.getTransaction().commit();

                              new WA2Coletor().desalocar();

                              this.finalize();
                              }
                        catch (Exception ex)
                              {

                              WA2Motor.informeAlocado().printf("&&%s&&\n", ex.toString());

                              new WA2Coletor().desalocar();
                              }
                        catch (Throwable ex)
                              {

                              WA2Motor.informeAlocado().printf("&&%s&&\n", ex.toString());

                              new WA2Coletor().desalocar();
                              }



                        }


                  }).run();


            }


      private final
            void getDiretivaUnitaria(final
                  String parametro)
            {

            new Thread(new Runnable()
                  {


                  @Override
                  public
                        void run()
                        {


                        try
                              {

                              WA2Motor.informeAlocado().printf(
                                    "$getDiretivaUnitaria em andamento! Solicitada em %d$\n",
                                    new Date().getTime());


                              final
                                    Session session = WA2HibernateInterno.getSessionFactory().openSession();
                              session.beginTransaction();

                              final
                                    Query q = session.createQuery(parametro);

                              final
                                    List resultList = q.list();


                              if (resultList.isEmpty())
                                    {

                                    WA2Motor.informeAlocado().println("$Vazio$");

                                    }
                              else
                                    {

                                    final
                                          Object estruturaConstituida = new WA2Uniao().getEstruturaParticular(resultList);

                                    WA2Motor.informeAlocado().printf("$Objeto unico com tipagem->%s$\n",
                                          estruturaConstituida.getClass().getSimpleName());

                                    WA2Motor.informeAlocado().println("$$");
                                    WA2Motor.informeAlocado().println(estruturaConstituida);
                                    WA2Motor.informeAlocado().println("$$");

                                    }


                              session.getTransaction().commit();
                              new WA2Coletor().desalocar();

                              this.finalize();
                              }
                        catch (Exception ex)
                              {
                              WA2Motor.informeAlocado().printf("&&%s&&\n", ex.toString());

                              new WA2Coletor().desalocar();
                              }
                        catch (Throwable ex)
                              {

                              WA2Motor.informeAlocado().printf("&&%s&&\n", ex.toString());

                              new WA2Coletor().desalocar();
                              }


                        }


                  }).run();




            }


      private final
            void getPonteiroADiretiva(final
                  String parametro)
            {

            new Thread(new Runnable()
                  {


                  @Override
                  public
                        void run()
                        {


                        try
                              {

                              WA2Motor.informeAlocado().printf(
                                    "$getPonteiroADiretiva em andamento! Solicitada em %d$\n",
                                    new Date().getTime());


                              final
                                    Session session = WA2HibernateInterno.getSessionFactory().openSession();
                              session.beginTransaction();

                              final
                                    Query q = session.createQuery(parametro);

                              final
                                    List resultList = q.list();


                              if (resultList.isEmpty())
                                    {

                                    WA2Motor.informeAlocado().println("$Vazio$");

                                    }
                              else
                                    {

                                    final
                                          Object estruturasDisponiveis[] =
                                          new WA2Uniao().getEstruturas(resultList);

                                    WA2Motor.informeAlocado().printf("$Buffer com tipagem->%s$\n",
                                          estruturasDisponiveis.getClass().getSimpleName());

                                    WA2Motor.informeAlocado().println("$$");
                                    WA2Motor.informeAlocado().println(estruturasDisponiveis);
                                    WA2Motor.informeAlocado().println("$$");

                                    }


                              session.getTransaction().commit();
                              new WA2Coletor().desalocar();

                              this.finalize();
                              }
                        catch (Exception ex)
                              {
                              WA2Motor.informeAlocado().printf("&&%s&&\n", ex.toString());

                              new WA2Coletor().desalocar();
                              }
                        catch (Throwable ex)
                              {
                              WA2Motor.informeAlocado().printf("&&%s&&\n", ex.toString());

                              new WA2Coletor().desalocar();
                              }


                        }


                  }).run();


            }


      }



