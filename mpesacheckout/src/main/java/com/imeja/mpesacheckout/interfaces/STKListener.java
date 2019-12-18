package com.imeja.mpesacheckout.interfaces;


import com.imeja.mpesacheckout.apidata.response.STKPushResponse;

public interface STKListener {

    void onResponse(STKPushResponse stkPushResponse);

    void onError(Throwable throwable);
}
