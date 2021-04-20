package com.myapplicationdev.android.tw_listview;

public class Module {
    private boolean photo;
    private String module;
    public Module(boolean photo, String module) {
        this.photo = photo;
        this.module = module;
    }
    public boolean isPhoto() {
        return photo;
    }
    public String getModule() {
        return module;
    }
}
