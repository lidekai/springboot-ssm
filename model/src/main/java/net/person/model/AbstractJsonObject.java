package net.person.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by admin on 2019/3/15.
 */
public class AbstractJsonObject {
    //code
    private String code;
    //msg
    private String msg;

    private String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }
    /**
     * @param time
     *            the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public void setContent(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public void setStatusObject(StatusObject statusObject) {
        this.code = statusObject.getCode();
        this.msg = statusObject.getMsg();
    }
}