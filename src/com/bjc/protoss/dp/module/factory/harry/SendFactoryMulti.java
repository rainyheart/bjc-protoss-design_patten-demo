package com.bjc.protoss.dp.module.factory.harry;

/**
 * Created by zhexzhi on 12/14/2016.
 */
public class SendFactoryMulti {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
