/**
 * 
 */
package seal.tuple;

/**
 * Tuple of 10 elements
 * 
 * @author Septian Pramana R
 *
 */
public class Decuple<K, A, B, C, D, E, F, G, H, I> extends Tuple<K> {
    private final A a;
    private final B b;
    private final C c;
    private final D d;
    private final E e;
    private final F f;
    private final G g;
    private final H h;
    private final I i;

    /**
     * Initialize Decuple
     * 
     * @param k
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @param f
     * @param g
     * @param h
     * @param i
     */
    public Decuple(K k, A a, B b, C c, D d, E e, F f, G g, H h, I i) {
        super(k);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
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

    /**
     * @return the h
     */
    public H getH() { return this.h; }

    /**
     * @return the i
     */
    public I getI() { return this.i; }
}
