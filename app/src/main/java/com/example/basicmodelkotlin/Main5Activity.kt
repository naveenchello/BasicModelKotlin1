package com.example.basicmodelkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Main5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        var fn="Link4.html"
        val webView=findViewById<WebView>(R.id.Web)
        webView.settings.javaScriptEnabled
        webView.loadUrl("file:///android_asset/"+fn)
    }
}
