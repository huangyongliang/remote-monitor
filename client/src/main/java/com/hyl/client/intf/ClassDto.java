package com.hyl.client.intf;

import java.io.Serializable;

/**
 * @author hyl
 * @version v1.0: ClassDto.java, v 0.1 2020/9/5 18:14 $
 */

public class ClassDto implements Serializable {
    private String name;
    /**
     *  字节码
     */
    private byte[] dates;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getDates() {
        return dates;
    }

    public void setDates(byte[] dates) {
        this.dates = dates;
    }
}
