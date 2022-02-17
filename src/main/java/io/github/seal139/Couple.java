package io.github.seal139;

/**
 * Tuple of 2 elements
 * 
 * @author Septian Pramana R
 *
 * @param <K> 1st tuple element
 * @param <A> 2nd tuple element
 */
public final class Couple<K, A> extends Tuple<K> {
    private final A a;

    /**
     * Initialize Couple
     * 
     * @param k : 1st element object
     * @param a : 2nd element object
     */
    public Couple(K k, A a) {
        super(k);
        this.a = a;
    }

    /**
     * Return the 2nd element
     * 
     * @return object of 2nd element
     */
    public A getA() { return this.a; }
}
