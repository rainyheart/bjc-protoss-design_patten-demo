/*------------------------------------------------------------------------------
 * COPYRIGHT BJC 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * BJC Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.prototype.ken;

import java.util.HashSet;
import java.util.Set;

public class H2O implements Cloneable {

    private Set<Atom> structure;
    private final Integer mass;

    public H2O() {
        structure = new HashSet<Atom>();
        Atom hydrogen1 = new Atom(1, 1);
        Atom hydrogen2 = hydrogen1.clone();
        Atom oxygen = new Atom(8, 8);
        structure.add(hydrogen1);
        structure.add(hydrogen2);
        structure.add(oxygen);
        this.mass = hydrogen1.getMass() + hydrogen2.getMass() + oxygen.getMass();
    }

    @Override
    public H2O clone() {
        H2O clone = null;
        try {
            clone = (H2O) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
        return clone;
    }

    @SuppressWarnings("unchecked")
    public H2O deepClone() {
        H2O clone = this.clone();
        clone.structure = (Set<Atom>) ((HashSet<Atom>) this.structure).clone();
        return clone;
    }

    public Integer getMass() {
        return mass;
    }
}
