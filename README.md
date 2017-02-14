# DoubleWave
# this is a custom view for android

![GIF](http://img.blog.csdn.net/20170214111005330?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvcXFfMjIzOTMwMTc=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

Step one：

compile 'com.xiaosong520:doublewaveview:1.0.1' 


Step two：

 <com.doublewave.DoubleWaveView
        android:id="@+id/waveView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        DoubleWaveView:speedOne="8"
        DoubleWaveView:speedTwo="6"
        DoubleWaveView:peakValue="20dp"
        DoubleWaveView:waveHeight="200dp"
        DoubleWaveView:waveColor="@color/colorBlue"/>

  
In root layout,add：
xmlns:DoubleWaveView="http://schemas.android.com/apk/res-auto"

Step three：

 waveView = (DoubleWaveView) findViewById(R.id.waveView);
 waveView.setAnim(false);//if you do not need to set animation effects
 waveView.setAnim(true);//set true to Restart anim
