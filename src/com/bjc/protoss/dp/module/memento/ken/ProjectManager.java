/*------------------------------------------------------------------------------
 * COPYRIGHT BJC 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * BJC Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.memento.ken;

import com.bjc.protoss.dp.module.memento.ken.impl.DataImpl;
import com.bjc.protoss.dp.module.memento.ken.impl.MementoImpl;

public class ProjectManager {
    private String state;
    private Data projects = new DataImpl();

    public IMemento saveToMemento() {
        IMemento memento = new MementoImpl(this.state, this.projects);
        return memento;
    }

    public void restoreFromMemento(IMemento memento) {
        System.out.println("Restore to state: " + memento.getSavedState());
        this.state = memento.getSavedState();
        this.projects = memento.getData();
    }

    public Data getProjects() {
        return projects;
    }

    public void addProject(String project) {
        this.projects.add(project);
    }

    public void finishProject(String project) {
        this.projects.remove(project);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        System.out.println("PM's state is set to: " + state);
        this.state = state;
    }

}
