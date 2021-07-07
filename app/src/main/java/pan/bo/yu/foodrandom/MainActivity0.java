package pan.bo.yu.foodrandom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;

public class MainActivity0 extends AppCompatActivity {

   static  ArrayList<String> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity0.this,MainActivity.class);
                startActivity(intent);
            }
        },3000);


        arrayList.add("便當");
        arrayList.add("燒肉飯");
        arrayList.add("鴨肉飯");
        arrayList.add("排骨飯");
        arrayList.add("燒鴨飯");
        arrayList.add("雞排飯");
        arrayList.add("魚排飯");
        arrayList.add("雞腿飯");
        arrayList.add("玫瑰油雞飯");
        arrayList.add("肉燥飯(大碗)");
        arrayList.add("肉燥飯(小碗)");
        arrayList.add("陽春麵(湯)");
        arrayList.add("油麵(湯)");
        arrayList.add("油麵(乾)");
        arrayList.add("拉仔麵");
        arrayList.add("炒麵");
        arrayList.add("肉羹飯");
        arrayList.add("羊肉羹飯");
        arrayList.add("羊肉羹麵");
        arrayList.add("魷魚羹飯");
        arrayList.add("魷魚羹飯");
        arrayList.add("土魠魚飯");
        arrayList.add("土魠魚麵");
        arrayList.add("牛排");
        arrayList.add("豬排");
        arrayList.add("雞排");
        arrayList.add("鹹酥雞");
        arrayList.add("焗烤飯");
        arrayList.add("義大利麵(白醬)");
        arrayList.add("義大利麵(紅醬)");
        arrayList.add("義大利麵(青醬)");
        arrayList.add("炒飯");
        arrayList.add("滷味");
        arrayList.add("鹹水雞");
        arrayList.add("麥當勞");
        arrayList.add("肯德基");
        arrayList.add("米糕");
        arrayList.add("壽司");
        arrayList.add("爌肉飯");
        arrayList.add("豬腳飯");
        arrayList.add("生菜沙拉(便利商店)");
        arrayList.add("牛丼飯");
        arrayList.add("豬丼飯");
        arrayList.add("唐揚雞丼飯");
        arrayList.add("日式炸豬排飯");
        arrayList.add("日式炸雞排飯");
        arrayList.add("咖哩飯");
        arrayList.add("臭臭鍋");
        arrayList.add("海鮮鍋");
        arrayList.add("麻辣鍋");
        arrayList.add("牛奶鍋");
        arrayList.add("涼麵");
        arrayList.add("自助餐");
        arrayList.add("鍋燒意麵");
        arrayList.add("烏龍麵");
        arrayList.add("牛肉麵");
        arrayList.add("水餃");
        arrayList.add("小籠包");
        arrayList.add("湯包");
        arrayList.add("鍋貼");
        arrayList.add("四海遊龍");
        arrayList.add("八方雲集");
        arrayList.add("牛肉湯餃");
        arrayList.add("咖哩豬排飯");
        arrayList.add("咖哩雞肉飯");
        arrayList.add("越南河粉");
        arrayList.add("海苔飯捲");
        arrayList.add("鐵板燒");
        arrayList.add("肉圓");
        arrayList.add("廣東粥");
        arrayList.add("皮蛋瘦肉粥");
        arrayList.add("吻仔魚粥");
        arrayList.add("海鮮粥");
        arrayList.add("雞蓉玉米粥");
        arrayList.add("素食麵");
        arrayList.add("素食便當");
        arrayList.add("韓國部隊鍋");
        arrayList.add("韓國烤肉");
        arrayList.add("日本料理");
        arrayList.add("泡麵");
        arrayList.add("餅乾大禮包");
        arrayList.add("不吃");
        arrayList.add("吃土");
        arrayList.add("燉飯");
        arrayList.add("火雞肉飯");
        arrayList.add("請問你要按幾次╮(╯◇╰)╭");
        arrayList.add("你是不是不太餓(=￣ω￣=)");
        arrayList.add("蝦仁炒飯");
        arrayList.add("蒙古烤肉");
        arrayList.add("吃到飽餐廳");
        arrayList.add("超商麵包");
        arrayList.add("超商炒麵");
        arrayList.add("超商冷凍炒飯");
        arrayList.add("咖啡配大亨堡");
        arrayList.add("麥當勞麥克雞塊");
        arrayList.add("85度c蛋糕");
        arrayList.add("水果挫冰");
        arrayList.add("來點寂寞");
        arrayList.add("叫熊貓好了");
        arrayList.add("叫Uber Eats好了");
        arrayList.add("燒賣");
        arrayList.add("火鍋");
        arrayList.add("異國料理");
        arrayList.add("披薩");
        arrayList.add("拿坡里");
        arrayList.add("必勝客");
        arrayList.add("泰國料理");
        arrayList.add("麵線糊");
        arrayList.add("健身便當");
        arrayList.add("傻師傅湯包");
        arrayList.add("鍋燒麵");
        arrayList.add("拉麵");
        arrayList.add("蚵仔煎");
        arrayList.add("紅豆餅");
        arrayList.add("鵝肉店");
        arrayList.add("鴨肉店");
        arrayList.add("章魚燒");
        arrayList.add("維力炸醬麵");
        arrayList.add("阿Q桶麵");
        arrayList.add("滿漢大餐泡麵");
        arrayList.add("水餃");


    }
}