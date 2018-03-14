/*
 *
 *  * ----------------------------------------------------------------------
 *  * COPYRIGHT Ericsson 2016
 *  *
 *  * The copyright to the computer program(s) herein is the property of
 *  * Ericsson Inc. The programs may be used and/or copied only with written
 *  * permission from Ericsson Inc. or in accordance with the terms and
 *  * conditions stipulated in the agreement/contract under which the
 *  * program(s) have been supplied.
 *  * ----------------------------------------------------------------------
 *
 */

package com.bjc.protoss.dp.caiang;

import org.junit.Test;

import com.bjc.protoss.dp.module.singleton.caiang.EmailSender;

/**
 * Created by zcaiang on 14/03/2018.
 */
public class Singleton {
    @Test
    public void testSendEmail() throws InterruptedException {
        EmailSender emailSender = new EmailSender();
        Thread t1 = new Thread(emailSender, "thread-1");
        Thread t2 = new Thread(emailSender, "thread-2");
        Thread t3 = new Thread(emailSender, "thread-3");
        Thread t4 = new Thread(emailSender, "thread-4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        Thread.sleep(10 * 1000);
    }
}
