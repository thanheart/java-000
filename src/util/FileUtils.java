/*
 * FileUtils.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package util;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author changsu
 * @Date: 2020/10/20 13:21
 */
public class FileUtils {
    public static List<Byte> readFileToBytes(String fileName) {
        final List<Byte> result = new ArrayList<>();
        try (
                FileReader fr = new FileReader(fileName);
        ) {
            int ch = 0;
            while((ch = fr.read())!=-1 )
            {
                result.add((byte) ch);
            }
            return result;
        } catch (final Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
