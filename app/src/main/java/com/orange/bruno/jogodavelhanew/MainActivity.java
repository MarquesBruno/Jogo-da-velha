package com.orange.bruno.jogodavelhanew;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {

    private static final String BASE64_PUBLIC_KEY = "getString(R.string.BASE64_PUBLIC_KEY)"; //Ver depois

    String aux = "o";
    int tinta;
    String diferencial = "0";
    String ponto = "0";
    String chance = "0";
    String chance1 = "0";
    String chance2 = "0";
    String chance3 = "0";
    String chance4 = "0";
    String chance5 = "0";
    String chance6 = "0";
    String chance7 = "0";
    String chance8 = "0";
    String chance9 = "0";
    String resultado = "";
    int largura;
    int altura;
    String tamanho = "";
    private AdView adView;
    private Button btnInterstitial;
    private InterstitialAd interstitialAd;
    private AdRequest adRequest;
    private FirebaseAnalytics fbAnalytics;

    int tela;
    DisplayMetrics metrics = new DisplayMetrics();

    String internet;


    final Context context = this;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client2;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        tela();
        if(tamanho.equalsIgnoreCase("540x960")){
            setContentView(R.layout.teste);
        }
        if(tamanho.equalsIgnoreCase("1080x1794")){
            setContentView(R.layout.activity_main);
        }
        */
        setContentView(R.layout.activity_main);

        adView = (AdView) findViewById(R.id.adView);
        adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);


        //region teste de propaganda de teste
        /*adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .addTestDevice("139370A94C4EB33F3E56E7D0593B8740")
                .build();
        adView.loadAd(adRequest);*/


        //endregion


        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getString(R.string.admob_interstitial_id));
        LoadInterstitial();

        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                LoadInterstitial();
            }
        });

        fbAnalytics = FirebaseAnalytics.getInstance(this);


        //region inicialização de Botões

        final Button botao1 = (Button) findViewById(R.id.img1);
        final Button botao2 = (Button) findViewById(R.id.img2);
        final Button botao3 = (Button) findViewById(R.id.img3);
        final Button botao4 = (Button) findViewById(R.id.img4);
        final Button botao5 = (Button) findViewById(R.id.img5);
        final Button botao6 = (Button) findViewById(R.id.img6);
        final Button botao7 = (Button) findViewById(R.id.img7);
        final Button botao8 = (Button) findViewById(R.id.img8);
        final Button botao9 = (Button) findViewById(R.id.img9);
        final Button btRetry = (Button) findViewById(R.id.retry);
        btnInterstitial = (Button) findViewById(R.id.btnInterstitial);
        //final Button button1 = (Button) findViewById(R.id.musica);
        final MediaPlayer mp;


        DisplayMetrics metrics = new DisplayMetrics();


        //endregion

        //region Botões


        //region botao 1

        botao1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                confere(chance1);
                chance1 = chance;
                fonteColor();
                botao1.setText(chance.toString());
                botao1.setTextColor(tinta);
                chance1 = botao1.getText().toString();
                ganhou();
            }
        });
        //endregion

        //region botao 2

        botao2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                confere(chance2);
                chance2 = chance;
                fonteColor();
                botao2.setTextColor(tinta);
                botao2.setText(chance.toString());
                chance2 = botao2.getText().toString();
                ganhou();
            }
        });
        //endregion

        //region botao 3

        botao3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                confere(chance3);
                chance3 = chance;
                fonteColor();
                botao3.setTextColor(tinta);
                botao3.setText(chance.toString());
                chance3 = botao3.getText().toString();
                ganhou();
            }
        });
        //endregion

        //region botao 4

        botao4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                confere(chance4);
                chance4 = chance;
                fonteColor();
                botao4.setTextColor(tinta);
                botao4.setText(chance.toString());
                chance4 = botao4.getText().toString();
                ganhou();
            }
        });
        //endregion

        //region botao 5

        botao5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                confere(chance5);
                chance5 = chance;
                fonteColor();
                botao5.setTextColor(tinta);
                botao5.setText(chance.toString());
                chance5 = botao5.getText().toString();
                ganhou();
            }
        });
        //endregion

        //region botao 6

        botao6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                confere(chance6);
                chance6 = chance;
                fonteColor();
                botao6.setTextColor(tinta);
                botao6.setText(chance.toString());
                chance6 = botao6.getText().toString();
                ganhou();
            }
        });
        //endregion

        //region botao 7

        botao7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                confere(chance7);
                chance7 = chance;
                fonteColor();
                botao7.setTextColor(tinta);
                botao7.setText(chance.toString());
                chance7 = botao7.getText().toString();
                ganhou();
            }
        });
        //endregion

        //region botao 8

        botao8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                confere(chance8);
                chance8 = chance;
                fonteColor();
                botao8.setTextColor(tinta);
                botao8.setText(chance.toString());
                chance8 = botao8.getText().toString();
                ganhou();
            }
        });
        //endregion

        //region botao 9
        botao9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                confere(chance9);
                chance9 = chance;
                fonteColor();
                botao9.setTextColor(tinta);
                botao9.setText(chance.toString());
                chance9 = botao9.getText().toString();
                ganhou();

            }
        });
        //endregion

        //region Retry
        btRetry.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chance = "0";
                chance1 = "0";
                chance2 = "0";
                chance3 = "0";
                chance4 = "0";
                chance5 = "0";
                chance6 = "0";
                chance7 = "0";
                chance8 = "0";
                chance9 = "0";
                diferencial = "0";
                ponto = "0";
                botao1.setText(" ");
                botao2.setText(" ");
                botao3.setText(" ");
                botao4.setText(" ");
                botao5.setText(" ");
                botao6.setText(" ");
                botao7.setText(" ");
                botao8.setText(" ");
                botao9.setText(" ");

                //VerificaConexao(MainActivity.this);
                // tela();


            }

        });

        //endregion

        //region Botao Interstitial


        btnInterstitial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                //manda as informações para o firebase de acessos ao Intrstitial
                bundle.putString("Acesso_Interstitial", "controle");
                fbAnalytics.logEvent("Abriu_Interstitial", bundle);

                if (MainActivity.isNetworkAvailable(getApplicationContext())) {

                    interstitialAd.show();
                } else {
                    Toast.makeText(context, "Sem Conexao de internet", Toast.LENGTH_SHORT).show();

                }


            }
        });

        //region Musica




        /*button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //mp = MediaPlayer.create(this, R.raw.som);
                //mp.start();



            }

        });*/


        //endregion


        //endregion

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        //client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        // client2 = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
        // endregion
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        //client3 = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    //region Interstitial

    private void LoadInterstitial() {
        AdRequest interAdRequest = new AdRequest.Builder().build();
        interstitialAd.loadAd(interAdRequest);
    }

    //endregion

    //region Ciclo de vida

    @Override
    public void onPause() {
        if (adView != null) {
            adView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (adView != null) {
            adView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }

    //endregion

    //region confere

    public void confere(String x) {
        chance = x;
        if (chance.equals("0")) {
            if (aux.equals("o")) {
                chance = "x";
                aux = chance;
            } else {
                chance = "o";
                aux = chance;
            }
        }
    }

    //endregion

    // region Ganhou
    public void ganhou() {
        // AlertDialog.Builder builder = new AlertDialog.Builder(this);

        if (chance1.equals(chance2) && chance2.equals(chance3) && chance1 != "0" && chance2 != "0" && chance3 != "0" && ponto == "0") {
            diferencial = "1";
            ponto = "1";
            resultado = chance1.toString();
            //Toast.makeText(context, "O vencedor é o "+resultado, Toast.LENGTH_SHORT).show();
            menssagem();
        }
        if (chance1.equals(chance5) && chance5.equals(chance9) && chance1 != "0" && chance5 != "0" && chance9 != "0" && ponto == "0") {
            diferencial = "1";
            ponto = "1";
            resultado = chance1.toString();
            menssagem();
        }

        if (chance1.equals(chance4) && chance4.equals(chance7) && chance1 != "0" && chance4 != "0" && chance7 != "0" && ponto == "0") {
            diferencial = "1";
            ponto = "1";
            resultado = chance1.toString();
            menssagem();
        }

        if (chance4.equals(chance5) && chance5.equals(chance6) && chance4 != "0" && chance5 != "0" && chance6 != "0" && ponto == "0") {
            diferencial = "1";
            ponto = "1";
            resultado = chance4.toString();
            menssagem();
        }

        if (chance7.equals(chance8) && chance8.equals(chance9) && chance7 != "0" && chance8 != "0" && chance9 != "0" && ponto == "0") {
            diferencial = "1";
            ponto = "1";
            resultado = chance7.toString();
            menssagem();
        }

        if (chance7.equals(chance5) && chance5.equals(chance3) && chance7 != "0" && chance5 != "0" && chance3 != "0" && ponto == "0") {
            diferencial = "1";
            ponto = "1";
            resultado = chance7.toString();
            menssagem();
        }

        if (chance2.equals(chance5) && chance5.equals(chance8) && chance2 != "0" && chance5 != "0" && chance8 != "0" && ponto == "0") {
            diferencial = "1";
            ponto = "1";
            resultado = chance2.toString();
            menssagem();
        }

        if (chance3.equals(chance6) && chance6.equals(chance9) && chance3 != "0" && chance6 != "0" && chance9 != "0" && ponto == "0") {
            diferencial = "1";
            ponto = "1";
            resultado = chance3.toString();
            menssagem();
        }

        perdeu();
    }
    //endregion

    // region Menssagem
    public void menssagem() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater li = getLayoutInflater();
        final View view1 = li.inflate(R.layout.alerta, null);
        final View view2 = li.inflate(R.layout.alerta2, null);
        final View view3 = li.inflate(R.layout.alerta3, null);

        builder.setTitle("JOGO DA VELHA");
        if (resultado.equals("x") || resultado.equals("o")) {

            if (resultado.equals("x")) {
                builder.setView(view1);
            } else {
                builder.setView(view2);
            }

        } else {
            //builder.setMessage("Não houve Vencedor");
            builder.setView(view3);
        }

        builder.setPositiveButton("Retry", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                recreate();
            }
        });
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                finish();
            }
        });

        builder.show();

    }
    //endregion

    //region Perdeu
    public void perdeu() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        if (chance1 != "0" && chance2 != "0" && chance3 != "0" && chance4 != "0" && chance5 != "0" && chance6 != "0" && chance7 != "0" && chance8 != "0" && chance9 != "0" && diferencial == "0") {
            //resultado = chance1.toString();
            resultado = "Empate";
            // Toast.makeText(context, "Sem Vencedor", Toast.LENGTH_SHORT).show();
            menssagem();
        }
    }
