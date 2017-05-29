package com.lh.demo.clone;

import java.io.IOException;

/**
 * Created by LH 2446059046@qq.com on 2017/5/29.
 */
public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException{
        Email email = new Email();
//        Email cloneEmail = (Email)email.clone();//浅克隆
        Email cloneEmail = (Email)email.deepClone();//深克隆

        System.out.println(email == cloneEmail);
        System.out.println(email.getAttachment() == cloneEmail.getAttachment());
    }
}
