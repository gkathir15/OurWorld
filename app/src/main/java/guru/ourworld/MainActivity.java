package guru.ourworld;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;

import java.io.IOException;

import static android.util.Log.VERBOSE;

public class MainActivity extends AppCompatActivity {


    private WebView mWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);





        mWebView = (WebView) findViewById(R.id.activity_main_webview);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl("file:///android_asset/index.html");

       /* AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
               // MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.all);


               // ring.start();
            }
        });*/



        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

    }

    public void onPause() {
        super.onPause();
      //  MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.all);
      //  ring.pause();
    }

    @Override
    public void onStop() {
        super.onStop();
       // MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.all);
      //  ring.stop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
       // MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.all);
       // ring.stop();
    }

    private class WebViewClient extends android.webkit.WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }



}