package Practical_3;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        testList();
        testSet();
    }

    public static void testList(){
        List<Integer> syncList = new SynList<>();
        Runnable task1 = () -> {
            for(int i = 1; i < 25; i++){
                syncList.add(i);
            }
        };
        Runnable task2 = () -> {
            for (int i = 26; i < 51; i++){
                syncList.add(i);
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);


        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(syncList.toString());
    }

    public static void testSet(){
        Set<Integer> set = new SemSet<>();
        Runnable task1 = () -> {
            for(int i = 1; i < 25; i++){
                set.add(i);
            }
        };
        Runnable task2 = () -> {
            for (int i = 26; i < 51; i++){
                set.add(i);
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);


        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(set.toString());
    }
}
