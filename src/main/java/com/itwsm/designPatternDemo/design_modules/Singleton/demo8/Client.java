package com.itwsm.designPatternDemo.design_modules.Singleton.demo8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

//反射破坏单例模式
public class Client {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Singleton instance = Singleton.getInstance();
        System.out.println("原本地址"+instance);
        Class<? extends Singleton> aClass = instance.getClass();
        Field flag = aClass.getDeclaredField("flag");
        flag.setAccessible(true);
        flag.setBoolean(flag,false);
        Constructor<? extends Singleton> declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Singleton singleton=declaredConstructor.newInstance();
        System.out.println("反射获取出来的"+singleton);
        Runtime runtime=Runtime.getRuntime();
    }
}
