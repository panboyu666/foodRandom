package pan.bo.yu.foodrandom;

import androidx.appcompat.app.AppCompatActivity;

import android.accessibilityservice.AccessibilityService;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;

import static pan.bo.yu.foodrandom.MainActivity0.arrayList;

public class MainActivity extends AppCompatActivity {
TextView textView;

    ClipboardManager clipboard;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text);




        clipboard = (ClipboardManager) this.getSystemService(Context.CLIPBOARD_SERVICE);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }

    public void randown(View view) {
        int i = (int) (Math.random()*arrayList.size());
        textView.setText(arrayList.get(i));
    }

    public void copy(View view) {
        ClipData clipData = ClipData.newPlainText(null, "https://play.google.com/store/apps/details?id=pan.bo.yu.foodrandom");
        clipboard.setPrimaryClip(clipData);
        Toast.makeText(this, "已複製APP網址", Toast.LENGTH_SHORT).show();

    }
}