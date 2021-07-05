package pan.bo.yu.foodrandom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;
    String [] food = new String[88];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text);

        Log.w("boobs","test");

        food[0] ="便當";
        food[1] ="燒肉飯";
        food[2] ="鴨肉飯";
        food[3] ="排骨飯";
        food[4] ="燒鴨飯";
        food[5] ="雞排飯";
        food[6] ="魚排飯";
        food[7] ="雞腿飯";
        food[8] ="玫瑰油雞飯";
        food[9] ="小吃店";
        food[10] ="肉燥飯(大碗)";
        food[11] ="肉燥飯(小碗)";
        food[12] ="陽春麵(湯)";
        food[13] ="陽春麵(乾)";
        food[14] ="油麵(湯)";
        food[15] ="油麵(乾)";
        food[16] ="拉仔麵";
        food[17] ="炒麵";
        food[18] ="肉羹飯";
        food[19] ="肉羹麵";
        food[20] ="羊肉羹飯";
        food[21] ="羊肉羹麵";
        food[22] ="魷魚羹飯";
        food[23] ="魷魚羹麵";
        food[24] ="土魠魚飯";
        food[25] ="土魠魚麵";
        food[26] ="牛排";
        food[27] ="豬排";
        food[28] ="雞排";
        food[29] ="鹹酥雞";
        food[30] ="焗烤飯";
        food[31] ="義大利麵(白醬)";
        food[32] ="義大利麵(紅醬)";
        food[33] ="義大利麵(青醬)";
        food[34] ="炒飯";
        food[35] ="滷味";
        food[36] ="鹹水雞";
        food[37] ="麥當勞";
        food[38] ="肯德基";
        food[39] ="米糕";
        food[40] ="壽司";
        food[41] ="爌肉飯";
        food[42] ="豬腳飯";
        food[43] ="生菜沙拉(便利商店)";
        food[44] ="關東煮(便利商店)";
        food[45] ="牛丼飯";
        food[46] ="豬丼飯";
        food[47] ="唐揚雞丼飯";
        food[48] ="日式炸豬排飯";
        food[49] ="日式炸雞排飯";
        food[50] ="咖哩飯";
        food[51] ="臭豆腐鍋";
        food[52] ="海鮮鍋";
        food[53] ="麻辣鍋";
        food[54] ="牛奶鍋";
        food[55] ="涼麵";
        food[56] ="自助餐";
        food[57] ="鍋燒意麵";
        food[58] ="烏龍麵";
        food[59] ="牛肉麵";
        food[60] ="水餃";
        food[61] ="小籠包";
        food[62] ="湯包";
        food[63] ="鍋貼";
        food[64] ="四海遊龍";
        food[65] ="八方雲集";
        food[66] ="牛肉湯餃";
        food[67] ="咖哩豬排飯";
        food[68] ="咖哩雞肉飯";
        food[69] ="越南河粉";
        food[70] ="海苔飯捲";
        food[71] ="鐵板燒";
        food[72] ="肉圓";
        food[73] ="廣東粥";
        food[74] ="皮蛋瘦肉粥";
        food[75] ="吻仔魚粥";
        food[76] ="海鮮粥";
        food[77] ="雞蓉玉米粥";
        food[78] ="素食麵";
        food[79] ="素食便當";
        food[80] ="韓國部隊鍋";
        food[81] ="韓國烤肉";
        food[82] ="日式料理";
        food[83] ="泡麵";
        food[84] ="不吃";
        food[85] ="吃土";
        food[86] ="燉飯";
        food[87] ="火雞肉飯";








    }

    public void randown(View view) {

        int i = (int) (Math.random()*87+1);
        textView.setText(food[i]);

    }
}