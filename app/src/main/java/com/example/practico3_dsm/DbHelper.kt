package com.example.practico3_dsm

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DbHelper(context: Context):SQLiteOpenHelper (context, DB_NAME, null, DB_VERSION) {

    companion object{
        private const val DB_NAME="carsmotors.sqlite"
        private const val DB_VERSION=1
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE user (nombre varchar(45),"+
            "apellido varchar(45)," +
                "email varchar(45)," +
                "usuario varchar(45) primary key," +
                "contraseña varchar(45)," +
                "tipouser varchar(45))")

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

    fun insertdata(
        edtnombre: String,
        edtapellido: String,
        edtemail: String,
        edtusuario: String,
        edtpass: String
    ){

        val db:SQLiteDatabase = writableDatabase
        val cv = ContentValues()
        cv.put("nombre", edtnombre)
        cv.put("apellido", edtapellido)
        cv.put("email", edtemail)
        cv.put("usuario", edtusuario)
        cv.put("pass", edtpass)

        db.insert("user", null,cv)
        db.close()
    }

   fun searchDB(edtnombre: String,edtapellido: String,edtemail: String,edtusuario: String,edtpass: String):Boolean{
       val db:SQLiteDatabase=writableDatabase
       val query="SELECT usuario, pass FROM usuario usuario= '${edtusuario}' and password='${edtpass}'"
       val cursor=db.rawQuery(query, null)
       if(cursor.count<=0){
           cursor.close()
           return false
       }
       cursor.close()
       return true
   }
}


