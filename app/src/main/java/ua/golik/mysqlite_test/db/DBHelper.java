package ua.golik.mysqlite_test.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Max Golik DESKTOP on 24.03.2018.
 */

public class DBHelper extends SQLiteOpenHelper {

    private final String DATABASE_NAME = "TestDB.db";

    public DBHelper(Context context){
        super(context, DATABASE_NAME , null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
