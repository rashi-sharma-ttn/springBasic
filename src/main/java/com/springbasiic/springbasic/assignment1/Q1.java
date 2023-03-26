package com.springbasiic.springbasic.assignment1;

public class Q1 {
    public static void main(String args[])
    {
        Box b = new Box(5,5,5);
        System.out.println(b.volume);
    }
}
class Box
{
    public int volume;
    Box(int length, int width, int height)
    {
        this.volume = length * width * height;
    }
}

/*Tight coupling means the two classes often change together. In other words, if A knows
 more than it should about the way in which B was implemented, then A and B are
 tightly coupled.*/

/*In the above example, there is a strong inter-dependency between both
the classes. If there is any change in Box class then they reflects in the
result of Class Volume.*/