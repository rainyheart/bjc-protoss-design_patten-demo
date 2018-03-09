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

import java.util.ArrayList;
import java.util.List;

import com.bjc.protoss.dp.module.memento.ken.Data;

public class DataImpl implements Data {

    private List<String> content = new ArrayList<>();

    @Override
    public List<String> getContent() {
        return content;
    }

    @Override
    public Data clone() {
        try {
            DataImpl clone = (DataImpl) super.clone();
            clone.content = (List<String>) ((ArrayList) this.content).clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void add(String data) {
        this.content.add(data);
    }

    @Override
    public void remove(String data) {
        this.content.remove(data);
    }

}
