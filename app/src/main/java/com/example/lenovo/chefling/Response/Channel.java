package com.example.lenovo.chefling.Response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 16/2/18.
 */

public class Channel {

    @SerializedName("item")
    private Item item;

    @SerializedName("astronomy")
    private Astrology astrology;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Astrology getAstrology() {
        return astrology;
    }

    public void setAstrology(Astrology astrology) {
        this.astrology = astrology;
    }
}
