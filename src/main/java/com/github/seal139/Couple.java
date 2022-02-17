/**
 * 
 */
package com.github.seal139;

/**
 * Tuple of 2 elements
 * 
 * @author Septian Pramana R
 *
 */
public final class Couple<K, A> extends Tuple<K> {

    private final A a;

    /**
     * Initialize Couple
     * 
     * @param k
     * @param a
     */
    public Couple(K k, A a) {
        super(k);
        this.a = a;
    }

    /**
     * @return the a
     */
    public A getA() { return this.a; }

}
