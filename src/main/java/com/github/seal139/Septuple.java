/**
 * 
 */
package com.github.seal139;

/**
 * Tuple of 7 elements
 * 
 * @author Septian Pramana R
 *
 */
public class Septuple<K, A, B, C, D, E, F> extends Tuple<K> {
    private final A a;
    private final B b;
    private final C c;
    private final D d;
    private final E e;
    private final F f;

    /**
     * Initialize Septuple
     * 
     * @param k
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @param f
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
}
