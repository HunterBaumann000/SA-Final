package edu.wctc.creator.OutputData;

import edu.wctc.creator.Animal.Animal;
import edu.wctc.creator.tempOrganization.Barn;
import edu.wctc.creator.tempOrganization.Player;

public class MenuPrompts extends SystemOut{
    public void DisplayMainMenu() {
        out("Welcome to The Farmer Simulator");
        out("   -------------------------   ");
        out("1.) Go to Your Farm");
        out("2.) Purchase Items and Animals at Cooper's Farm");
        out("3.) End the Game (type 'end')");
    }

    public void DisplayMainFarmMenu() {
        out("Currently at: Your Farm");
        out("  -------------------  ");
        out("1.) Visit Your Animals");
        out("2.) View Current Items");
        out("3.) Move on to Tomorrow");
        out("4.) Return to the Main Menu (Press '.')");
    }

    public void DisplayPlayerAnimalsMenu(Barn barn) {
        out("Currently at: Your Animals");
        out("  ----------------------  ");
        if(barn.isHasCow())
            out("1.) Cows");
        if(barn.isHasSheep())
            out("2.) Sheep");
        if(barn.isHasHorse())
            out("3.) Horses");
        if(barn.isHasPig())
            out("4.) Pigs");

        out("5.) Return to the Farm Menu (Press '.')");
    }

    public void DisplayAnimalStatsMenu(Animal animal) {
        out("Currently at: Your Animals");
        out("  ----------------------  ");
        out("They're Hunger is Currently at: " + animal.getHungerAmount() + "% ");
        out("They're Hydration is Currently at: " + animal.getThirstAmount() + "% ");
        out("1.) Collect Resources (etc. Milk, Wool, Or Truffles) (Only Once per Day)");
        out("2.) Feed Animal");
        out("3.) Return to the Animal Menu (Press '.')");
    }

//    public void DisplaySheepMenu() {
//        out("Currently at: Your Animals");
//        out("  ----------------------  ");
//        out("They're Hunger is Currently at: " + 0 + "% ");
//        out("They're Hydration is Currently at: " + 0 + "% ");
//        out("1.) Shear (Only Once per Day)");
//        out("2.) Feed Animal");
//        out("3.) Return to the Animal Menu (Press '.')");
//    }
//
//    public void DisplayHorseMenu() {
//        out("Currently at: Your Animals");
//        out("  ----------------------  ");
//        out("They're Hunger is Currently at: " + 0 + "% ");
//        out("They're Hydration is Currently at: " + 0 + "% ");
//        out("1.) Feed Horse");
//        out("2.) Return to the Animal Menu (Press '.')");
//    }
//
//    public void DisplayPigMenu() {
//        out("Currently at: Your Animals");
//        out("  ----------------------  ");
//        out("They're Hunger is Currently at: " + 0 + "% ");
//        out("They're Hydration is Currently at: " + 0 + "% ");
//        out("1.) Feed Pig");
//        out("2.) Return to the Animal Menu (Press '.')");
//    }

    public void DisplayStoreMenu() {
        out("Currently at: Cooper's Store");
        out("   ----------------------  ");
        out("1.) Buy Food");
        out("2.) Buy Animals");
        out("3.) Buy Collectables");
        out("4.) Return to the Main Menu (Press '.')");
    }

    public void DisplayBuyAnimalMenu(Player player) {
        out("Currently at: Cooper's Store, Buying Animals");
        out("   --------------------------------------   ");
        out("Your Money: " + player.getMoney() + "$ ");
        out("1.) Cows - 500g");
        out("2.) Sheep - 250g");
        out("3.) Horses - 750g");
        out("4.) Pigs - 300g");
        out("5.) Return To Store Menu (Press '.')");
    }

    public void DisplayBuyFoodMenu(Player player) {
        out("Currently at: Cooper's Store, Buying Food");
        out("   --------------------------------------   ");
        out("Your Gold: " + player.getMoney() + "$ ");
        out("1.) 10 Food - 50g");
        out("2.) 50 Food - 200g");
        out("3.) 100 Food - 500g");
        out("4.) Return To Store Menu (Press '.')");
    }

    public void DisplayBuyCollectablesMenu(Player player) {
        out("Currently at: Cooper's Store, Buying Food");
        out("   --------------------------------------   ");
        out("Your Gold: " + player.getMoney() + "$ ");
        out("1.) Hmm, looks like they'll be in stock soon");
        out("2.) Return To Store Menu (Press '.')");
    }

    public void DisplayFeedMenu(Player player) {
        out("Currently: Feeding Your Animal");
        out("    ---------------------     ");
        out("How Much Would You Like to Feed Them?");
        out("You Currently Have:" + player.getAnimalFoodAmount() + " Food");
    }

    public void DisplayPlayerItemsMenu(Player player) {
        out("Currently: Viewing Items");
        out("    ---------------------     ");
        out("You Currently Have:" + player.getMoney() + " Money");
        out("You Currently Have:" + (player.getPlayerCollectables().size()) + " Item(s)");
        out("You Currently Have:" + player.getAnimalFoodAmount() + " Food");
    }

    public void moveToNextDay() {
        out("Next day..");
    }
}
