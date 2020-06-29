package com.drumge.kvo.example;

import com.drumge.kvo.annotation.KvoBind;
import com.drumge.kvo.annotation.KvoSource;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by chenrenzhan on 2018/9/22.
 */

@KvoSource(check = false)
public abstract class BaseSource {
    private CopyOnWriteArrayList<String> list;
    private String baseClass;
    private String moreField;

    public void setBaseClass(String baseClass) {
        this.baseClass = baseClass;
    }

    @KvoBind(name = K_BaseSource.list)
    public void setList(CopyOnWriteArrayList<String> list) {
        this.list = list;
    }
}
