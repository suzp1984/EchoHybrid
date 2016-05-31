package echo.hybrid.suzp1984.github.io.echohybrid;

import android.app.Application;
import android.os.StrictMode;

import butterknife.ButterKnife;

/**
 * Created by jacobsu on 5/31/16.
 */
public class EchoApp extends Application {

    @Override
    public void onCreate() {
        if (BuildConfig.DEBUG) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                    .detectAll()
                    .penaltyLog()
                    .penaltyDialog()
                    .build());

            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
                    .detectAll()
                    .penaltyLog()
                    .build());

            ButterKnife.setDebug(true);
        }

        super.onCreate();
    }
}
