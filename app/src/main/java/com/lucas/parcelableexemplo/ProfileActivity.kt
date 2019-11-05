package com.lucas.parcelableexemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val personActivity = intent.getParcelableExtra<Person>("user")

        if(personActivity != null){
            name.text = personActivity.name
        }else name.text = "VALOR NULL"
        
    }

}
