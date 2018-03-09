/*------------------------------------------------------------------------------
 * COPYRIGHT BJC 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * BJC Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.composite.ken;

import com.bjc.protoss.dp.module.composite.ken.impl.MemberCard;

public interface SuperMarket {
    public void purchase(MemberCard memberCard, Merchandise merchandise);

    public String address();

    public Float printAccumulatePoints(MemberCard memberCard);
}
