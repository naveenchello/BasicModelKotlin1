package com.example.basicmodelkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import androidx.documentfile.provider.DocumentFile
import org.w3c.dom.Document

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var fn="Link2.html"
        val webView=findViewById<WebView>(R.id.Web)
        webView.settings.javaScriptEnabled
        webView.loadUrl("file:///android_asset/"+fn)
    }
}
