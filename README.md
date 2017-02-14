# DoubleWave
# this is a custom view for android

![GIF](https://github.com/xiaosong520/DoubleWave/blob/master/app/GIF.gif)


## How to Use

###Step one：
>>
```Java
//module project
        dependencies {
            compile 'com.xiaosong520:doublewaveview:1.0.1'
    }
```


###Step two：
>>
```Java
<com.doublewave.DoubleWaveView
        android:id="@+id/waveView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        DoubleWaveView:speedOne="8"
        DoubleWaveView:speedTwo="6"
        DoubleWaveView:peakValue="20dp"
        DoubleWaveView:waveHeight="200dp"
        DoubleWaveView:waveColor="@color/colorBlue"/>
```

###Step three：
>>
```Java
 waveView = (DoubleWaveView) findViewById(R.id.waveView);
 waveView.setAnim(false);//if you do not need to set animation effects
 waveView.setAnim(true);//set true to Restart anim
 ```
 欢迎Star、Fork 
CSDN Blog:[小嵩的博客](http://blog.csdn.net/qq_22393017/article/details/55096961)
