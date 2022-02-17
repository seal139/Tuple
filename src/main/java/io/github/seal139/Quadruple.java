/**
 * 
 */
package io.github.seal139;

/**
 * Tuple of 4 elements
 * 
 * @author Septian Pramana R
 *
 * @param <K> 1st tuple element
 * @param <A> 2nd tuple element
 * @param <B> 3rd tuple element
 * @param <C> 4th tuple element
 */
public final class Quadruple<K, A, B, C> extends Tuple<K> {
    private final A a;
    private final B b;
    private final C c;

    /**
     * Initialize Quadruple
     * 
     * @param k : 1st element object
     * @param a : 2nd element object
     * @param b : 3rd element object
     * @param c : 4th element object
     */
    public Quadruple(K k, A a, B b, C c) {
        super(k);
        this.a = a;
        this.b = b;
        this.c = c;
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
}
