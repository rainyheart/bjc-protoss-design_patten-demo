/*------------------------------------------------------------------------------
 * COPYRIGHT BJC 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * BJC Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.bridge.ken;

import java.math.BigDecimal;

public interface PosMachine {

    public void insertCreditCard(CreditCard card);

    public boolean credit(BigDecimal money);

    public CreditCard removeCreditCard();
}
