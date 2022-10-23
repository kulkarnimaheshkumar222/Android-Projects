package com.mahesh.mydiary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var userName: EditText
    private lateinit var password: EditText
    private lateinit var signInButton: Button
    private  lateinit var createNewAccountButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userName = findViewById(R.id.userNameEditTextId)
        password = findViewById(R.id.passwordEditTextId)
        signInButton = findViewById(R.id.logInBtnId)
        createNewAccountButton = findViewById(R.id.createNewAccountBtnId)

    }

    fun logInBtnClicked(view: View) {
        val mToast = Toast.makeText(applicationContext,"Log In clicked", Toast.LENGTH_SHORT)
        mToast.show()
    }

    fun createNewAccountBtnClicked(view: View) {
        val mToast = Toast.makeText(applicationContext,"Create New clicked", Toast.LENGTH_SHORT)
        mToast.show()
    }


}