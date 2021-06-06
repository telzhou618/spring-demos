package com.example;

import org.apache.catalina.startup.Tomcat;

/**
 * @author jameszhou
 */
public class ApplicationMain {

    public static void main(String[] args) throws Exception {

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8081);
        // 这里需要指定一个文件路径，不过没什么用，所以我放一个"java.io.tmpdir"临时目录
        //  Context context = tomcat.addContext("/", System.getProperty("java.io.tmpdir"));
        tomcat.addWebapp("/", System.getProperty("java.io.tmpdir"));
        tomcat.start();
        tomcat.getServer().await();

    }
}
