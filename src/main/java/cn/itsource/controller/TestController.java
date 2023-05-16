package cn.itsource.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * <p>TestController</p>
 *
 * @author 波波老师(微信 ： javabobo0513)
 */
@RestController
@Slf4j
public class TestController {

    @GetMapping("/test")
    public String test(){
        System.out.println("System.out.println-欢迎来到SpringBoot奇妙世界！");
        log.info("log.info-欢迎来到SpringBoot奇妙世界！");
        return "欢迎来到SpringBoot奇妙世界！Jenkins学习";
    }

}