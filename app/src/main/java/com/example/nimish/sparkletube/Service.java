package com.example.nimish.sparkletube;

/**
 * Created by nimish on 19/02/18.
 */

import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;



/**
 * Created by nimish on 17/02/18.
 */


public class Service extends android.app.Service {

    /*private String vdid;

    public Service(String vdid){
        this.vdid=vdid;
    }

    public String getVdid() {
        return vdid;
    }

    public void setVdid(String vdid) {
        this.vdid = vdid;
    }
    private YouTubePlayerView youTubePlayerView;
    private Button b;*/


    //SEPARATE


    /*Button b;
            EditText et;
            private YouTubePlayerView youTubePlayerView;
            private YouTubePlayer.OnInitializedListener onInitializedListener;*/
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        /*youTubePlayerView=youTubePlayerView.findViewById(R.id.youtubePlayer);
        onInitializedListener= new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo(et.getText().toString()"wWkW_tMwOfc");  //enter vid link here
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        et=etfindViewById(R.id.editVideoId);
        b=b.findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youTubePlayerView.initialize("AIzaSyDo6D1ZV9SvP-2EtqPqNiPnVNcBqBAi_Ow",onInitializedListener);
            }
        }); */
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
