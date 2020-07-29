package kr.ac.kpu.optionmenutest

//firebase 추가버전 -snowflo-

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, SecondActivity::class.java)
        cityButton.setOnClickListener(){
            startActivity(intent)
        }

       /* val ApiIntent = Intent(this,ApiTestField::class.java)
        ApiTestButton.setOnClickListener(){
            startActivity(ApiIntent)
        }
       */
    }
}