package com.hyl.remotemonitor.core;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author hyl
 * @version v1.0: TestServerClass.java, v 0.1 2020/9/4 14:39 $
 */
public class TestServerClass {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("D:\\git\\mybase\\projects\\github\\remote-monitor\\target\\classes\\com\\hyl\\remotemonitor\\core\\TestClass.class");
        byte [] b = new byte[is.available()];
        is.read(b);
        is.close();
        String result = JavaClassExecuter.execute(b);

        System.out.println(result);
    }
}
