/*
 * HelloClassLoader.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Week_01;


import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author changsu
 *
 */
public class HelloClassLoader extends ClassLoader {

    public static void main(String[] args)
            throws IllegalAccessException, InstantiationException, InvocationTargetException,
            NoSuchMethodException {
        Class clazz = new HelloClassLoader().findClass("Hello");
        Object o = clazz.newInstance();
        Method method = clazz.getMethod("hello");
        method.invoke(o);
    }

    @Override
    protected Class<?> findClass(final String name) {
        final String filePath = "E:\\IdeaProjects\\java-000\\source\\Hello.xlass";
        List<Byte> context = readFileToBytes(filePath);
        if (context == null) {
            //todo err throw
            return null;
        }
        final byte[] bytes = new byte[context.size()];
        for (int i = 0; i < context.size(); ++i) {
            bytes[i] = (byte) (255 - context.get(i));
        }
        return defineClass(name, bytes, 0, bytes.length);
    }

    public static List<Byte> readFileToBytes(String fileName) {
        final List<Byte> result = new ArrayList<>();
        try (
                FileReader fr = new FileReader(fileName);
        ) {
            int ch = 0;
            while ((ch = fr.read()) != -1) {
                result.add((byte) ch);
            }
            return result;
        } catch (final Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
