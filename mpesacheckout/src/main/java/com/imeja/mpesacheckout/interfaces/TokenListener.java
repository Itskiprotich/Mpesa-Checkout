package com.imeja.mpesacheckout.interfaces;


import com.imeja.mpesacheckout.model.Token;

public interface TokenListener {

    /**
     * method callback when token is generated successfully
     *
     * @param token - object from mpesa api response
     */
    void onTokenSuccess(Token token);

    /**
     * called when an error occurs
     *
     * @param throwable - an exception
     */
    void OnTokenError(Throwable throwable);
}
