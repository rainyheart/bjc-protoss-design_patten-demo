package com.bjc.protoss.dp.harry;

import com.bjc.protoss.dp.module.template.harry.Template;
import com.bjc.protoss.dp.module.template.harry.TemplateConcrete;

/**
 * Created by zhexzhi on 12/14/2016.
 * 所谓模板板式，就是在父类中定义算法的主要流程，而把一些个性化的步骤延迟到子类中去实现
 * example: spring JdbcTemplate ...简化了很多样板式代码处理,使程序员只需关注业务
 * http://blog.csdn.net/dyllove98/article/details/7772463
 */
public class TemplateTest {
    public static void main(String[] args) {
        Template temp = new TemplateConcrete();
        temp.work();
    }
}
