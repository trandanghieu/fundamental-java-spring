package com.jdbc.utils;

import java.util.List;

public class SqlUtils {
    private SqlUtils() {

    }

    public static void close(AutoCloseable... closeables) {
        try {
            for (AutoCloseable closeable : closeables) {
                if (closeable != null) {
                    closeable.close();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static <E> void print(List<E> elements){
        for (E element:elements) {
            System.out.println(element);
        }
    }
}
