package com.bjc.protoss.dp.module.command.harry;

/**
 * Created by zhexzhi on 2016/12/14.
 * 命令模式很好理解，举个例子，司令员下令让士兵去干件事情，从整个事情的角度来考虑，司令员的作用是，发出口令，口令经过传递，传到了士兵耳朵里，士兵去执行
 */
public interface Command {
    public void exec();
}
