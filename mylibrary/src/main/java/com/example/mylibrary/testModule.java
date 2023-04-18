package com.example.mylibrary;

import com.alibaba.fastjson.JSONObject;

import io.dcloud.feature.uniapp.annotation.UniJSMethod;
import io.dcloud.feature.uniapp.bridge.UniJSCallback;
import io.dcloud.feature.uniapp.common.UniModule;
public class testModule extends UniModule {
    @UniJSMethod(uiThread = true)
    public void  add (JSONObject json, UniJSCallback callback) {
        final int a = json.getInteger("a");
        final int b = json.getInteger("b");
        callback.invoke(new JSONObject() {{
            put("code", 0);
            put("result", a + b);
        }});
    }
}

