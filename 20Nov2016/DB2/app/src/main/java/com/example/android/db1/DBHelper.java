package com.example.android.db1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by zeeshanhanif-pc on 11/20/2016.
 */
public class DBHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "inventory.db";
    public static final int DB_VERSION = 3;


    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL = "CREATE TABLE products (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, price INTEGER)";
        db.execSQL(SQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String SQL = "DROP TABLE IF EXISTS products";
        db.execSQL(SQL);
        onCreate(db);
    }

    public void insertRow(Product product){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        /*values.put("id", 1);*/
        values.put("name", product.getName());
        values.put("price", product.getPrice());

        db.insert("products", null, values);

        db.close();
    }

    public ArrayList<Product> readDB(){

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * from products", null);

        ArrayList<Product> productList = new ArrayList<>();
        while (cursor.moveToNext()){
            Product product = new Product(cursor.getInt(0), cursor.getString(1), cursor.getInt(2));
            productList.add(product);
        }

        db.close();
        return productList;
    }

}
