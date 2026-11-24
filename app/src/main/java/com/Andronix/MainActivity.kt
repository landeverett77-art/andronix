package com.Andronix

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    findViewById<Button>(R.id.primaryButton).setOnClickListener {
      Toast.makeText(this, "It works!", Toast.LENGTH_SHORT).show()
    }
  }
}
