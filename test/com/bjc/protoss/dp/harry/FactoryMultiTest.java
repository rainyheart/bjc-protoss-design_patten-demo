package com.bjc.protoss.dp.harry;

import com.bjc.protoss.dp.module.factory.harry.SendFactory;
import com.bjc.protoss.dp.module.factory.harry.SendFactoryMulti;
import com.bjc.protoss.dp.module.factory.harry.Sender;

/**
 * Created by zhexzhi on 12/14/2016.
 * 多个工厂方法模式，是对普通工厂方法模式的改进，
 * 在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，
 * 而多个工厂方法模式是提供多个工厂方法，分别创建对象
 *
 * 静态工厂方法模式，将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可
 */
public class FactoryMultiTest {

    public static void main(String[] args) {

        SendFactoryMulti factory = new SendFactoryMulti();

        Sender sender = factory.produceSms();
        sender.Send();

        sender = factory.produceMail();
        sender.Send();

        System.out.println("------send create by static method---------");

        sender = SendFactoryMulti.produceSms();
        sender.Send();

        sender = SendFactoryMulti.produceMail();
        sender.Send();

    }
}
