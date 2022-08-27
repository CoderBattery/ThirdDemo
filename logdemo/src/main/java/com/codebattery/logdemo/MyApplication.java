package com.codebattery.logdemo;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.LogStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

import org.jetbrains.annotations.NotNull;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(false)  // 是否显示线程信息，默认为ture
                .methodCount(0)         // 显示的方法行数，默认为2
                .methodOffset(0)        // 隐藏内部方法调用到偏移量，默认为5
//                .logStrategy(new LogStrategy() {
//                    @Override
//                    public void log(int priority, @Nullable @org.jetbrains.annotations.Nullable String tag, @NonNull @NotNull String message) {
//                        Log.e(tag, message);
//                    }
//                }) // 更改要打印的日志策略。
                .tag("MediaX-Default")   // 每个日志的全局标记。默认PRETTY_LOGGER
                .build();


        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy){
            @Override
            public boolean isLoggable(int priority, String tag) {
                // 设置日志是否要打印出来
                return true;
            }
        });

    }
}
