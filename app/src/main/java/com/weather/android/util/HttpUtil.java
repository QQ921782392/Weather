package com.weather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 项目名称：Weather
 * 类描述：
 * 创建人：建航
 * 创建时间：2017/2/24 14:36
 * 修改人：建航
 * 修改时间：2017/2/24 14:36
 * 修改备注：
 */
public class HttpUtil {
    /**
     * 与服务器进行交互
     * @param address  请求地址
     * @param callback  回调
     */
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
