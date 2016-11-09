package com.jmjenterprises.martinjude.myapplication.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by martinjude on 11/8/16.
 */

public class TodoDatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "todotable.db";
    private static final int DATABASE_VERSION = 1;
    public TodoDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    /* create a database */
    @Override
    public void onCreate(SQLiteDatabase database) {
        TodoTable.onCreate(database);
    }
    /* increase the database version -> upgrade */
    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
        TodoTable.onUpgrade(database, oldVersion, newVersion);
    }
}
