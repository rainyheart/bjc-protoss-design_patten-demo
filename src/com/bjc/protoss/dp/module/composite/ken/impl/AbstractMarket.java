/*------------------------------------------------------------------------------
 * COPYRIGHT BJC 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * BJC Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.composite.ken.impl;

import java.util.HashMap;
import java.util.Map;

import com.bjc.protoss.dp.module.composite.ken.Merchandise;
import com.bjc.protoss.dp.module.composite.ken.SuperMarket;

public abstract class AbstractMarket implements SuperMarket {

    protected String address;
    protected Map<MemberCard, Float> localRecords;

    public AbstractMarket(String address) {
        super();
        this.address = address;
        localRecords = new HashMap<MemberCard, Float>();
    }

    @Override
    public String address() {
        return this.address;
    }

    protected void updateLocalAccumulatePoints(MemberCard memberCard, Merchandise merchandise) {
        if (!this.localRecords.containsKey(memberCard)) {
            this.localRecords.put(memberCard, 0f);
        }

        Float localAccumulatePoints = this.localRecords.get(memberCard);

        localAccumulatePoints = localAccumulatePoints + merchandise.getPrice();
        this.localRecords.put(memberCard, localAccumulatePoints);
    }
}
