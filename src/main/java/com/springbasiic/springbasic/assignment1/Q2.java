package com.springbasiic.springbasic.assignment1;

interface Topic
{
    void understand();
}
class Topic1 implements Topic {
    public void understand()
    {
        System.out.println("Got it");
    }
} class Topic2 implements Topic {
    public void understand()
    {
        System.out.println("understand");
    }
}
public class Q2 {
    public static void main(String[] args)
    {
        Topic t = new Topic1();
        t.understand();
    }
}

/*If you change your shirt, then you are not forced to change your body
 – when you can do that, then you have loose coupling. When you can’t do that,
 then you have tight coupling. */

/*If the only knowledge that class A has about class B, is what class B has
exposed through its interface, then class A and class B are said to be loosely coupled.*/