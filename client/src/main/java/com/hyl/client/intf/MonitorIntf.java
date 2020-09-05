package com.hyl.client.intf;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author hyl
 * @version v1.0: MonitorIntf.java, v 0.1 2020/9/5 17:34 $
 */
@FeignClient("MonitorServer")
public interface MonitorIntf {
    @PostMapping( "/exeClass")
    String exeClass(ClassDto classDto);
}
