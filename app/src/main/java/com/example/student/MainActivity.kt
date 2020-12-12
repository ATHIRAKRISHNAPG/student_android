package com.example.student

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Registered(view: View) {

        var getName= findViewById<EditText>(R.id.Name)
        var getRollno= findViewById<EditText>(R.id.Rollno)
        var getCollege= findViewById<EditText>(R.id.College)
        var getParentname= findViewById<EditText>(R.id.Parentname)
        var getParentid= findViewById<EditText>(R.id.Parentid)
        var getmob= findViewById<EditText>(R.id.mobno)
        var getUsername= findViewById<EditText>(R.id.Uname)
        var getPassword= findViewById<EditText>(R.id.Paswrd)
        var getConfirmpaswrd= findViewById<EditText>(R.id.confirmpaswrd)
        Toast.makeText(this,getName.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getRollno.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getCollege.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getParentname.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getParentname.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getParentid.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getmob.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getUsername.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getPassword.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getConfirmpaswrd.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,"Registered",Toast.LENGTH_LONG).show()
    }
}