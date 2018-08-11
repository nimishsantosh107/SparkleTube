package com.example.nimish.sparkletube;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity /* implements View.OnClickListener*/ {

    EditText et;
    private YouTubePlayerView youTubePlayerView;
    private YouTubePlayer.OnInitializedListener onInitializedListener;
    public Button b;
    //private ClipboardManager cbm;
    //private ClipData cd;
    //public String id;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=findViewById(R.id.button);
        et= findViewById(R.id.editVideoId);
        //b.setOnClickListener(this);
        youTubePlayerView= findViewById(R.id.youtubePlayer);
        //cbm=(ClipboardManager) getSystemService(CLIPBOARD_SERVICE);

        onInitializedListener= new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo(et.getText().toString());  //enter vid link here
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                /*Context context=getApplicationContext();
                CharSequence text="Invalid ID";
                int duration=Toast.LENGTH_SHORT;
                Toast toast=Toast.makeText(context,text,duration);
                toast.show();*/
            }
        };

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youTubePlayerView.initialize("AIzaSyDo6D1ZV9SvP-2EtqPqNiPnVNcBqBAi_Ow",onInitializedListener);
            }
        });
    }


    //COPY PASTE METHODS

    /*public void copy(View view){

    }

    public void paste(View view){
        ClipData cd2=cbm.getPrimaryClip();
        ClipData.Item item=cd2.getItemAt(0);
        String copied = item.getText().toString();
        et.setText(copied);
    }*/

    //PASTE BUTTON LAYOUT

    /*    <Button
        android:id="@+id/pasteButton"
        android:layout_width="50dp"
        android:layout_height="50dp"
        android:layout_alignParentEnd="true"
        android:layout_centerVertical="true"
        android:layout_marginEnd="10dp"
        android:layout_marginTop="5dp"
        android:background="@drawable/ic_insert_drive_file_black_24dp"
        android:backgroundTint="@color/colorPrimaryDark"
        android:onClick="paste" />
    */


    //LIST BUTTON

    /*
    <Button
        android:id="@+id/list"
        android:layout_width="match_parent"
        android:layout_height="70dp"
        android:layout_above="@+id/youtubePlayer"
        android:layout_toRightOf="@+id/header2"
        android:background="@color/colorPrimary"
        android:fontFamily="@font/athiti_extralight"
        android:onClick="listButtonClicked"
        android:text="List >"
        android:textStyle="bold" />
    */

    /*@Override
    public void onClick(View view) {
        if(view==b){
            startService(new Intent(this,Service.class));
        }

    }*/
}
