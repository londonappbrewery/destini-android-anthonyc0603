package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStory;
    Button mAns1;
    Button mAns2;
    String mCurrentStory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStory = (TextView) findViewById(R.id.storyTextView);
        mAns1 =(Button) findViewById(R.id.buttonTop);
        mAns2 =(Button) findViewById(R.id.buttonBottom);

        mCurrentStory="T1";



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mAns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStory(true);

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mAns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStory(false);

            }
        });

    }

    public void updateStory(boolean isTop) {

        if (isTop){

            if (mCurrentStory=="T1"){
                mCurrentStory="T3";
                mStory.setText(R.string.T3_Story);
                mAns1.setText(R.string.T3_Ans1);
                mAns2.setText(R.string.T3_Ans2);

            } else if (mCurrentStory=="T2"){
                mCurrentStory="T3";
                mStory.setText(R.string.T3_Story);
                mAns1.setText(R.string.T3_Ans1);
                mAns2.setText(R.string.T3_Ans2);

            } else if (mCurrentStory=="T3"){
                mStory.setText(R.string.T6_End);
                mAns1.setVisibility(View.GONE);
                mAns2.setVisibility(View.GONE);

            }

        } else {

            if (mCurrentStory=="T1"){
                mCurrentStory="T2";
                mStory.setText(R.string.T2_Story);
                mAns1.setText(R.string.T2_Ans1);
                mAns2.setText(R.string.T2_Ans2);

            } else if (mCurrentStory=="T2"){
                mStory.setText(R.string.T4_End);
                mAns1.setVisibility(View.GONE);
                mAns2.setVisibility(View.GONE);

            } else if (mCurrentStory=="T3"){
                mStory.setText(R.string.T5_End);
                mAns1.setVisibility(View.GONE);
                mAns2.setVisibility(View.GONE);

            }

        }
    }

}
