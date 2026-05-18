package com.itwsm.designPatternDemo.design_modules.creator.Singleton.demo7;

import java.io.*;

//通过序列化破坏单例模式
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //获取全局唯一单例对象
        Singleton singleton=Singleton.getInstance();
        System.out.println(singleton);
        //序列化和反序列化
        writeObjectToFile(singleton);
        Singleton object = (Singleton)readObjectFromFile();
        //打印反序列化后的地址,发现二者不一样,破坏了单例模式
        System.out.println(object);
    }
    public static Object readObjectFromFile () throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\Temp\\例子.txt"));
        Object object = ois.readObject();
        ois.close();
        return object;
    }
    public static void writeObjectToFile(Object object) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\Temp\\例子.txt"));
        oos.writeObject(object);
        oos.close();
    }
}
