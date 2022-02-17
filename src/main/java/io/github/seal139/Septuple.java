/**
 * 
 */
package io.github.seal139;

/**
 * Tuple of 7 elements
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
 */
public final class Septuple<K, A, B, C, D, E, F> extends Tuple<K> {
    private final A a;
    private final B b;
    private final C c;
    private final D d;
    private final E e;
    private final F f;

    /**
     * Initialize Septuple
     * 
     * @param k : 1st element object
     * @param a : 2nd element object
     * @param b : 3rd element object
     * @param c : 4th element object
     * @param d : 5th element object
     * @param e : 6th element object
     * @param f : 7th element object
     */
    public Septuple(K k, A a, B b, C c, D d, E e, F f) {
        super(k);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    /**
     * Return the 2nd element
     * 
     * @return object of 2nd element
     */
    public A getA() { return this.a; }

    /**
     * Return the 3rd element
     * 
     * @return object of 3rd element
     */
    public B getB() { return this.b; }

    /**
     * Return the 4th element
     * 
     * @return object of 4th element
     */
    public C getC() { return this.c; }

    /**
     * Return the 5th element
     * 
     * @return object of 5th element
     */
    public D getD() { return this.d; }

    /**
     * Return the 6th element
     * 
     * @return object of 6th element
     */
    public E getE() { return this.e; }

    /**
     * Return the 7th element
     * 
     * @return object of 7th element
     */
    public F getF() { return this.f; }
}
