/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanchez_3_interactivefiction;


import java.util.Scanner;

/**
 *
 * @author IgnacioS
 */
public class Sanchez_3_interactiveFiction {

    /**
     * @param args the command line arguments
     */
  static Scanner ignacio = new Scanner(System.in);
  static String answer;
  static boolean goodAnswer = false;
  static Boolean playAgain;
 
          public static void main(String[] args){
          
            start();
            beforeYouStart();
            theBeginning();
            theConfrontation();
            theEnd();
            theBarracudaOutbreakBegins();
            findingDory();
          
           
          
          }
            public static void start(){
                
                System.out.println("Would you Like to play Finding Nemo ?");
                answer =  ignacio.nextLine().toLowerCase();
                        if (answer.contains("y")){
                        System.out.println("Great, let's begin");
                        System.out.println("Before we begin this game is a Yes or No response game ");
                                }else if (answer.contains("n")){
                                System.out.println("Ok goodbye");
                                        }else{
                                        System.out.println("I don’t understand");
                
}
}
            public static void beforeYouStart(){
                System.out.println("You are a clownfish named Marlin");
                System.out.println("You live in the Great Barrier Reef");
                System.out.println("You sons name is Nemo");
                System.out.println("Would you like to remember what happened to Coral ?");
                answer =  ignacio.nextLine().toLowerCase();
                        if (answer.contains("y")){
                        System.out.println("Coral was your wife, she was stuck in a dilemma"
                        + " of saving her kids or herself in the confrontation of a "
                        + "barracuda. She decided to try and save her kids and died "
                        + "the barracuda left behind 1 egg. That egg was Nemo");
                        theBeginning();
                        answer =  ignacio.nextLine().toLowerCase();
                                }else if (answer.contains("n")){
                                System.out.println("It’s understandable due to what happened");
                                answer =  ignacio.nextLine().toLowerCase();
                                        }else{
                                        System.out.println("I don’t understand");
}
}
            public static void theBeginning(){
                System.out.println("Nemo is going to a school field trip to the edge of "
                + "the reef. Do you follow him?");
                answer =  ignacio.nextLine().toLowerCase();
                        if (answer.contains("y")){
                        System.out.println("You go swimming to the edge");
                        theConfrontation();
                        answer =  ignacio.nextLine().toLowerCase();
                                }else if (answer.contains("n")){
                                System.out.println("You stay home and talk to other fathers "
                                + "about the trip to the edge");
                                System.out.println("They tell you about a Barracuda Outbreak "
                                + "in our Neighbouring Civilization The Barnett Patch. "
                                + "You worry about Nemo");
                                theConfrontation();
                                answer =  ignacio.nextLine().toLowerCase();
                                        }else{
                                        System.out.println("This is a Yes or No based game. Try again");
}            
}

            public static void theConfrontation(){
                System.out.println("You see that he is swimming off the edge. In a distance "
                + "you can see a boat.you also see large fish near the boat that remind "
                + "you of Barracudas. Do you drag him to the edge and swim quickly home");
                answer =  ignacio.nextLine().toLowerCase();
                        if (answer.contains("y")){
                        System.out.println("lkjhgfdsasdfghjkl");
                        theBarracudaOutbreakBegins();
                        answer =  ignacio.nextLine().toLowerCase();
                                }else if (answer.contains("n")){
                                System.out.println("You tell Nemo not to swim back over there. You leave the "
                                + "edge");
                                System.out.println("When you leave you hear sirens wail, you turn around the "
                                + "large fish you saw were barracudas.They swam to Nemo and ate both "
                                + "of you");
                                theEnd();    
                                answer =  ignacio.nextLine().toLowerCase();
                                        }else{
                                        System.out.println("This is a Yes or No based game. Try again");
}
}
            public static void theEnd(){
                System.out.println("That was the wrong choice.Your actions have consequences, You are dead.");
                System.out.println("Do you want to try again ?");
                answer =  ignacio.nextLine().toLowerCase();
                        if (answer.contains("y")){
                        System.out.println("Welcome back");
                        beforeYouStart();
                        answer =  ignacio.nextLine().toLowerCase();
                                }else if (answer.contains("n")){
                                System.out.println("Thank You for playing my game");
                                answer =  ignacio.nextLine().toLowerCase();
                                        }else{
                                        System.out.println("This is a Yes or No based game. Try again");

}
}
            public static void theBarracudaOutbreakBegins(){
                System.out.println("You explained to Nemo that there is a Barracuda Outbreak not so far away.");
                System.out.println("You hear a fish screeching with pain and fish yelling for help. Do you swim"
                + " outside to help them?");
                answer =  ignacio.nextLine().toLowerCase();
                        if (answer.contains("y")){
                        System.out.println("The second you walked out of the anemone the Barracudas saw you and "
                        + "you saw them. The barracudas were feasting on your neighbouring fish friends "
                        + "and they eat you.");
                        theEnd();
                        answer =  ignacio.nextLine().toLowerCase();
                                }else if (answer.contains("n")){
                                System.out.println("You stay inside and the fish");
                                answer =  ignacio.nextLine().toLowerCase();
                                        }else{
                                        System.out.println("I don’t understand");
}    
}
            public static void findingDory(){
                
                     
}
}


            



               