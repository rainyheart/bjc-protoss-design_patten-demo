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

import java.util.List;

import org.junit.Test;

import com.bjc.protoss.dp.module.mediator.ken.GeographyMap;
import com.bjc.protoss.dp.module.mediator.ken.Itinerary;
import com.bjc.protoss.dp.module.mediator.ken.impl.BaiduMap;

/**
 * Mediator pattern defines an object that encapsulates how a set of
 * objects interact. This pattern is considered to be a behavioral
 * pattern due to the way it can alter the program's running behavior.
 */
public class Mediator {

    @Test
    public void home2School() {
        GeographyMap map = new BaiduMap();
        List<Itinerary> result = map.search("home", "school");
        chooseAnItinerary(map, result, 2);
        //        chooseAnItinerary(map, result, 3);
        //        chooseAnItinerary(map, result, 1);
    }

    @Test
    public void home2park() {
        GeographyMap map = new BaiduMap();
        List<Itinerary> result = map.search("home", "park");
        //        chooseAnItinerary(map, result, 2);
        chooseAnItinerary(map, result, 1);
    }

    private void chooseAnItinerary(GeographyMap map, List<Itinerary> result, int number) {
        System.out.println("--------------------------");
        Itinerary itinerary = result.get(number);
        map.select(itinerary);
        System.out.println("You have selected itinerary: " + number);
        map.showAll(result);
        // map.show(itinerary);
        System.out.println("--------------------------");
    }
}
