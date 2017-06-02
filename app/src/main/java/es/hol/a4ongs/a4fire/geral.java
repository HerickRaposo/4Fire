package es.hol.a4ongs.a4fire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class geral extends AppCompatActivity {

    private WebView mywebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geral);

        mywebview = (WebView) findViewById(R.id.geral_web);  //Iniciliza o webview
        WebSettings webSetings = mywebview.getSettings();
        webSetings.setJavaScriptEnabled(true); //inicializa o javascript

        mywebview.loadUrl("https://queimadas.dgi.inpe.br/queimadas/destaque/area-queimada");
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
