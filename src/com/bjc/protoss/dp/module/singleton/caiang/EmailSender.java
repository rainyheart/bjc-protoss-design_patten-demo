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

package com.bjc.protoss.dp.module.singleton.caiang;

/**
 * Created by zcaiang on 14/03/2018.
 */
public class EmailSender implements Runnable {
    private volatile Session session = null;

    private Session getSession() {

        if (null == session) {
            synchronized (this) {
                if (null == session) {
                    session = new Session();
                }
            }
        }
        return session;
    }

    @Override
    public void run() {
        System.out.println("----------------------------------------------");
        System.out.println("Thread:" + Thread.currentThread().getName());
        System.out.println("session:" + getSession());
    }
}

class Session {

}