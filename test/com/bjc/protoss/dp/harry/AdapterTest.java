package com.bjc.protoss.dp.harry;

import com.bjc.protoss.dp.module.adapter.harry.Sourceable;
import com.bjc.protoss.dp.module.adapter.harry.SourceSub1;
import com.bjc.protoss.dp.module.adapter.harry.SourceSub2;

/**
 * Created by zhexzhi on 2016/12/14.
 */
public class AdapterTest {
    public static void main(String[] args) {

        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();

        source1.method1();
        source1.method2();

        source2.method1();
        source2.method2();
    }
}
