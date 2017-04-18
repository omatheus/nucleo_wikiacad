
package fs.br.sp.fatec.mc.wikiacad2init.seguranca.shadow.metodos;




import fs.br.sp.fatec.mc.wikiacad2init.logistico.adendo.WA2Coletor;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;




public
      class WA2Margem
      {




      public
            WA2Margem()
            {
            }


      public static
            PrintStream std()
            {
            return System.out;
            }




      public final
            class WA2DES_Criptografar
            {




            public
                  WA2DES_Criptografar(final
                        String chave, InputStream entrada, OutputStream saida, final
                                      long aut1, final
                                      long aut2) throws Exception
                  {

                  if (aut1 == WA2MargemAutenticado.H_EXEC1)
                        {
                        WA2Margem.std().println("&Metodologia: Criptografar&");
                        this.executarC(chave, entrada, saida, aut2);
                        new WA2Coletor().desalocar();
                        }

                  else
                        {
                        throw new Exception("&Impedido de prosseguir&");
                        }

                  }


            private final
                  short executarC(final
                        String chave, InputStream entrada, OutputStream saida, final
                                  long aut)
                  {

                  try
                        {

                        assert (aut > 0x01);

                        if (aut == WA2MargemAutenticado.H_EXEC2)
                              {
                              final
                                    DESKeySpec dks = new DESKeySpec(chave.getBytes());
                              final
                                    SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");

                              SecretKey desKey = skf.generateSecret(dks);

                              Cipher cipher = Cipher.getInstance("DES");


                              cipher.init(Cipher.ENCRYPT_MODE, desKey);

                              final
                                    CipherInputStream cis = new CipherInputStream(entrada, cipher);


                              byte[] bytes = new byte[256];
                              int numBytes;

                              while ((numBytes = cis.read(bytes)) != -1)
                                    {
                                    saida.write(bytes, 0, numBytes);
                                    }

                              saida.flush();
                              saida.close();
                              saida.close();
                              saida = null;


                              return 0xff;
                              }
                        else
                              {

                              return 0xf3;
                              }

                        }
                  catch (Exception ex)
                        {
                        ex.printStackTrace();
                        }


                  return 0xf1;

                  }


            }




      public final
            class WA2DES_Criptografar_Runtime
            {




            public
                  WA2DES_Criptografar_Runtime()
                  {
                  }


            public
                  void desalocar()
                  {
                  new WA2Coletor().desalocar();
                  }


            public final
                  String executarC(final
                        String chave, String entrada, final
                                   long aut)
                  {

                  try
                        {

                        assert (aut > 0x01);

                        if (aut == WA2MargemAutenticado.H_EXEC2)
                              {

                              final
                                    DESKeySpec dks = new DESKeySpec(chave.getBytes());
                              final
                                    SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");

                              SecretKey desKey = skf.generateSecret(dks);

                              Cipher cipher = Cipher.getInstance("DES");


                              cipher.init(Cipher.ENCRYPT_MODE, desKey);


                              final
                                    byte[] cis = cipher.doFinal(entrada.getBytes());



                              return new sun.misc.BASE64Encoder().encode(cis);

                              }
                        else
                              {

                              return "NULO";
                              }

                        }
                  catch (Exception ex)
                        {
                        ex.printStackTrace();
                        }


                  return "NULO";

                  }


            }




      public final
            class WA2DES_Descriptografar_Runtime
            {




            public
                  WA2DES_Descriptografar_Runtime()
                  {
                  }


            public
                  void desalocar()
                  {
                  new WA2Coletor().desalocar();
                  }


            public final
                  String executarD(final
                        String chave, String entrada, final
                                   long aut)
                  {

                  try
                        {

                        assert (aut > 0x01);

                        if (aut == WA2MargemAutenticado.H_EXEC2)
                              {

                              final
                                    DESKeySpec dks = new DESKeySpec(chave.getBytes());
                              final
                                    SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");

                              SecretKey desKey = skf.generateSecret(dks);

                              Cipher cipher = Cipher.getInstance("DES");


                              cipher.init(Cipher.DECRYPT_MODE, desKey);


                              final
                                    byte[] cis = cipher.doFinal(new sun.misc.BASE64Decoder().decodeBuffer(entrada));



                              return new String(cis, "UTF-8");

                              }
                        else
                              {

                              return "NULO";
                              }

                        }
                  catch (Exception ex)
                        {
                        ex.printStackTrace();
                        }


                  return "NULO";

                  }


            }




      public final
            class WA2DES_Descriptografar
            {




            public
                  WA2DES_Descriptografar(final
                        String chave, InputStream entrada, OutputStream saida, final
                                         long aut1, final
                                         long aut2) throws Exception
                  {

                  if (aut1 == WA2MargemAutenticado.H_EXEC1)
                        {
                        WA2Margem.std().println("&Metodologia: Descriptografar&");
                        this.executarD(chave, entrada, saida, aut2);
                        new WA2Coletor().desalocar();
                        }

                  else
                        {
                        throw new Exception("&Impedido de prosseguir&");
                        }

                  }


            private final
                  short executarD(final
                        String chave, InputStream entrada, OutputStream saida, final
                                  long aut)
                  {

                  try
                        {


                        assert (aut > 0x01);

                        if (aut == WA2MargemAutenticado.H_EXEC2)
                              {
                              final
                                    DESKeySpec dks = new DESKeySpec(chave.getBytes());
                              final
                                    SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");

                              SecretKey desKey = skf.generateSecret(dks);

                              Cipher cipher = Cipher.getInstance("DES");


                              cipher.init(Cipher.DECRYPT_MODE, desKey);

                              final
                                    CipherOutputStream cis = new CipherOutputStream(saida, cipher);


                              byte[] bytes = new byte[256];
                              int numBytes;

                              while ((numBytes = entrada.read(bytes)) != -1)
                                    {
                                    cis.write(bytes, 0, numBytes);
                                    }

                              saida.flush();
                              saida.close();
                              saida.close();
                              saida = null;


                              return 0xff;
                              }
                        else
                              {

                              return 0xf3;
                              }


                        }
                  catch (Exception ex)
                        {
                        ex.printStackTrace();
                        }



                  return 0xf1;

                  }


            }




      }



