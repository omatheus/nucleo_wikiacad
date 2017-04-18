
package fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.processo.orientado;




import fs.br.sp.fatec.mc.wikiacad2init.logistico.adendo.WA2Coletor;
import fs.br.sp.fatec.mc.wikiacad2init.logistico.adendo.WA2SaidaPadrao;
import fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.crucial.WA2HibernateInterno;
import java.io.PrintStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;




public
      class WA2MotorImagem<C> implements WA2SaidaPadrao
      {




      public
            WA2MotorImagem()
            {
            }


      @Override
      public
            PrintStream informe()
            {
            return System.out;
            }


      public final synchronized
            C getEntidade(final
                  String argumento)
            {

            assert (!argumento.equals(""));

            this.informe().printf("$getEntidade disparada;%s;%s;%s$\n", this.getClass().getPackage().getName(),
                  this.getClass().getName(), new Date().toInstant().toString());


            C entidade = null;


            try
                  {

                  final
                        Session session = WA2HibernateInterno.getSessionFactory().openSession();
                  session.beginTransaction();

                  final
                        Query q = session.createQuery(argumento);

                  final
                        List resultList = q.list();


                  if (resultList.isEmpty())
                        {

                        this.informe().println("$Vazio$");

                        }
                  else
                        {

                        entidade = (C) resultList.get(0);

                        }

                  }
            catch (Exception ex)
                  {

                  this.informe().printf("&&%s&&", ex.toString());

                  }


            new WA2Coletor().desalocar();

            return entidade;
            }


      public final synchronized
            HashMap<Long, C> getEntidades(final
                  String argumento)
            {

            assert (!argumento.equals(""));

            this.informe().printf("$getEntidades disparada;%s;%s;%s$\n", this.getClass().getPackage().getName(),
                  this.getClass().getName(), new Date().toInstant().toString());


            HashMap<Long, C> entidades = new HashMap<>();

            try
                  {

                  final
                        Session session = WA2HibernateInterno.getSessionFactory().openSession();
                  session.beginTransaction();

                  final
                        Query q = session.createQuery(argumento);

                  final
                        List resultList = q.list();


                  if (resultList.isEmpty())
                        {

                        this.informe().println("$Vazio$");

                        }
                  else
                        {

                        long index = 100000L;

                        for (Object procede
                             : resultList)
                              {

                              entidades.put(index, (C) procede);

                              index += 1;
                              }

                        }

                  }
            catch (Exception ex)
                  {

                  this.informe().printf("&&%s&&", ex.toString());

                  }

            new WA2Coletor().desalocar();

            return entidades;
            }


      }



