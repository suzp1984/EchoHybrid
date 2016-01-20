package echo.hybrid.suzp1984.github.io.echohybrid;

import android.os.Bundle;

import org.apache.cordova.CordovaActivity;

public class EchoActivity extends CordovaActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadUrl(launchUrl);
    }
}
