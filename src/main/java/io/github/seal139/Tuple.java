package io.github.seal139;

/**
 * Base class of Tuple. <br/>
 * Tuple value are immutable
 * 
 * @author Septian Pramana R
 *
 * @param <K> Key element
 */
public abstract class Tuple<K> implements Comparable<Tuple<K>> {
    protected final K k;

    /**
     * Initialize Tuple key
     * 
     * @param k 1st element as a key
     */
    public Tuple(K k) {
        this.k = k;
    }

    @Override
    @SuppressWarnings({
            "unchecked", "rawtypes" })
    public int compareTo(Tuple<K> o) {
        // If K is comparable, we simple compare them
        if (this.k instanceof Comparable<?>) {
            return ((Comparable) this.k).compareTo(o.k);
        }

        // Otherwise, we compare the HashCode of element K
        if (this.k.hashCode() == o.k.hashCode()) {
            return 0;
        }

        if (this.k.hashCode() > o.k.hashCode()) {
            return 1;
        }

        return -1;
    }

    /**
     * @return the 1st element
     */
    public K getK() { return this.k; }
}
