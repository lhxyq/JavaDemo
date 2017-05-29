package com.lh.demo.clone;

/**
 * Created by LH 2446059046@qq.com on 2017/5/29.
 */
public class Email implements Cloneable{
    private Attachment attachment;

    public Email() {
        this.attachment = new Attachment();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
