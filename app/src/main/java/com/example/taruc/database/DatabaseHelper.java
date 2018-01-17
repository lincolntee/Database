package com.example.taruc.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by taruc on 17/1/2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "contactManager";
    private static final String TABLE_CONTACT = "contact";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "nane";
    private static final String KEY_PHONE = "phone";

    public DatabaseHandler(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase database)
    {
        String CREATE_CONTACT_TABLE = "CREATE TABLE" + TABLE_CONTACT +
                "(" + KEY_ID + "INTEGER PRIMARY KEY," + KEY_NAME + " TEXT,"
                + KEY_PHONE + " TEXT" + ")";
                database.execSQL(CREATE_CONTACT_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
        database.execSQL("DROP TABLE IF EXIST " + TABLE_CONTACT);
        onCreate(database);
    }
    void addContact(Contact contact)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues value = new ContentValues();
        value.put("KEY_NAME", contact.getName());
        value.put("KEY_PHONE", contact.getPhoneNumber());
        database.insert(TABLE_CONTACT, null, value);
        database.close();
    }
    Contact getContact(int id)
    {
        SQLiteDatabase database = this.getReadableDatabase();
        Cursor cursor = database.query(TABLE_CONTACT), new String[] {KEY_ID, KEY_NAME, KEY_PHONE), KEY_ID
        }
    }

}
