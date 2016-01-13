package escolaarcadia.blogspot.com.br.mipmap;

/*
prof. Martin Morães
http://lattes.cnpq.br/2746554350570335
http://escolaarcadia.blogspot.com.br/
https://github.com/martinmoraes

Este código está disponível em: https://github.com/martinmoraes/Android-Mipmap

Sites que disponibilizam ícones e outros recursos
    https://romannurik.github.io/AndroidAssetStudio/icons-launcher.html
    http://www.icons4android.com/
    https://icons8.com/android-icons/
    http://www.flaticon.com/

 */


import android.support.v4.media.IMediaBrowserServiceCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) findViewById(R.id.imageView);
    }

    public void mostraAgulha(View view){
        iv.setImageResource(R.mipmap.ic_agulha);
    }

    public void mostraAndroid(View view){
        iv.setImageResource(R.mipmap.ic_android);
    }

    public void mostraCarrinho(View view){
        iv.setImageResource(R.mipmap.ic_carrinho);
    }

    public void mostraIoda(View view){
        iv.setImageResource(R.mipmap.ic_ioda);
    }
}

