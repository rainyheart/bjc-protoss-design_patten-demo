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

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.bjc.protoss.dp.module.memento.ken.Data;
import com.bjc.protoss.dp.module.memento.ken.IMemento;
import com.bjc.protoss.dp.module.memento.ken.ProjectManager;

public class Memento {

    List<IMemento> savedStates = new ArrayList<>();

    @Test
    public void execute() {
        ProjectManager pm = new ProjectManager();
        pm.addProject("Project 1");
        pm.addProject("Project 2");
        pm.addProject("Project 3");
        pm.setState("20180309");
        IMemento m20180309 = pm.saveToMemento();
        savedStates.add(m20180309);

        pm.finishProject("Project 1");
        pm.addProject("Project 4");
        pm.setState("20180311");
        IMemento m20180311 = pm.saveToMemento();
        savedStates.add(m20180311);

        pm.finishProject("Project 2");
        pm.finishProject("Project 3");
        pm.addProject("Project 5");
        pm.addProject("Project 6");
        pm.setState("20180314");
        IMemento m20180314 = pm.saveToMemento();
        savedStates.add(m20180314);

        showProjectsUnderPM(pm);

        pm.restoreFromMemento(m20180311);
        showProjectsUnderPM(pm);
    }

    private void showProjectsUnderPM(ProjectManager pm) {
        System.out.println("The projects under the PM with state " + pm.getState() + ": ");
        Data data = pm.getProjects();
        for (String project : data.getContent()) {
            System.out.println(project);
        }
    }
}
