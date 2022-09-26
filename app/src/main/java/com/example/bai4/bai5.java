package com.example.bai4;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class bai5 extends AppCompatActivity {
    private VideoView videoView_bai5;
    private int position = 0;
    private MediaController mediaController;
    private Button btn_bai5_raw, btn_bai5_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5);
        Init();
        Action();
    }

    private void Init() {
        videoView_bai5 = (VideoView) this.findViewById(R.id.videoView_bai5);
        btn_bai5_raw = (Button) this.findViewById(R.id.btn_bai5_raw);
        btn_bai5_url = (Button) this.findViewById(R.id.btn_bai5_url);
        // Set the media controller buttons
        if (this.mediaController == null) {
            this.mediaController = new MediaController(bai5.this);

            // Set the videoView that acts as the anchor for the MediaController.
            this.mediaController.setAnchorView(videoView_bai5);

            // Set MediaController for VideoView
            this.videoView_bai5.setMediaController(mediaController);
        }
    }

    private void Action() {
// When the video file ready for playback.
        this.videoView_bai5.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {

            public void onPrepared(MediaPlayer mediaPlayer) {

                videoView_bai5.seekTo(position);
                if (position == 0) {
                    videoView_bai5.start();
                }

                // When video Screen change size.
                mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                    @Override
                    public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {

                        // Re-Set the videoView that acts as the anchor for the MediaController
                        mediaController.setAnchorView(videoView_bai5);
                    }
                });
            }
        });

        this.btn_bai5_raw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // "myvideo.mp4" in directory "raw".
                String resName = VideoViewUtils.RAW_VIDEO_SAMPLE;
                VideoViewUtils.playRawVideo(bai5.this, videoView_bai5, resName);
            }
        });

        this.btn_bai5_url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoURL = VideoViewUtils.URL_VIDEO_SAMPLE;
                VideoViewUtils.playURLVideo(bai5.this, videoView_bai5, videoURL);
            }
        });
    }

    // When you change direction of phone, this method will be called.
    // It store the state of video (Current position)
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        // Store current position.
        savedInstanceState.putInt("CurrentPosition", videoView_bai5.getCurrentPosition());
        videoView_bai5.pause();
    }


    // After rotating the phone. This method is called.
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // Get saved position.
        position = savedInstanceState.getInt("CurrentPosition");
        videoView_bai5.seekTo(position);
    }
}