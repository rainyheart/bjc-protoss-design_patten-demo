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

import java.util.ArrayList;
import java.util.List;

import com.bjc.protoss.dp.module.mediator.ken.GeographyMap;
import com.bjc.protoss.dp.module.mediator.ken.Itinerary;

public class BaiduMap implements GeographyMap {

    private List<Itinerary> cachedResult = new ArrayList<>();

    @Override
    public List<Itinerary> search(String from, String to) {
        System.out.println("*****************************************************");
        List<Itinerary> result = new ArrayList<>();
        home2school(from, to, result);
        home2park(from, to, result);
        System.out.println("Baidu Map search itineraries for you ... : ");
        for (Itinerary itinerary : result) {
            itinerary.print();
        }
        System.out.println("*****************************************************");

        cachedResult.addAll(result);
        return result;
    }

    private void home2school(String from, String to, List<Itinerary> result) {
        if ("home".equals(from) && "school".equals(to)) {
            Itinerary itineraryA = new ItineraryImpl(from, "No.8", "BeiJing Lu", "Tianhe Bei", to);
            Itinerary itineraryB = new ItineraryImpl(from, "No.3", "HuangSha", "Tianhe Bei", to);
            Itinerary itineraryC = new ItineraryImpl(from, "No.18", "KeCun", "Tianhe Bei", to);
            Itinerary itineraryD = new ItineraryImpl(from, "No.28", "DongFeng Xi", "Tianhe Bei", to);

            result.add(itineraryA);
            result.add(itineraryB);
            result.add(itineraryC);
            result.add(itineraryD);
        }
    }

    private void home2park(String from, String to, List<Itinerary> result) {
        if ("home".equals(from) && "park".equals(to)) {
            Itinerary itineraryA = new ItineraryImpl(from, "No.6", "BeiJing Lu", "Tianhe Park", to);
            Itinerary itineraryB = new ItineraryImpl(from, "No.4", "HuangSha", "Tianhe Park", to);
            Itinerary itineraryC = new ItineraryImpl(from, "No.9", "KeCun", "Tianhe Park", to);

            result.add(itineraryA);
            result.add(itineraryB);
            result.add(itineraryC);
        }
    }

    @Override
    public void select(Itinerary itinerary) {
        for (Itinerary it : cachedResult) {
            if (it.equals(itinerary)) {
                it.display();
            } else {
                it.hide();
            }
        }
    }

    @Override
    public void show(Itinerary itinerary) {
        itinerary.print();
    }

    @Override
    public void showAll(List<Itinerary> itineraries) {
        System.out.println("Nevigating for you ... ");
        for (Itinerary itinerary : itineraries) {
            itinerary.print();
        }
    }

}
