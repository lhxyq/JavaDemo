package com.lh.demo.ThreadLocal;

/**
 * Created by LH 2446059046@qq.com on 2017/9/20.
 */
public class PersonManger {
    private static ThreadLocal<Person> threadLocal = new ThreadLocal<Person>() {
        @Override
        protected Person initialValue() {
            Person person = new Person();
            person.setName("liuhui");
            person.setAge(20);
            person.setSex("男");
            return person;
        }
    };

    public static Person getPerson() {
        return threadLocal.get();
    }

    public static void setPerson(Person person) {
        threadLocal.set(person);
    }

    /*private static Person person;

    public static Person getPerson() {
        return person;
    }

    public static void setPerson(Person person) {
        PersonManger.person = person;
    }*/
}
