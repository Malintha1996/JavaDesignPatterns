/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Mediator;

/**
 *
 * @author Binod
 */
public class Main {
    public static void main(String[] args) {
        
        // Creating a mediator
        Mediator mediator = new ConcreteMediator();
        
        
        ConcreteUser user1 = new ConcreteUser(mediator, "a");
        ConcreteUser user2 = new ConcreteUser(mediator, "b");
        ConcreteUser user3 = new ConcreteUser(mediator, "c");
        ConcreteUser user4 = new ConcreteUser(mediator, "d");
        
        // Adding users to the list in mediator
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        
        // Sending the message to all users
        user3.send("I love programming");
    }
}
