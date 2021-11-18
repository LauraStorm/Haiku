package ui;

import haikuanalysis.HaikuPoem;

import java.util.Scanner;

public class Menu {
    private Scanner inputFromUser;

    public Menu (){
        this.inputFromUser = new Scanner(System.in);
    }

    public void welcomeUser (){
        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println("    Welcome to Haiku Application    ");
        System.out.println();
        System.out.println("-------------------------------------");
    }

    public int createHaikuOrQuit(){
        System.out.println("• Press 1 for create a haiku\n• Press 2 for exit");
        int userChoice = Integer.parseInt(inputFromUser.nextLine());
        return userChoice;
    }

    public String askForFirstLine(){
        System.out.println("First Line in your haiku poem!\nPlease write 5 syllables to the first line:");
        String firstLine = inputFromUser.nextLine();
        return firstLine;
    }

    public String askForSecondLine(){
        System.out.println("Second Line in your haiku poem!\nPlease write 7 syllables to the second line:");
        String secondLine = inputFromUser.nextLine();
        return secondLine;
    }

    public String askForThirdLine(){
        System.out.println("Third Line in your haiku poem!\nPlease write 5 syllables to the third line:");
        String thirdLine = inputFromUser.nextLine();
        return thirdLine;
    }

    public String askForAuthor (){
        System.out.println("Who is the author of the haiku poem?:");
        String author = inputFromUser.nextLine();
        return author;
    }

}

