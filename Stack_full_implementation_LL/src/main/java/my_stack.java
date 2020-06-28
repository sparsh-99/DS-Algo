/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author spars
 */
public class my_stack{
    public static void main(String[] args){
        // Creating object of Implementing class
        StackUsingLL obj = new StackUsingLL();

        // insert stack values
        obj.push(5);
        obj.push(12);
        obj.push(1);
        obj.push(20);
        obj.push(40);

        //display values
        obj.display();

        // peek values
        System.out.printf("\nTop element is %d\n", obj.peek()); 

        // Delete top elements
        obj.pop();
        obj.pop();

        obj.display();

        System.out.printf("\nTop element is %d\n", obj.peek()); 
    }
}
