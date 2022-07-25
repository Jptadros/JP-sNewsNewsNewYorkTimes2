package com.jptadros.jpsnewsnewyorktimes.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.jptadros.jpsnewsnewyorktimes.R
import com.jptadros.jpsnewsnewyorktimes.databinding.ActivityAboutUsBinding

class AboutUsActivity : AppCompatActivity() {

   lateinit var binding: ActivityAboutUsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContentView(R.layout.activity_about_us)
        binding = ActivityAboutUsBinding.inflate(layoutInflater)
        setContentView(binding.root)

       val myWebView = binding.wvAboutUs

        myWebView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url: String
            ): Boolean {
                view.loadUrl(url)
                return true
            }
        }

        myWebView.loadUrl("https://google.com")
        myWebView.settings.allowContentAccess = true
        myWebView.settings.domStorageEnabled = true
        myWebView.settings.useWideViewPort = true

    }
}
