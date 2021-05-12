package edu.wctc.creator;

import edu.wctc.creator.Animal.Animal;
import edu.wctc.creator.Animal.Cow;
import edu.wctc.creator.OutputData.ASCII_Art;
import edu.wctc.creator.OutputData.SystemOut;
import edu.wctc.creator.tempOrganization.MenuLogicTest;
import edu.wctc.creator.tempOrganization.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        ASCII_Art art = new ASCII_Art();
        SystemOut system = new SystemOut();
        MenuLogicTest a = new MenuLogicTest();
        Player player = new Player(100,100);

        //Factory Pattern
        Animal playerCow = new Cow("Berry",10,97,100,false);

        playerCow.setHungerAmount(playerCow.getHungerAmount() - 10);

        //a.DisplayAnimalStatsMenu(playerCow);

        player.setMoney(100);
        system.out(" " + (player.getMoney() - 10) + " ");


//        system.out(art.barnASCII());
//        system.out(art.horseASCII());
//        system.out(art.cowASCII());
//        system.out(art.pigASCII());
//        system.out(art.shopASCII());

        //maybe have a buy simulator and add a person with a limit as to how much they can spend on each animal
        //or allow them to tend to animals once per day and let them die
        //use time classes to

        //singleton could be for only one player at a time.
    }
}
