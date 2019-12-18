package com.imeja.mpesacheckout.interfaces;


import com.imeja.mpesacheckout.apidata.response.STKPushResponse;


public interface STKQueryListener {

    void onResponse(STKPushResponse stkPushResponse);

    void onError(Throwable throwable);
}
