/*------------------------------------------------------------------------------
 * COPYRIGHT BJC 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * BJC Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.ken;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

import com.bjc.protoss.dp.module.singleton.ken.ApplicationCache;

public class Singleton {

    @Test
    public void executeAsync() throws InterruptedException {
        System.out.println("=============== executeAsync ================");
        ExecutorService es = Executors.newCachedThreadPool();
        List<AsyncTask> list = new ArrayList<AsyncTask>();
        list.add(new AsyncTask(1, "hello"));
        list.add(new AsyncTask(2, "aa"));
        list.add(new AsyncTask(3, 1245));

        es.invokeAll(list);

        ApplicationCache.getInstance().print();

        System.out.println("Hash code: " + ApplicationCache.getInstance().hashCode());
    }

    @Test
    public void executeSync() throws InterruptedException {
        System.out.println("=============== executeSync ================");
        ExecutorService es = Executors.newCachedThreadPool();
        List<SyncTask> list = new ArrayList<SyncTask>();
        list.add(new SyncTask(1, "hello"));
        list.add(new SyncTask(2, "aa"));
        list.add(new SyncTask(3, 1245));

        es.invokeAll(list);

        ApplicationCache.getInstance().print();
        System.out.println("Hash code: " + ApplicationCache.getInstance().hashCode());
    }

    class AsyncTask implements Callable<ApplicationCache> {
        Object key;
        Object value;

        public AsyncTask(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public ApplicationCache call() throws Exception {

            ApplicationCache.getInstance().asyncPut(key, value);
            return ApplicationCache.getInstance();
        }
    }

    class SyncTask implements Callable<ApplicationCache> {
        Object key;
        Object value;

        public SyncTask(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public ApplicationCache call() throws Exception {

            ApplicationCache.getInstance().syncPut(key, value);
            return ApplicationCache.getInstance();
        }
    }
}
