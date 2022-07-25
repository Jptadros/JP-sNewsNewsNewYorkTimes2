package com.jptadros.jpsnewsnewyorktimes.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.jptadros.jpsnewsnewyorktimes.R
import com.jptadros.jpsnewsnewyorktimes.databinding.ActivityAboutUsBinding
import com.jptadros.jpsnewsnewyorktimes.databinding.ActivityWebNewsBinding

class WebNewsActivity : AppCompatActivity() {

    lateinit var binding: ActivityWebNewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_news)


        setContentView(R.layout.activity_about_us)
        binding = ActivityWebNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myWebView = binding.wvNews

        myWebView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url: String
            ): Boolean {
                view.loadUrl(url)
                return true
            }
        }
        val ss:String = intent.getStringExtra("url").toString()
        myWebView.loadUrl(ss)
        myWebView.settings.allowContentAccess = true
        myWebView.settings.domStorageEnabled = true
        myWebView.settings.useWideViewPort = true

    }
}

