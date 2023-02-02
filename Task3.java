package HomeWork.Task3;
// 1 Объявить два списка список ArrayList, в каждый добавить по 20 случайных чисел.

//  Удалить из первого списка элементы отсутствующие во втором списке. 
// Отсортировать первый список методом sort класса Collections.
// 2 * Отсортировать второй список методом sort списка и компаратором по уменьшению.
// 3 **Отсортировать первый список пузырьковой сортировкой самостоятельно, без использования доп методов и классов.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
       
        Random rnd = new Random();
       
        for (int i = 0; i < 20; i++) {
            list1.add(rnd.nextInt(100));
        }
        for (int i = 0; i < 20; i++) {
            list2.add(rnd.nextInt(100));
        }       
        
        System.out.println(Arrays.toString(list1.toArray())); 
        System.out.println(Arrays.toString(list2.toArray()));   
        list1.retainAll(list2);
        System.out.println(Arrays.toString(list1.toArray()));
        Collections.sort(list1);
        System.out.println(Arrays.toString(list1.toArray()));
        list2.stream().sorted(Comparator.reverseOrder()).forEach(n -> System.out.print(n+" "));
         
    }

}    