package com.ijianghu.pattern.factory.FactoryMethod;

import com.ijianghu.pattern.factory.SimpleFactory.ICourse;
import com.ijianghu.pattern.factory.SimpleFactory.JavaCourse;

/**
 * @author kai on
 * @date 2019/3/9 23:28
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }
}
