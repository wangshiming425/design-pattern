package com.itwsm.designPatternDemo.design_modules.factory.config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

//读取配置文件中的名字加载对象到这个容器中
public class SimpleFactory {
    //存储对象的容器
    private static Map<String, Chart> map = new ConcurrentHashMap<>();

    static {
        //创建properties对象
        Properties properties = new Properties();
        InputStream inputStream = SimpleFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(inputStream);
            //从properties中获取对象并创建到map集合中
            Set<Object> objects = properties.keySet();
            for (Object object : objects) {
                String property = properties.getProperty((String) object);
                Class clazz = Class.forName(property);
                Chart chart = (Chart) clazz.newInstance();
                map.put((String) object, chart);
            }
        } catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static Chart createChart(String name) {
        return map.get(name);
    }
}
