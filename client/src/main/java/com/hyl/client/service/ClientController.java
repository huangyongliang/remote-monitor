package com.hyl.client.service;

import java.io.FileInputStream;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hyl.client.intf.ClassDto;
import com.hyl.client.intf.MonitorIntf;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hyl
 * @version v1.0: ClientController.java, v 0.1 2020/9/5 17:32 $
 */

@RestController
@Slf4j
public class ClientController {

    @Autowired
    private MonitorIntf monitorIntf;

    @RequestMapping("/")
    public void getResult(){

        ClassDto classDto = new ClassDto();
        classDto.setName("TestClass");
        try {
            // 本地class文件目录
            String filePath = "D:\\git\\mybase\\projects\\github\\remote-monitor\\client\\target\\classes\\com\\hyl\\client\\intf\\TestClass.class";
            InputStream is = new FileInputStream(filePath);
            byte [] b = new byte[is.available()];
            is.read(b);
            is.close();
            classDto.setDates(b);
        }catch (Exception e){
            e.printStackTrace();
        }

       log.info(monitorIntf.exeClass(classDto));
    }


}
