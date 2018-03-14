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

import org.junit.Test;

import com.bjc.protoss.dp.module.builder.ken.MobilePhone;
import com.bjc.protoss.dp.module.builder.ken.MobilePhoneBuilder;
import com.bjc.protoss.dp.module.builder.ken.MobilePhoneDirector;
import com.bjc.protoss.dp.module.builder.ken.impl.AppleBuilder;
import com.bjc.protoss.dp.module.builder.ken.impl.HuaweiBuilder;
import com.bjc.protoss.dp.module.builder.ken.impl.SamsungBuilder;

/**
 * Definition:<br/>
 * The intent of the Builder design pattern is to separate the
 * construction of a complex object from its representation. By doing
 * so the same construction process can create different
 * representations
 *
 */
public class Builder {

    private MobilePhoneDirector director = new MobilePhoneDirector();

    @Test
    public void buildIPhoneX() {
        MobilePhoneBuilder builder = new AppleBuilder();
        MobilePhone phone = director.produceMobilePhone(builder);

        System.out.println(phone);
    }

    @Test
    public void buildMate10() {
        MobilePhoneBuilder builder = new HuaweiBuilder();
        MobilePhone phone = director.produceMobilePhone(builder);

        System.out.println(phone);
    }

    @Test
    public void buildGalaxyS8() {
        MobilePhoneBuilder builder = new SamsungBuilder();
        MobilePhone phone = director.produceMobilePhone(builder);

        System.out.println(phone);
    }
}
