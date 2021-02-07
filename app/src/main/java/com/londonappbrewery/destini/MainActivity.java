package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mTextView;
    private Button mButtonTop;
    private Button mButtonBottom;
    private int mStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
            mTextView = (TextView) findViewById(R.id.storyTextView);
            mButtonTop = (Button) findViewById(R.id.buttonTop);
            mButtonBottom = (Button) findViewById(R.id.buttonBottom);
            mStoryIndex = 1;

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

            mButtonTop.setOnClickListener(new View.OnClickListener()
            {
                    @Override
                    public void onClick (View v)
                    {
                        if (mStoryIndex == 1) // if story scene = 1 and button 1 is pressed set scene to 3
                        {
                            mTextView.setText(R.string.T3_Story);
                            mButtonTop.setText(R.string.T3_Ans1 );
                            mButtonBottom.setText(R.string.T3_Ans2);
                            mStoryIndex = 3;

                        }else if(mStoryIndex == 3) //if story scene = 3
                        {
                           mTextView.setText(R.string.T6_End);
                        }else if (mStoryIndex == 2)
                        {
                            mStoryIndex = 3;
                            mTextView.setText(R.string.T3_Story);
                            mButtonTop.setText(R.string.T3_Ans1);
                            mButtonBottom.setText(R.string.T3_Ans2);
                        }
                    }
            });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) //if story scene = 1 and button 2 is pressed set scene to 2
                {
                    mTextView.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }else if (mStoryIndex == 2){ //if story scene = 2 and button 2 is pressed set scene to T4_end
                    mTextView.setText(R.string.T4_End);
                }else if (mStoryIndex == 3)
                {
                    mTextView.setText(R.string.T5_End);
                }

                }
        });

    }
}
