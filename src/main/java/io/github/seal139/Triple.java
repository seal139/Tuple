/**
 * 
 */
package io.github.seal139;

/**
 * Tuple of 3 elements
 * 
 * @author Septian Pramana R
 *
 * @param <K> 1st tuple element
 * @param <A> 2nd tuple element
 * @param <B> 3rd tuple element
 */
public final class Triple<K, A, B> extends Tuple<K> {
    private final A a;
    private final B b;

    /**
     * Initialize Triple
     * 
     * @param k : 1st element object
     * @param a : 2nd element object
     * @param b : 3rd element object
     */
    public Triple(K k, A a, B b) {
        super(k);
        this.a = a;
        this.b = b;
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

}
