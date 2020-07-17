package com.example.basicmodelkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import androidx.core.view.get

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val webView=findViewById<WebView>(R.id.Web)
        var fn="Link1.html"
        webView.settings.javaScriptEnabled
        webView.loadUrl("file:///android_asset/"+fn)
    }
}
