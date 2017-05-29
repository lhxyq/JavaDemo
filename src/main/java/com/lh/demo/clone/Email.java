package com.lh.demo.clone;

import java.io.*;

/**
 * Created by LH 2446059046@qq.com on 2017/5/29.
 */
public class Email implements Cloneable, Serializable {
    private Attachment attachment;

    public Email() {
        this.attachment = new Attachment();
    }

    /**
     * 浅克隆
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * 深克隆
     *
     * @return
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        //序列化对象

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(this);


        //反序列化
        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        return objectInputStream.readObject();
    }

    public void display() {
        System.out.println("查看邮件");
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }
}
