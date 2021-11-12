package com.example.newstyle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showButton: Button =findViewById(R.id.show_button)

        showButton.setOnClickListener {
        showSnackbar(it)
    }

    }

    private fun showSnackbar(view: View){
        Snackbar.make(this,view, "Snackbar showed",Snackbar.LENGTH_INDEFINITE)
            .setAction("Action") {
                Toast.makeText(this, "Toast!", Toast.LENGTH_LONG).show()
            }
                    .show()
            }

            }



