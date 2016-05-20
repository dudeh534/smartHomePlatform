package com.ourincheon.mygatt;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Youngdo on 2016-05-19.
 */
public class ViewActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        WebView webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://bingwer.dothome.co.kr");

    }
}
