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

import java.math.BigDecimal;

import org.junit.Test;

import com.bjc.protoss.dp.module.bridge.ken.CreditCard;
import com.bjc.protoss.dp.module.bridge.ken.PosMachine;
import com.bjc.protoss.dp.module.bridge.ken.impl.CmbCard;
import com.bjc.protoss.dp.module.bridge.ken.impl.IcbcCard;
import com.bjc.protoss.dp.module.bridge.ken.impl.NormalPosMachine;
import com.bjc.protoss.dp.module.bridge.ken.impl.SuperPosMachine;

/**
 * The bridge pattern is a design pattern used in software engineering
 * that is meant to "decouple an abstraction from its implementation
 * so that the two can vary independently", introduced by the Gang of
 * Four. The bridge uses encapsulation, aggregation, and can use
 * inheritance to separate responsibilities into different classes.
 */
public class Bridge {

    @Test
    public void cmbCard() {

        boolean creditSuccess = false;
        PosMachine pos = new NormalPosMachine();
        CreditCard cmbCard = new CmbCard(new BigDecimal(10000.00));

        pos.insertCreditCard(cmbCard);
        creditSuccess = pos.credit(new BigDecimal(6365.69));
        System.out.println("Credit result: " + creditSuccess);
        pos.removeCreditCard();

        cmbCard.printStatus();
    }

    @Test
    public void icbcCard() {

        boolean creditSuccess = false;
        PosMachine pos = new NormalPosMachine();
        CreditCard icbcCard = new IcbcCard(new BigDecimal(20000.00));

        pos.insertCreditCard(icbcCard);
        creditSuccess = pos.credit(new BigDecimal(6365.69));
        System.out.println("Credit result: " + creditSuccess);

        creditSuccess = pos.credit(new BigDecimal(10000.00));
        System.out.println("Credit result: " + creditSuccess);

        creditSuccess = pos.credit(new BigDecimal(10000.00));
        System.out.println("Credit result: " + creditSuccess);

        creditSuccess = pos.credit(new BigDecimal(3634.31));
        System.out.println("Credit result: " + creditSuccess);
        pos.removeCreditCard();

        icbcCard.printStatus();
    }

    @Test
    public void twoCards() {
        boolean creditSuccess = false;
        PosMachine pos = new SuperPosMachine();
        CreditCard cmbCard = new CmbCard(new BigDecimal(10000.00));
        CreditCard icbcCard = new IcbcCard(new BigDecimal(20000.00));

        pos.insertCreditCard(cmbCard);
        pos.insertCreditCard(icbcCard);

        creditSuccess = pos.credit(new BigDecimal(6365.69));
        System.out.println("1st Credit 6365.69 result: " + creditSuccess);
        cmbCard.printStatus();
        icbcCard.printStatus();

        creditSuccess = pos.credit(new BigDecimal(10000.00));
        System.out.println("2nd Credit 10000.00 result: " + creditSuccess);
        cmbCard.printStatus();
        icbcCard.printStatus();

        creditSuccess = pos.credit(new BigDecimal(10000.00));
        System.out.println("3rd Credit 10000.00 result: " + creditSuccess);
        cmbCard.printStatus();
        icbcCard.printStatus();

        creditSuccess = pos.credit(new BigDecimal(10000.00));
        System.out.println("4th Credit 10000.00 result: " + creditSuccess);
        cmbCard.printStatus();
        icbcCard.printStatus();

        creditSuccess = pos.credit(new BigDecimal(3634.00));
        System.out.println("5th Credit 3634.00 result: " + creditSuccess);
        cmbCard.printStatus();
        icbcCard.printStatus();

        pos.removeCreditCard();
        pos.removeCreditCard();

    }

}
