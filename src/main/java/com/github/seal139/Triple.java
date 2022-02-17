/**
 * 
 */
package com.github.seal139;

/**
 * Tuple of 3 elements
 * 
 * @author Septian Pramana R
 *
 */
public class Triple<K, A, B> extends Tuple<K> {
    private final A a;
    private final B b;

    /**
     * Initialize Triple
     * 
     * @param k
     * @param a
     */
    public Triple(K k, A a, B b) {
        super(k);
        this.a = a;
        this.b = b;
    }

    /**
     * @return the a
     */
    public A getA() { return this.a; }

    /**
     * @return the b
     */
    public B getB() { return this.b; }
}