//endregion

    //region cor fonte
    public void fonteColor() {
        if (chance.equals("x")) {
            tinta = Color.RED;
        } else {
            tinta = Color.BLUE;
        }
    }
    //endregion

    //region Tamanho da Tela

    public void tela() {

        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        largura = metrics.widthPixels;
        altura = metrics.heightPixels;
        //tamanho = largura+"x"+altura;
        float tamanho = metrics.scaledDensity;
        Toast.makeText(context, "Resolusão= " + largura + " X " + altura, Toast.LENGTH_SHORT).show();
        //Toast.makeText(context, "Dp= "+tamanho, Toast.LENGTH_SHORT).show();

    }

    //endregion


    //region Autenticação de internet

    public static boolean isNetworkAvailable(Context context) {
        try {
            ConnectivityManager connectivity = (ConnectivityManager)
                    context.getSystemService(Context.CONNECTIVITY_SERVICE);
            if (connectivity == null) {
                return false;
            } else {
                NetworkInfo[] info = connectivity.getAllNetworkInfo();
                if (info != null) {
                    for (int i = 0; i < info.length; i++) {
                        if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                            return true;
                        }
                    }
                }
            }
        } catch (SecurityException e) {

            Toast.makeText(context, e.getClass().getSimpleName(), Toast.LENGTH_SHORT).show();
            //alertDialog(context,e.getClass().getSimpleName(),e.getMessage());
        }
        return false;
    }


    //endregion


}

