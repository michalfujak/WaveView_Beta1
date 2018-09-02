package com.example.load.wave.fujak.michal.wavwviewlayoutbeta1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

import com.john.waveview.WaveView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WaveInitializables();
    }


    public void WaveInitializables()
    {
        // OOP Comlonent
        SeekBar seekBarOne = (SeekBar) findViewById(R.id.seekBarOne);
        final WaveView waveView = (WaveView) findViewById(R.id.wave1);
        waveView.setProgress(seekBarOne.getProgress());
        seekBarOne.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int setProcess, boolean boo) {
                waveView.setProgress(setProcess);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }


}
