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

public class School implements Place {

	public School() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Position getPosition() {
		Position school = new Position();
		school.setLongitude(38.0);
		school.setLatitude(20.1);
		return school;
	}

}
