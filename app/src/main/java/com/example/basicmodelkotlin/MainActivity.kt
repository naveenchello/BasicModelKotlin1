package com.example.basicmodelkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arrayAdapter:ArrayAdapter<*>
        val books= arrayOf("the lion and the mouse","count wisely","the boy who cried wolf","the fox and the stork")
        var lv=findViewById<ListView>(R.id.lst)
        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,books)
        lv.adapter=arrayAdapter
        lv.setOnItemClickListener { parent, view, position, id ->
        var i=arrayAdapter.getItem(position)
        if (i.equals(books[0]))
        { intent=Intent(applicationContext,Main2Activity::class.java)
            startActivity(intent)
        }
        else if (i.equals(books[1]))
        { intent=Intent(applicationContext,Main3Activity::class.java)
            startActivity(intent)
        }
        else if (i.equals(books[2]))
        { intent=Intent(applicationContext,Main4Activity::class.java)
            startActivity(intent)
        }
        else if (i.equals(books[3]))
        { intent=Intent(applicationContext,Main5Activity::class.java)
            startActivity(intent)
        }

        }
    }
}
