package com.h.appmvp.base;

import android.content.Context;

import com.trello.rxlifecycle.LifecycleTransformer;

/**
 * Created by baixiaokang on 16/4/22.
 */
public interface BaseView {
    void onRequestStart();

    void onRequestError(String msg);

    void onRequestEnd();

    void onInternetError();

    void onRequestMessage(String msg);

    Context getViewContext();

    /**
     * 绑定生命周期
     * @param <T>
     * @return
     */
    <T> LifecycleTransformer<T> bindToLife();

}
