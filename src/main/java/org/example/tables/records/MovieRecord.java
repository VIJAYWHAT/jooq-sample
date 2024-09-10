/*
 * This file is generated by jOOQ.
 */
package org.example.tables.records;


import org.example.tables.Movie;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class MovieRecord extends UpdatableRecordImpl<MovieRecord> {

    protected static final long serilversionUID = 1L;

    /**
     * Setter for <code>public.movie.id</code>.
     */
    public void setId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.movie.id</code>.
     */
    public Short getId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>public.movie.title</code>.
     */
    public void setTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.movie.title</code>.
     */
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.movie.directed_by</code>.
     */
    public void setDirectedBy(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.movie.directed_by</code>.
     */
    public String getDirectedBy() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Short> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MovieRecord
     */
    public MovieRecord() {
        super(Movie.MOVIE);
    }

    /**
     * Create a detached, initialised MovieRecord
     */
    public MovieRecord(Short id, String title, String directedBy) {
        super(Movie.MOVIE);

        setId(id);
        setTitle(title);
        setDirectedBy(directedBy);
        resetChangedOnNotNull();
    }
}
