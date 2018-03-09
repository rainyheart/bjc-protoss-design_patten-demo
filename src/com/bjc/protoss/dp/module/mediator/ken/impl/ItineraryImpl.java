/*------------------------------------------------------------------------------
 * COPYRIGHT BJC 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * BJC Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.mediator.ken.impl;

import java.util.LinkedList;
import java.util.List;

import com.bjc.protoss.dp.module.mediator.ken.Itinerary;

public class ItineraryImpl implements Itinerary {

    private boolean display = true;
    private List<String> places;

    public ItineraryImpl(String... somePlaces) {
        super();
        places = new LinkedList<>();
        for (String place : somePlaces) {
            places.add(place);
        }
    }

    @Override
    public void print() {
        if (display) {
            StringBuilder sb = new StringBuilder();
            for (String place : places) {
                sb.append(place).append(" -> ");
            }

            sb.delete(sb.length() - 4, sb.length());
            System.out.println(sb.toString());
        }
    }

    @Override
    public void display() {
        display = true;

    }

    @Override
    public void hide() {
        display = false;
    }

}
