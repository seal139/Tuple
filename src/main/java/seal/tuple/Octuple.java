/**
 * 
 */
package seal.tuple;

/**
 * Tuple of 8 elements
 * 
 * @author Septian Pramana R
 *
 */
public class Octuple<K, A, B, C, D, E, F, G> extends Tuple<K> {
    private final A a;
    private final B b;
    private final C c;
    private final D d;
    private final E e;
    private final F f;
    private final G g;

    /**
     * Initialize Octuple
     * 
     * @param k
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @param f
     * @param g
     */
    public Octuple(K k, A a, B b, C c, D d, E e, F f, G g) {
        super(k);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
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

    /**
     * @return the f
     */
    public F getF() { return this.f; }

    /**
     * @return the g
     */
    public G getG() { return this.g; }
}
