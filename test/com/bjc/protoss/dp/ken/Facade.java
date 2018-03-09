package com.bjc.protoss.dp.ken;

import org.junit.Test;

import com.bjc.protoss.dp.module.facade.wesley.DataSourceFacade;
import com.bjc.protoss.dp.module.facade.wesley.UnAuthorizedException;
import com.bjc.protoss.dp.module.facade.wesley.impl.DataAccessor;

/**
 *
 * Provide a unified interface to a set of interfaces in a subsystem.
 * Facade
 * defines a higher-level interface that makes the subsystem easier to
 * use.
 *
 * The pre-condiction is that not changing the existing several
 * intefaces, but build a new one
 * and consolidate/simplify the interface to caller.
 *
 */
public class Facade {

    @Test
    public void getSetData() throws UnAuthorizedException {
        DataSourceFacade dataSource = new DataAccessor();
        dataSource.setValue("name", "Wesley");
        dataSource.getValue("name");

        dataSource.getValue("not exist");
    }

}
