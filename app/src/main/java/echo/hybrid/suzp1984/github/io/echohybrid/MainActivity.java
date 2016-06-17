package echo.hybrid.suzp1984.github.io.echohybrid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.start_cordova)
    Button startCordova;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }

    @Override
    protected void onDestroy() {

        ButterKnife.unbind(this);

        super.onDestroy();
    }

    @OnClick(R.id.start_cordova)
    public void startCordova() {
        startActivity(new Intent(this, EchoActivity.class));

    }
}
