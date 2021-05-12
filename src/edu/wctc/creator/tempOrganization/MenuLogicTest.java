package edu.wctc.creator.tempOrganization;

import edu.wctc.creator.OutputData.MenuPrompts;

import java.util.Scanner;

public class MenuLogicTest extends MenuPrompts {

    public void playGame(){
        //temp
        Barn barn = new Barn();

        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        do {

            DisplayMainMenu();
            choice = scan.nextLine();

            switch (choice){
                case "1":


                    choice = scan.nextLine();

                    switch (choice){
                        case "1":


                            choice = scan.nextLine();

                            switch (choice){
                                case "1":


                                    if ("1".equals(choice))
                                    {
                                        //DisplayAnimalStatsMenu();
                                    }
                                    else if ("2".equals(choice))
                                    {

                                    }
                                    else if (".".equals(choice))
                                    {

                                    }

                                case "2":

                                    if ("1".equals(choice))
                                    {

                                    }
                                    else if ("2".equals(choice))
                                    {

                                    }
                                    else if (".".equals(choice))
                                    {

                                    }

                                case "3":

                                    if ("1".equals(choice))
                                    {

                                    }
                                    else if ("2".equals(choice))
                                    {

                                    }
                                    else if (".".equals(choice))
                                    {

                                    }

                                case "4":

                                    if ("1".equals(choice))
                                    {

                                    }
                                    else if ("2".equals(choice))
                                    {

                                    }
                                    else if (".".equals(choice))
                                    {

                                    }

                                case ".":
                                    //blah
                            }

                            break;

                        case "2":
                            DisplayPlayerItemsMenu(Player.getInstance());

                            break;

                        case "3":
                            moveToNextDay();
                            //temp
                            break;

                        case ".":
                            //blah

                            break;
                    }

                    break;

                case "2":

                    DisplayStoreMenu();

                    switch (choice){

                        case "1":
                            DisplayBuyFoodMenu(Player.getInstance());

                            switch (choice){

                                case "1":
                                    //buyFoodOptionOne(Player.getInstance());


                                case "2":
                                    //buyFoodOptionTwo(Player.getInstance());


                                case "3":
                                    //buyFoodOptionTwo(Player.getInstance());


                                case ".":
                                    //blah
                            }

                        case "2":
                            DisplayBuyAnimalMenu(Player.getInstance());

                            switch (choice){

                                case "1":
                                    //buyCow(Player.getInstance());


                                case "2":
                                    //buySheep(Player.getInstance());


                                case "3":
                                    //buyHorse(Player.getInstance());


                                case "4":
                                    //buyPig(Player.getInstance());

                                case ".":
                                    //blah
                            }

                        case "3":
                            DisplayBuyCollectablesMenu(Player.getInstance());
                            switch (choice){

                                case "1":
                                    //blah

                                case ".":
                                    //blah
                            }

                        case ".":
                            //blah
                    }

                    break;

            }
        }while (choice != "end");
//
//        String mainMenuChoice = null;
//        String farmChoice = null;
//        String animalChoice = null;
//        String storeChoice = null;
//        Scanner scan = new Scanner(System.in);
//
//        do {
//            DisplayMainMenu();
//
//            mainMenuChoice = scan.nextLine();
//            switch (mainMenuChoice) {
//                case "1":
//                    DisplayMainFarmMenu();
//
//                    farmChoice = scan.nextLine();
//                    switch (farmChoice) {
//                        case "1":
//                            DisplayPlayerAnimalsMenu();
//
//                            animalChoice = scan.nextLine();
//                            switch (animalChoice) {
//                                case "1":
//                                    DisplayAnimalStatsMenu(animal);
//
//                                    storeChoice = scan.nextLine();
//                                    switch (storeChoice) {
//                                        case "1":
//                                            DisplayFeedMenu();
//                                        case "2":
//                                            DisplayPlayerAnimalsMenu();
//                                    }
//                                case "2":
//                                    //DisplaySheepMenu();
//
//                                    storeChoice = scan.nextLine();
//                                    switch (storeChoice) {
//                                        case "1":
//                                            DisplayFeedMenu();
//                                        case "2":
//                                            DisplayPlayerAnimalsMenu();
//
//                                    }
//                                case "3":
//                                    //DisplayHorseMenu();
//
//                                    storeChoice = scan.nextLine();
//                                    switch (storeChoice) {
//                                        case "1":
//                                            DisplayFeedMenu();
//                                        case "2":
//                                            DisplayPlayerAnimalsMenu();
//
//                                    }
//                                case "4":
//                                    //DisplayPigMenu();
//                                    storeChoice = scan.nextLine();
//                                    switch (storeChoice) {
//                                        case "1":
//                                            DisplayFeedMenu();
//                                        case "2":
//                                            DisplayPlayerAnimalsMenu();
//
//                                    }
//                                case "5":
//                                    DisplayMainFarmMenu();
//                            } // end of switch
//
//                        case "2":
//                            DisplayPlayerItemsMenu();
//                        case "3":
//                            //moveToTomorrow();
//                        case "4":
//                            DisplayMainMenu();
//                    } // end of switch
//
//                case "2":
//                    DisplayStoreMenu();
//
//                    storeChoice = scan.nextLine();
//                    switch (storeChoice) {
//                        case "1":
//                            DisplayBuyFoodMenu();
//                        case "2":
//                            DisplayBuyAnimalMenu();
//                        case "3":
//                            DisplayBuyCollectablesMenu();
//                        case "4":
//                            DisplayMainMenu();
//
//                    } // end of switch
//
//                case "3":
//                    break;
//            } // end of switch
//        }
//        while (!mainMenuChoice.equals("end")); // end of loop

//        do {
//            DisplayMainFarmMenu();
//
//            farmChoice = scan.nextLine();
//            switch (farmChoice) {
//                case "1":
//                    DisplayPlayerAnimalsMenu();
//                case "2":
//                    DisplayPlayerItemsMenu();
//                case "3":
//                    //moveToTomorrow();
//                case "4":
//                    DisplayMainMenu();
//            } // end of switch
//        }
//        while (!farmChoice.equals(".")); // end of loop

//        do {
//            DisplayPlayerAnimalsMenu();
//
//            animalChoice = scan.nextLine();
//            switch (animalChoice) {
//                case "1":
//                    DisplayCowMenu();
//                case "2":
//                    DisplaySheepMenu();
//                case "3":
//                    DisplayHorseMenu();
//                case "4":
//                    DisplayPigMenu();
//                case "5":
//                    DisplayMainFarmMenu();
//            } // end of switch
//        }
//        while (!animalChoice.equals(".")); // end of loop

//        do {
//            DisplayStoreMenu();
//
//            storeChoice = scan.nextLine();
//            switch (storeChoice) {
//                case "1":
//                    DisplayBuyFoodMenu();
//                case "2":
//                    DisplayBuyAnimalMenu();
//                case "3":
//                    DisplayBuyCollectablesMenu();
//                case "4":
//                    DisplayMainMenu();
//
//            } // end of switch
//        }
//        while (!storeChoice.equals(".")); // end of loop

//        do {
//            DisplayStoreMenu();
//
//            storeChoice = scan.nextLine();
//            switch (storeChoice) {
//                case "1":
//                    DisplayBuyFoodMenu();
//                case "2":
//                    DisplayBuyAnimalMenu();
//                case "3":
//                    DisplayBuyCollectablesMenu();
//                case "4":
//                    DisplayMainMenu();
//
//            } // end of switch
//        }
//        while (!storeChoice.equals(".")); // end of loop

//        do {
//            DisplayStoreMenu();
//
//            storeChoice = scan.nextLine();
//            switch (storeChoice) {
//                case "1":
//                    DisplayFeedMenu();
//                case "2":
//                    DisplayBuyAnimalMenu();
//
//            } // end of switch
//        }
//        while (!storeChoice.equals(".")); // end of loop
    }
}
