/**
 * 
 */
package io.github.seal139;

/**
 * Tuple of 10 elements
 * 
 * @author Septian Pramana R
 *
 * @param <K> 1st tuple element
 * @param <A> 2nd tuple element
 * @param <B> 3rd tuple element
 * @param <C> 4th tuple element
 * @param <D> 5th tuple element
 * @param <E> 6th tuple element
 * @param <F> 7th tuple element
 * @param <G> 8th tuple element
 * @param <H> 9th tuple element
 * @param <I> 10th tuple element
 */
public final class Decuple<K, A, B, C, D, E, F, G, H, I> extends Tuple<K> {
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
     * @param k : 1st element object
     * @param a : 2nd element object
     * @param b : 3rd element object
     * @param c : 4th element object
     * @param d : 5th element object
     * @param e : 6th element object
     * @param f : 7th element object
     * @param g : 8th element object
     * @param h : 9th element object
     * @param i : 10th element object
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
     * @return the 2nd element
     */
    public A getA() { return this.a; }

    /**
     * @return the 3rd element
     */
    public B getB() { return this.b; }

    /**
     * @return the 4th element
     */
    public C getC() { return this.c; }

    /**
     * @return the 5th element
     */
    public D getD() { return this.d; }

    /**
     * @return the 6th element
     */
    public E getE() { return this.e; }

    /**
     * @return the 7th element
     */
    public F getF() { return this.f; }

    /**
     * @return the 8th element
     */
    public G getG() { return this.g; }

    /**
     * @return the 9th element
     */
    public H getH() { return this.h; }

    /**
     * @return the 10th element
     */
    public I getI() { return this.i; }
}
