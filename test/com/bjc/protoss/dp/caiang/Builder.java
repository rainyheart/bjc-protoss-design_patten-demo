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

import com.bjc.protoss.dp.module.builder.caiang.Response;

/**
 * Created by zcaiang on 14/03/2018.
 */
public class Builder {
    @Test
    public void test() {

        Response response = new Response.ResponseBuilder(200).setLanguage("en").build();
        System.out.println(response.toString());
        Response response2 = new Response.ResponseBuilder(201).setLanguage("zh").setContent("....").build();
        System.out.println(response2.toString());
    }
}
