/**
 * 
 */
package seal.tuple;

/**
 * Tuple of 4 elements
 * 
 * @author Septian Pramana R
 *
 */
public class Quadruple<K, A, B, C> extends Tuple<K> {
    private final A a;
    private final B b;
    private final C c;

    /**
     * Initialize Quadruple
     * 
     * @param k
     * @param a
     * @param b
     * @param c
     */
    public Quadruple(K k, A a, B b, C c) {
        super(k);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * @return the a
     */
    public A getA() { return this.a; }

    /**
     * @return the b
     */
    public B getB() { return this.b; }

    /**
     * @return the c
     */
    public C getC() { return this.c; }
}
