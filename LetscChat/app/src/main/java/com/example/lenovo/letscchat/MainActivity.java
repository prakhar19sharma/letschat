package com.example.lenovo.letscchat;
import android.graphics.Color;
import android.view.Gravity;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
     TextView textView1;
    TextView textView2;
    TextView textView3;
    int c;
    int max = 3;
    int min = 1;
    int range = max - min + 1;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       linearLayout = (LinearLayout) findViewById(R.id.linear);

       EditText e=(EditText)findViewById(R.id.editText);
       e.bringToFront();
       ImageView im=(ImageView)findViewById(R.id.send);
       im.bringToFront();
        c=1;
        try {
            for (int i = 0; i < 50; i++)
                addMessage(linearLayout);
        }
        catch(Exception ex)
        {
            this.finishAffinity();
        }
        // Add textview 1

    }
    public void addMessage(View v) throws Exception
    {
        LayoutParams layoutParams;
        int rand = (int)(Math.random() * range) + min;
        switch(rand)
        {
            case 1:
                textView1 = new TextView(this);
                layoutParams = new LayoutParams(LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);
                layoutParams.setMargins(10,10,10,10);
                textView1.setLayoutParams(layoutParams);
                textView1.setText("This is the received message - message no "+c);
                textView1.setBackgroundColor(Color.rgb(255,250,205)); // hex color 0xAARRGGBB
                textView1.setPadding(20, 20, 20, 20);// in pixels (left, top, right, bottom)
                linearLayout.addView(textView1);
                c++;
                break;
            case 2:
                textView2 = new TextView(this);
                layoutParams = new LayoutParams(LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);
                layoutParams.gravity = Gravity.RIGHT;
                layoutParams.setMargins(10,10,10,10);
                textView2.setPadding(20, 20, 20, 20);
                textView2.setLayoutParams(layoutParams);
                textView2.setText("This is the sent message - message no "+c);
                //textView2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
                textView2.setBackgroundColor(Color.rgb(175,238,238)); // hex color 0xAARRGGBB
                linearLayout.addView(textView2);
                c++;
                break;
            case 3:
                textView3 = new TextView(this);
                layoutParams = new LayoutParams(LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);
                layoutParams.setMargins(10,10,10,10);
                layoutParams.gravity = Gravity.CENTER;
                textView3.setPadding(25, 25, 25, 25);
                textView3.setLayoutParams(layoutParams);
                textView3.setText("This is a notification message - message no "+c);
                //textView2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
                textView3.setBackgroundColor(Color.rgb(250,128,114)); // hex color 0xAARRGGBB
                linearLayout.addView(textView3);
                c++;
                break;
                default:
                    break;
        }



            /*    TextView textView2 = new TextView(this);
                LayoutParams layoutParams = new LayoutParams(LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);
                layoutParams.gravity = Gravity.RIGHT;
                textView1.setPadding(20, 20, 20, 20);
                textView2.setLayoutParams(layoutParams);
                textView2.setText("programmatically created TextView2");
                //textView2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
                textView2.setBackgroundColor(0xffffdbdb); // hex color 0xAARRGGBB
                linearLayout.addView(textView2);
*/
    }
}
