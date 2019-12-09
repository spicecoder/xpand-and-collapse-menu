package com.fangxu.sample;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.fangxu.allangleexpandablebutton.AllAngleExpandableButton;
import com.fangxu.allangleexpandablebutton.ButtonData;
import com.fangxu.allangleexpandablebutton.ButtonEventListener;

import java.util.ArrayList;
import java.util.List;

import fangxu.com.allangleexpandablebutton.R;

/**
 * Created by dear33 on 2016/8/20.
 */
public class MainActivity extends Activity {
    AllAngleExpandableButton xbutton;
    ImageView reddot ;
    int[]
    drawable = {R.drawable.tab_0, R.drawable.tab_1, R.drawable.tab_2, R.drawable.tab_3, R.drawable.tab_4, R.drawable.tab_5, R.drawable.tab_6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_litt);
       xbutton = (AllAngleExpandableButton) findViewById(R.id.button_expandable_0_180);
         reddot = findViewById(R.id.reddot) ;
         reddot.setOnClickListener(new View.OnClickListener(){

             @Override
             public void onClick(View v) {
                 xbutton.collapse();
             }
         }) ;
       // installButton90to90();
       // installButton90to180();
       // installButton110to250();
      // installButton0to360();
        installButton0to180();
    }

    private void installButton90to90() {
        final AllAngleExpandableButton button = (AllAngleExpandableButton) findViewById(R.id.button_expandable_90_90);
        final List<ButtonData> buttonDatas = new ArrayList<>();
        int[] drawable = {R.drawable.plus, R.drawable.mark, R.drawable.settings, R.drawable.heart};
        int[] color = {R.color.blue, R.color.red, R.color.green, R.color.yellow};
        for (int i = 0; i < 4; i++) {
            ButtonData buttonData;
            if (i == 0) {
                buttonData = ButtonData.buildIconButton(this, drawable[i], 15);
            } else {
                buttonData = ButtonData.buildIconButton(this, drawable[i], 0);
            }
            buttonData.setBackgroundColorId(this, color[i]);
            buttonDatas.add(buttonData);
        }
        button.setButtonDatas(buttonDatas);
        setListener(button);
    }

    private void installButton90to180() {
        final AllAngleExpandableButton button = (AllAngleExpandableButton) findViewById(R.id.button_expandable_90_180);
        final List<ButtonData> buttonDatas = new ArrayList<>();
        int[] drawable = {R.drawable.plus, R.drawable.mark, R.drawable.settings, R.drawable.heart};
        int[] color = {R.color.blue, R.color.red, R.color.green, R.color.yellow};
        for (int i = 0; i < 4; i++) {
            ButtonData buttonData;
            if (i == 0) {
                buttonData = ButtonData.buildIconButton(this, drawable[i], 15);
            } else {
                buttonData = ButtonData.buildIconButton(this, drawable[i], 0);
            }
            buttonData.setBackgroundColorId(this, color[i]);
            buttonDatas.add(buttonData);
        }
        button.setButtonDatas(buttonDatas);
        setListener(button);
    }

    private void installButton110to250() {
        final AllAngleExpandableButton button = (AllAngleExpandableButton) findViewById(R.id.button_expandable_110_250);
        final List<ButtonData> buttonDatas = new ArrayList<>();
        int[] drawable = {R.drawable.edit, R.drawable.refresh, R.drawable.mark, R.drawable.settings, R.drawable.heart, R.drawable.search, R.drawable.copy};
        int[] color = {R.color.black, R.color.orange, R.color.blue, R.color.pink, R.color.yellow, R.color.red, R.color.green};
        for (int i = 0; i < 7; i++) {
            ButtonData buttonData;
            if (i == 0) {
                buttonData = ButtonData.buildIconButton(this, drawable[i], 15);
            } else {
                buttonData = ButtonData.buildIconButton(this, drawable[i], 0);
            }
            buttonData.setBackgroundColorId(this, color[i]);
            buttonDatas.add(buttonData);
        }
        button.setButtonDatas(buttonDatas);
        setListener(button);
    }
    private void installButton0to180() {

        final List<ButtonData> buttonDatas = new ArrayList<>();
        // int[]
         //       drawable = {R.drawable.tab_0, R.drawable.tab_1, R.drawable.tab_2, R.drawable.tab_3, R.drawable.tab_4, R.drawable.tab_5, R.drawable.tab_6};
        int[] color = {R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary};
        for (int i = 0; i < 7; i++) {
            ButtonData buttonData;
            if (i == 0) {
                buttonData = ButtonData.buildIconButton(this, drawable[i], 15);
            } else {
                buttonData = ButtonData.buildIconButton(this, drawable[i], 20);
            }
            buttonData.setBackgroundColorId(this, color[i]);
            buttonDatas.add(buttonData);
        }
        xbutton.setButtonDatas(buttonDatas);
        setListener(xbutton);
    }
    private void installRedButton0to180() {

        final List<ButtonData> buttonDatas = new ArrayList<>();
        int[]
              drawable = {R.drawable.tab_0, R.drawable.tab_1, R.drawable.tab_2red, R.drawable.tab_3, R.drawable.tab_4, R.drawable.tab_5, R.drawable.tab_6};
        int[] color = {R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary};
        for (int i = 0; i < 7; i++) {
            ButtonData buttonData;
            if (i == 0) {
                buttonData = ButtonData.buildIconButton(this, drawable[i], 15);
            } else {
                buttonData = ButtonData.buildIconButton(this, drawable[i], 20);
            }
            buttonData.setBackgroundColorId(this, color[i]);
            buttonDatas.add(buttonData);
        }
        xbutton.setButtonDatas(buttonDatas);
       // setListener(xbutton);
    }
    private void installButton0to360() {
        final AllAngleExpandableButton button = (AllAngleExpandableButton) findViewById(R.id.button_expandable_0_360);
        final List<ButtonData> buttonDatas = new ArrayList<>();
        int[] drawable = {R.drawable.edit, R.drawable.refresh, R.drawable.mark, R.drawable.settings, R.drawable.heart, R.drawable.search, R.drawable.copy};
        int[] color = {R.color.black, R.color.orange, R.color.blue, R.color.pink, R.color.yellow, R.color.red, R.color.green};
        for (int i = 0; i < 7; i++) {
            ButtonData buttonData;
            if (i == 0) {
                buttonData = ButtonData.buildIconButton(this, drawable[i], 15);
            } else {
                buttonData = ButtonData.buildIconButton(this, drawable[i], 0);
            }
            buttonData.setBackgroundColorId(this, color[i]);
            buttonDatas.add(buttonData);
        }
        button.setButtonDatas(buttonDatas);
        setListener(button);
    }

    private void setListener(AllAngleExpandableButton button) {
        button.setButtonEventListener(new ButtonEventListener() {
            @Override
            public void onButtonClicked(int index) {
            reddot.setVisibility(View.VISIBLE);
              //  showToast("clicked index:" + index);
             /*   ScaleAnimation fade_in =  new ScaleAnimation(.5f, 1f, .5f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                fade_in.setDuration(3000);     // animation duration in milliseconds
                fade_in.setFillAfter(true);fade_in.setRepeatCount(ValueAnimator.INFINITE);
                // If fillAfter is true, the transformation that this animation performed will persist when it is finished.
                xbutton.startAnimation(fade_in); */
                PropertyValuesHolder scalex = PropertyValuesHolder.ofFloat(View.SCALE_X, 1.2f);
                PropertyValuesHolder scaley = PropertyValuesHolder.ofFloat(View.SCALE_Y, 1.2f);
                ObjectAnimator anim = ObjectAnimator.ofPropertyValuesHolder(xbutton, scalex, scaley);
                anim.setRepeatCount(ValueAnimator.INFINITE);
                anim.setRepeatMode(ValueAnimator.REVERSE);
                anim.setDuration(1500);
                anim.start();



            }

            @Override
            public void onExpand() {
//                showToast("onExpand");
            }

            @Override
            public void onCollapse() {
//                showToast("onCollapse");
            }
        });
    }

    private void showToast(String toast) {
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    }
}
