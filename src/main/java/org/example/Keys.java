/*
 * This file is generated by jOOQ.
 */
package org.example;


import org.example.tables.Movie;
import org.example.tables.records.MovieRecord;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<MovieRecord> MOVIE_PKEY = Internal.createUniqueKey(Movie.MOVIE, DSL.name("movie_pkey"), new TableField[] { Movie.MOVIE.ID }, true);
}
