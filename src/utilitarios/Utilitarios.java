
package utilitarios;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * Esta classe agrupa metodos uteis que podem ser utilizadas de maneira geral.
 *
 */
public class Utilitarios {

    /**
     * @return Retorna um valor booleano aleatoriamente
     */
    public static boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
    
    /**
     *
     * @return Retorna um valor Float referente a efetividade da ação executada.
     */
    public static Float getRandomEfetividade() {
        Random random = new Random();
        Integer valorInteiro = random.nextInt(11);
        String valorFormatado = formatarFloat((valorInteiro * ((float) 0.1)));
        Float ret = Float.valueOf(valorFormatado);
        return ret;
    }
    
    /**
     *
     * @param valor Float com quantidade indeterminada de casas
     * @return Retorna um valor flat formatado com duas casas e utilizando '.' como separador numerico
     */
    public static String formatarFloat(Float valor){        
        String retorno;
        DecimalFormat dec = new DecimalFormat("0.00");
        retorno = dec.format(valor).replace(',', '.');
        return retorno;
    }
}
