package com.itwsm.designPatternDemo.design_modules.creator.Prototype.深克隆;

import java.io.*;

public class CloneUtils {
    // 通用深克隆方法
    @SuppressWarnings("unchecked")
    public static <T extends Serializable> T deepClone(T obj) {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            
            // 1. 序列化：对象 → 字节数组
            oos.writeObject(obj);

            try (ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                 ObjectInputStream ois = new ObjectInputStream(bis)) {
                
                // 2. 反序列化：字节数组 → 全新对象
                return (T) ois.readObject();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}