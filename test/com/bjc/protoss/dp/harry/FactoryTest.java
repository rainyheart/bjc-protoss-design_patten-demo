package com.bjc.protoss.dp.harry;

import com.bjc.protoss.dp.module.factory.harry.SendFactory;
import com.bjc.protoss.dp.module.factory.harry.Sender;

/**
 * Created by zhexzhi on 12/14/2016.
 * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
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
