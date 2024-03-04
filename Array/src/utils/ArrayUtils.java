package utils;

import bean.Item;

public class ArrayUtils {
    private ArrayUtils(){

    }

    public static void printf(int[] elements){
        for(int element:elements){
            System.out.print(element + " ");
        }
    }
    public static void printf(String[] elements){
        for(String element:elements){
            System.out.print(element + " ");
        }
    }
    public static void printf(Item[] elements){
        for(Item element:elements){
            System.out.print(element + " ");
        }
    }
    public static void swap(int[] array, int i, int j ){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = array[i];
    }
    public static void swap(String[] array, int i, int j ){
        String tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    public static void swap(Item[] array, int i, int j ){
        Item tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
