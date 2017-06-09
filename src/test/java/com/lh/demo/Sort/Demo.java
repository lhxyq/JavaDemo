package com.lh.demo.Sort;

import com.lh.demo.sort.QuickSort;
import com.lh.demo.sort.Sort;

import java.util.Comparator;

/**
 * Created by LH 2446059046@qq.com on 2017/6/9.
 */
public class Demo {
    public static void main(String[] args) {
        /*Integer[] arr = new Integer[] {8, 2, 1, 4,6,7, 3, 5, 9, 6,11,19,13,55,67,32,22};
        Sort<Integer> sort = new QuickSort<>();
        sort.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });

        for (Integer integer : arr) {
            System.out.print(integer + "\t");
        }*/

        Person p0 = new Person("刘辉0", 20);
        Person p1 = new Person("刘辉1", 24);
        Person p2 = new Person("刘辉2", 23);
        Person[] p = new Person[]{p0, p1, p2};
        Sort<Person> sort = new QuickSort<>();
        sort.sort(p, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return - (o1.age - o2.age);
            }
        });

        for (Person person : p) {
            System.out.println(person.getName() + "\t" + person.getAge());

        }
    }
}
