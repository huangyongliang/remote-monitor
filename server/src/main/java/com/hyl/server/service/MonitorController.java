package com.hyl.server.service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hyl.server.core.JavaClassExecuter;
import com.hyl.server.service.dto.ClassDto;

import lombok.extern.slf4j.Slf4j;

/**
 * 服务接口
 *
 * @author hyl
 * @version v1.0: MonitorController.java, v 0.1 2020/9/5 17:15 $
 */
@RestController
@Slf4j
public class MonitorController {

    @PostMapping("/exeClass")
    public String exeClass(@RequestBody ClassDto classDto){

        log.info("执行类： "+classDto.getName());
        String result = JavaClassExecuter.execute(classDto.getDates());
        log.info("执行结果："+result);

        return result;
    }

}
