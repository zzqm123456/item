package com.itheima.aspect;

import org.springframework.stereotype.Component;

@Component
public class MyAspect {

    public void CheckPermissions() throws InterruptedException {

        System.out.println("权限的校验中,请等待~");
        Thread.sleep(3000);

    }
}
