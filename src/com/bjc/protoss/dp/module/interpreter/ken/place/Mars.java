/*------------------------------------------------------------------------------
 * COPYRIGHT Ericsson 2016
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.interpreter.ken.place;

import com.bjc.protoss.dp.module.interpreter.ken.Place;
import com.bjc.protoss.dp.module.interpreter.ken.Position;

public class Mars implements Place {

	@Override
	public Position getPosition() {
		Position mars = new Position();
		mars.setLongitude(-1);
		mars.setLatitude(-1);
		return mars;
	}

}
