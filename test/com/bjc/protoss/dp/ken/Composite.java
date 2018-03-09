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

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.bjc.protoss.dp.module.composite.ken.Merchandise;
import com.bjc.protoss.dp.module.composite.ken.impl.MemberCard;
import com.bjc.protoss.dp.module.composite.ken.impl.Parknshop;
import com.bjc.protoss.dp.module.composite.ken.impl.ParknshopGroup;

/**
 * The composite pattern describes a group of objects that is treated
 * the same way as a single instance of the same type of object. The
 * intent of a composite is to "compose" objects into tree structures
 * to represent part-whole hierarchies. Implementing the composite
 * pattern lets clients treat individual objects and compositions
 * uniformly
 *
 */
public class Composite {
    private ParknshopGroup parknshop;

    @Before
    public void setupMarkets() {
        parknshop = new ParknshopGroup("Parknshop");

        ParknshopGroup asiaGroup = new ParknshopGroup("Asia Parknshop");
        asiaGroup.join(new Parknshop("Guangzhou Parknshop"));
        asiaGroup.join(new Parknshop("Shanghai Parknshop"));
        asiaGroup.join(new Parknshop("Beijing Parknshop"));
        asiaGroup.join(new Parknshop("Shenzhen Parknshop"));

        ParknshopGroup europeGroup = new ParknshopGroup("Europe Parknshop");
        europeGroup.join(new Parknshop("Paris Parknshop"));
        europeGroup.join(new Parknshop("London Parknshop"));
        europeGroup.join(new Parknshop("Copenhagen Parknshop"));

        ParknshopGroup naGroup = new ParknshopGroup("North America Parknshop");
        naGroup.join(new Parknshop("Newyork Parknshop"));
        naGroup.join(new Parknshop("Los Angeles Parknshop"));
        naGroup.join(new Parknshop("Vancouver Parknshop"));

        parknshop.join(asiaGroup);
        parknshop.join(europeGroup);
        parknshop.join(naGroup);
    }

    @Test
    public void purchase() {
        MemberCard memberCard = new MemberCard("Ken");
        parknshop.purchase(memberCard, new Merchandise("rice", 15.6f));
        parknshop.purchase(memberCard, new Merchandise("pork", 38.6f));
        parknshop.purchase(memberCard, new Merchandise("vegetable", 6.8f));
        parknshop.purchase(memberCard, new Merchandise("wahaha", 30f));
        parknshop.purchase(memberCard, new Merchandise("wang lao ji", 40f));
        System.out.println("-----------------------------------------------------------------------------------");

        float value = 15.6f + 38.6f + 6.8f + 30f + 40f;
        assertTrue(value == parknshop.get(0).printAccumulatePoints(memberCard).floatValue());
        assertTrue(value == parknshop.get(1).printAccumulatePoints(memberCard).floatValue());
        assertTrue(value == parknshop.get(2).printAccumulatePoints(memberCard).floatValue());
    }
}
