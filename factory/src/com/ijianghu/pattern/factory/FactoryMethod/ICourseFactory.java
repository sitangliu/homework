package com.ijianghu.pattern.factory.FactoryMethod;

import com.ijianghu.pattern.factory.SimpleFactory.ICourse;

/**
 * @author kai on
 * @date 2019/3/9 23:20
 */
public interface ICourseFactory {

    ICourse createCourse();

}
