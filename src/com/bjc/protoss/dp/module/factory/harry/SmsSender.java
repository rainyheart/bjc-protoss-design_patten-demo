package com.bjc.protoss.dp.module.factory.harry;

import com.bjc.protoss.dp.module.factory.harry.Sender;

/**
 * Created by zhexzhi on 12/14/2016.
 */
public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("\nthis is sms sender!");
    }
}
