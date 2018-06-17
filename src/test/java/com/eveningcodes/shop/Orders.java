package com.eveningcodes.shop;

import java.sql.Time;

public class Orders {
    private Time refresh_time;
    private String resoled_status;
    private Time addtime;

    public Orders(Time refresh_time, String resoled_status, Time addtime) {
        this.refresh_time = refresh_time;
        this.resoled_status = resoled_status;
        this.addtime = addtime;
    }

    public Time getAddtime() {
        return addtime;
    }

    public void setAddtime(Time addtime) {
        this.addtime = addtime;
    }

    public String getResoled_status() {
        return resoled_status;
    }

    public void setResoled_status(String resoled_status) {
        this.resoled_status = resoled_status;
    }

    public Time getRefresh_time() {
        return refresh_time;
    }

    public void setRefresh_time(Time refresh_time) {
        this.refresh_time = refresh_time;
    }
}
