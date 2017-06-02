package es.hol.a4ongs.a4fire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class trintam extends AppCompatActivity {

    private WebView mywebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trintam);

        mywebview = (WebView) findViewById(R.id.trintam_web);  //Iniciliza o webview
        WebSettings webSetings = mywebview.getSettings();
        webSetings.setJavaScriptEnabled(true); //inicializa o javascript

        mywebview.loadUrl("https://prodwww-queimadas.dgi.inpe.br/aq30m/");
        mywebview.setWebViewClient(new WebViewClient());
    }

    public void startmainActivity (View view){

        Intent Principal = new Intent(this, Principal.class);
        startActivity(Principal);
    }

    @Override

    public void onBackPressed(){

        if(mywebview.canGoBack()){
            mywebview.goBack();

        }else if(mywebview.canGoBack()){
            super.onBackPressed();

        }
    }
}
