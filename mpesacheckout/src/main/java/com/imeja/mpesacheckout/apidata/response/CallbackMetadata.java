package com.imeja.mpesacheckout.apidata.response;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CallbackMetadata {

    @SerializedName("Item")
    @Expose
    private List<ItemData> item = null;

    public List<ItemData> getItem() {
        return item;
    }

    public void setItem(List<ItemData> item) {
        this.item = item;
    }

}
