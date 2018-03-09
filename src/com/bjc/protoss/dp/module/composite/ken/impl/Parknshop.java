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

import com.bjc.protoss.dp.module.composite.ken.Merchandise;
import com.bjc.protoss.dp.module.composite.ken.SuperMarket;

public class Parknshop extends AbstractMarket implements SuperMarket {

    public Parknshop(String address) {
        super(address);
    }

    @Override
    public void purchase(MemberCard memberCard, Merchandise merchandise) {
        System.out.println(this.address + " Parknshop knows: " +
                "A " + merchandise.getName() + " has been sold in price " + merchandise.getPrice() + " to customer "
                + memberCard.getOwner());
        updateLocalAccumulatePoints(memberCard, merchandise);
    }

    @Override
    public Float printAccumulatePoints(MemberCard memberCard) {
        System.out.println(this.address + " SuperMarket shows: " + localRecords.get(memberCard));
        return localRecords.get(memberCard);
    }
}
