package com.itwsm.designPatternDemo.design_modules.Singleton.JavaTest;

import java.io.IOException;
import java.io.InputStream;

public class RuntimeTest {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process ipconfig = runtime.exec("ipconfig");
        try (InputStream inputStream = ipconfig.getInputStream()) {
            byte[] arr = new byte[1024 * 1024 * 100];
            int len = inputStream.read(arr);//返回读取到的字节数组个数
            //将字节数据转化为字符串打印到控制台
            System.out.println(new String(arr, 0, len, "GBK"));
        }finally {
            ipconfig.destroy();
        }
    }
}
