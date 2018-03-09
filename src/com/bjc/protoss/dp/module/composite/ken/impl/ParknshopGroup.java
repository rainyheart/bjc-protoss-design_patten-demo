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

import java.util.ArrayList;
import java.util.List;

import com.bjc.protoss.dp.module.composite.ken.Merchandise;
import com.bjc.protoss.dp.module.composite.ken.SuperMarket;

public class ParknshopGroup extends AbstractMarket implements SuperMarket {

    public ParknshopGroup(String address) {
        super(address);
    }

    private List<SuperMarket> markets = new ArrayList<>();

    @Override
    public void purchase(MemberCard memberCard, Merchandise merchandise) {
        for (SuperMarket market : markets) {
            market.purchase(memberCard, merchandise);
        }
        updateLocalAccumulatePoints(memberCard, merchandise);
    }

    public boolean join(SuperMarket market) {
        return this.markets.add(market);
    }

    public boolean quit(SuperMarket market) {
        return this.markets.remove(market);
    }

    public SuperMarket get(int index) {
        return markets.get(index);
    }

    @Override
    public Float printAccumulatePoints(MemberCard memberCard) {
        for (SuperMarket market : markets) {
            market.printAccumulatePoints(memberCard);
        }
        return localRecords.get(memberCard);
    }
}
