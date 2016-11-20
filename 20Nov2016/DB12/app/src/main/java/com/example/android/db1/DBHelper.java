package com.example.android.db1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by zeeshanhanif-pc on 11/20/2016.
 */
public class DBHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "inventory.db";
    public static final int DB_VERSION = 2;


    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL = "CREATE TABLE products (id INTEGER, name TEXT, price INTEGER)";
        db.execSQL(SQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String SQL = "DROP TABLE IF EXISTS products";
        db.execSQL(SQL);
        onCreate(db);
    }

    public void insertRow(){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("id", 1);
        values.put("name", "Item 1");
        values.put("price", 50);

        db.insert("products", null, values);

        db.close();
    }

    public void readDB(){

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * from products", null);
        //cursor.moveToFirst();

        while (cursor.moveToNext()){
            int id = cursor.getInt(0);
            String productName = cursor.getString(1);
            int price = cursor.getInt(2);

            Log.d("DATA ", "ID = "+ id + ", Name  =" + productName + ", price = " + price);
        }

        db.close();

    }

}
