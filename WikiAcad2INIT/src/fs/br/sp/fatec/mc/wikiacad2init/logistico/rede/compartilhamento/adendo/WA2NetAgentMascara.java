
package fs.br.sp.fatec.mc.wikiacad2init.logistico.rede.compartilhamento.adendo;




public abstract
      class WA2NetAgentMascara
      {




      public static final
            String formatacaoMinima(
                  String alvo, String... adicionais)
            {

            if (adicionais.length < 1 || adicionais == null)
                  {

                  return alvo + "<br>";

                  }
            else
                  {

                  for (short percorre = 0;
                       percorre < adicionais.length;
                       percorre++)
                        {

                        if (percorre == 0 || percorre % 2 == 0)
                              {

                              alvo = alvo + adicionais[percorre];

                              }
                        else
                              {

                              alvo = adicionais[percorre] + alvo;

                              }

                        }


                  return alvo;
                  }

            }


      }



