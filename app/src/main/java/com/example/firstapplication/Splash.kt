package com.example.firstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import java.lang.Thread.sleep
import kotlin.concurrent.thread as thread1

class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish();

        }, 5000)

//
//        Thread thread = new Thread(new Runnable () {
//        public void run() {
//            try {
//            sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//            }
//        }
//
//        });
//
//        thread1().start();
    }
}
