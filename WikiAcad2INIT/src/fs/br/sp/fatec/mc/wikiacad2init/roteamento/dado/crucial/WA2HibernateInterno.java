
package fs.br.sp.fatec.mc.wikiacad2init.roteamento.dado.crucial;




import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;




public
      class WA2HibernateInterno
      {




      private static final
            SessionFactory sessionFactory;


      static
            {
            try
                  {

                  sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
                  }
            catch (Throwable ex)
                  {

                  System.err.println("*SessionFactory falhou:" + ex.toString().toLowerCase());
                  throw new ExceptionInInitializerError(ex);

                  }
            }


      public static
            SessionFactory
            getSessionFactory()
            {
            return sessionFactory;
            }


      }



