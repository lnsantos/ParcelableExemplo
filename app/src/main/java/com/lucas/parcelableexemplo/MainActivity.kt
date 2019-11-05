package com.lucas.parcelableexemplo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.IntegerRes
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var person: Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        person = Person(null,0)
        if (v != null){
            when(v){
                button -> {
                    person.name = editText.text.toString()
                    person.group = 0

                    val intent = Intent(this,ProfileActivity::class.java)
                    intent.putExtra("user",person)
                    startActivity(intent)
                }
            }
        }
    }
}
