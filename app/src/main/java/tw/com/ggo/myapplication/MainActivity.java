package tw.com.ggo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv =(WebView) findViewById(R.id.webView);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setSupportZoom(true);
        wv.getSettings().setBuiltInZoomControls(true);
        wv.loadUrl ("file:///android_asset/index.html");
    }
   @Override
    public void  onBackPressed() {
       if (wv.getUrl().contains("index.html"))
       {
           super.onBackPressed();

       }
       else {
           wv.goBack();

       }
   }

}
