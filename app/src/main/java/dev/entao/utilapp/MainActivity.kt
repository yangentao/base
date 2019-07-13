package dev.entao.utilapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
//import dev.entao.kan.log.logd

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun finish() {
        super.finish()
//        logd("MainActivity", "finish()")
    }


}
