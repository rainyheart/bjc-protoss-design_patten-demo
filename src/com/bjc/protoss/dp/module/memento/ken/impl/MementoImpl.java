/*------------------------------------------------------------------------------
 * COPYRIGHT BJC 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * BJC Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.memento.ken.impl;

import com.bjc.protoss.dp.module.memento.ken.Data;
import com.bjc.protoss.dp.module.memento.ken.IMemento;

public class MementoImpl implements IMemento {

    private final String state;
    private final Data data;

    public MementoImpl(String state, Data data) {
        super();
        this.state = state;
        this.data = data.clone();
    }

    @Override
    public String getSavedState() {
        return this.state;
    }

    @Override
    public Data getData() {
        return this.data;
    }

}
