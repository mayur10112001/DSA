package com.mayur;

import java.util.Scanner;

public class StackExample {
    int stack[],tos,MaxSize;
    void createStack(int size)
    {
        stack=new int[size];
        MaxSize=size;
        tos=-1;
    }
    void push(int e)
    {
       tos++;
       stack[tos]=e;
       // or stack[++tos]=e;
    }
    int pop()
    {
        int temp=stack[tos];
        tos--;
        return (temp);
    }
    int peek()
    {
        return stack[tos];
    }
    boolean is_full()
    {
        if(tos==MaxSize-1)
            return true;
        else
            return false;
    }
    boolean is_empty()
    {
        if(tos==-1)
            return true;
        else
            return false;
    }
    void print_stack()
    {
        for(int i=tos;i>=0;i--)
            System.out.println(stack[i]);
    }

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of stack : ");
        int size=in.nextInt();
        StackExample obj=new StackExample();
        obj.createStack(size);
        //now menu driven
        int ch;
        do
        {
            System.out.println("1. PUSH\n2. POP\n3. PEEK\n4. PRINT\n5. EXIT");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                if(!obj.is_full()){
                    System.out.println("enter a number");
                    int no=in.nextInt();
                    obj.push(no);
                    System.out.println("Pushed "+no);
                }
                else{
                    System.out.println("stack is full");
                }
                break;
                case 2:
                if(!obj.is_empty()){
                    int no= obj.pop();
                    System.out.println("Popped "+no);
                }
                else{
                    System.out.println("stack is empty");
                }
                break;
                case 3:
                if(!obj.is_empty()){
                    int no=obj.peek();
                    System.out.println("peek "+no);
                }
                else
                {
                    System.out.println("stack is empty");
                }
                break;
                case 4:
                if(!obj.is_empty()) {
                    System.out.println("elements on stack are");
                    obj.print_stack();
                }
                else{
                    System.out.println("stack is empty");
                }
                case0:
                System.out.println("Exiting..");
                break;
                default:
                    System.out.println("invalid choice");
                break;
            }
        }
        while(ch!=0);
        {

        }
    }


}
