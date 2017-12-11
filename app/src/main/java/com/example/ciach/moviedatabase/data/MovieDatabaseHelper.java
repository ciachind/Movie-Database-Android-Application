package com.example.ciach.moviedatabase.data;

/*
  Created by ciach on 11/30/2017.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.ciach.moviedatabase.data.DatabaseDescription.Movie;

class MovieDatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "MovieDatabase.db";
    private static final int DATABASE_VERSION = 1;

    // constructor
    public MovieDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // creates the movies table when the database is created
    @Override
    public void onCreate(SQLiteDatabase db) {
        // SQL for creating the movies table
        final String CREATE_MOVIES_TABLE =
                "CREATE TABLE " + Movie.TABLE_NAME + "(" +
                        Movie._ID + " integer primary key, " +
                        Movie.COLUMN_MOVIE + " TEXT, " +
                        Movie.COLUMN_DIRECTOR + " TEXT, " +
                        Movie.COLUMN_ACTOR + " TEXT, " +
                        Movie.COLUMN_YEAR + " TEXT, " +
                        Movie.COLUMN_GENRE + " TEXT);";
        db.execSQL(CREATE_MOVIES_TABLE); // create the movies table
    }

    // normally defines how to upgrade the database when the schema changes
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,
                          int newVersion) { }
}
