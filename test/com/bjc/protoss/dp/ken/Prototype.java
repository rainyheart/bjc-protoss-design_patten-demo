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

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.bjc.protoss.dp.module.prototype.ken.H2O;

@FixMethodOrder(value = MethodSorters.NAME_ASCENDING)
public class Prototype {

    int count = 1000000;
    private String method = null;
    private long before = 0l;
    private long after = 0l;

    @Before
    public void before() {
        before = System.currentTimeMillis();
    }

    @After
    public void after() {
        after = System.currentTimeMillis();
        System.out.println(this.method + ": " + (after - before));
    }

    @Test
    public void testCloneObject() {
        this.method = "testCloneObject";
        Set<H2O> water = new HashSet<H2O>();
        H2O h2o = new H2O();
        for (int i = 0; i < count; i++) {
            water.add(h2o.clone());
        }
    }

    @Test
    public void testDeepCloneObject() {
        this.method = "testDeepCloneObject";
        Set<H2O> water = new HashSet<H2O>();
        H2O h2o = new H2O();
        for (int i = 0; i < count; i++) {
            water.add(h2o.deepClone());
        }
    }

    @Test
    public void testNewObject() {
        this.method = "testNewObject";
        Set<H2O> water = new HashSet<H2O>();
        for (int i = 0; i < count; i++) {
            water.add(new H2O());
        }
    }
}
