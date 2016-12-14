package com.bjc.protoss.dp.harry;

import com.bjc.protoss.dp.module.factory.harry.SendFactory;
import com.bjc.protoss.dp.module.factory.harry.Sender;

/**
 * Created by zhexzhi on 2016/12/14.
 */
public class FactoryTest {

    public static void main(String[] args) {

        SendFactory factory = new SendFactory();

        Sender sender = factory.produce("sms");
        sender.Send();

        sender = factory.produce("mail");
        sender.Send();

    }
}
