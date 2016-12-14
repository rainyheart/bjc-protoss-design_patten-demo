package com.bjc.protoss.dp.module.factory.harry;

import com.bjc.protoss.dp.module.factory.harry.Sender;

/**
 * Created by zhexzhi on 2016/12/14.
 */
public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
