package proyecto_interes;

/**
 *Cálculo de interés simple = capital * redito * tiempo/100.
 * El capital y el tiempo son >0.
 * El redito puede ser negativo o cero.
 * @author Irene Rey
 */
public class Interes {

    /**
     * Declarar las variables
     */
    public int x=2;
    private float capital;
    private float redito;
    private int tiempo;

    /**
     *
     * @param capital
     * @param redito
     * @param tiempo
     * 
     */
    public Interes(float capital, float redito, int tiempo) {        
        this.capital=capital;
        this.redito=redito;
        this.tiempo=tiempo;
    }

    /**
     *
     * @return
     * @throws Exception
     */
    public double CalcularInteres()throws Exception{
        if (capital<=0)
            throw (new Exception ("Error. El capital tiene que ser >=0"));
        if (tiempo<=0)
            throw (new Exception ("Error. El interés tiene que ser >=0"));
        x=25;
        return (double)capital*redito*tiempo/100;
    }
}
