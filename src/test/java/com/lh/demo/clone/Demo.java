package com.lh.demo.clone;

/**
 * Created by LH 2446059046@qq.com on 2017/5/29.
 */
public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException{
        Email email = new Email();
        Email colneEmail = (Email)email.clone();

        System.out.println(email == colneEmail);
        System.out.println(email.getAttachment() == colneEmail.getAttachment());
    }
}
