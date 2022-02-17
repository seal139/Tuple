/**
 * 
 */
package com.github.seal139;

/**
 * Tuple of 5 elements
 * 
 * @author Septian Pramana R
 *
 */
public class Quintuple<K, A, B, C, D> extends Tuple<K> {
    private final A a;
    private final B b;
    private final C c;
    private final D d;

    /**
     * Initialize Quintuple
     * 
     * @param k
     * @param a
     * @param b
     * @param c
     * @param d
     */
    public Quintuple(K k, A a, B b, C c, D d) {
        super(k);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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
}
