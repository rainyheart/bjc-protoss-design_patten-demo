package com.bjc.protoss.dp.harry;

import com.bjc.protoss.dp.module.facade.harry.Computer;

/**
 * Created by zhexzhi on 2016/12/14.
 */
public class FacadeTest {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }

}
