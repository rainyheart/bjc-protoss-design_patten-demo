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

import com.bjc.protoss.dp.module.abstractfactory.caiang.impl.AppleFactory;
import com.bjc.protoss.dp.module.abstractfactory.caiang.impl.BananaFactory;

/**
 * Created by zcaiang on 14/03/2018.
 */
public class AbstractFactory {
    @Test
    public void testGetApple() {
        AppleFactory appleFactory = new AppleFactory();
        System.out.println(appleFactory.getFruit());
        System.out.println(appleFactory.getFruit().getName());
    }

    @Test
    public void testGetBanana() {
        BananaFactory bananaFactory = new BananaFactory();
        System.out.println(bananaFactory.getFruit());
        System.out.println(bananaFactory.getFruit().getName());
    }
}
