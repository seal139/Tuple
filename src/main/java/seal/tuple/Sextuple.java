/**
 * 
 */
package seal.tuple;

/**
 * Tuple of 6 elements
 * 
 * @author Septian Pramana R
 *
 */
public class Sextuple<K, A, B, C, D, E> extends Tuple<K> {
    private final A a;
    private final B b;
    private final C c;
    private final D d;
    private final E e;

    /**
     * Initialize Sextuple
     * 
     * @param k
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     */
    public Sextuple(K k, A a, B b, C c, D d, E e) {
        super(k);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
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

    /**
     * @return the d
     */
    public D getD() { return this.d; }

    /**
     * @return the e
     */
    public E getE() { return this.e; }
}
