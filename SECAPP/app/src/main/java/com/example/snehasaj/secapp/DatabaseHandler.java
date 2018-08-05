package com.example.snehasaj.secapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "home_automation";
    private static final String TABLE_NAME = "login";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_PASSWORD = "password";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        String Create_Profile="CREATE TABLE " + TABLE_NAME + "("
                + KEY_USERNAME + "INTEGER PRIMARYKEY"
                + KEY_PASSWORD + "TEXT" + ")";
        db.execSQL(Create_Profile);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldversion, int newversion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}

