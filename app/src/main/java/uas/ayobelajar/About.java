package uas.ayobelajar;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<title>Tentang Aplikasi</title>" +
                "<p>About Aplikasi" +
                "<br/>" +
                "Aplikasi ini adalah aplikasi pengenalan huruf dan angka untuk anak-anak" +
                "<br/>" +
                "Aplikasi ini dibuat oleh :<br/>" +
                "1406086 - Muhammad Setyadi F.A<br/>" +
                "1406102 - Rian Nurjaman<br/>" +
                "1406118 - Sonny Jatiwijaya<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}