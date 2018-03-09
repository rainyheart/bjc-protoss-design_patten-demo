/*------------------------------------------------------------------------------
 * COPYRIGHT BJC 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * BJC Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.flyweight.ken.impl;

import com.bjc.protoss.dp.module.flyweight.ken.DataSource;

public class MySQL extends AbstractDataBase implements DataSource {

    @Override
    public boolean execute(String sql) {
        System.out.println(this.getClass().getSimpleName() + " executing sql: " + sql);
        return true;
    }

}
