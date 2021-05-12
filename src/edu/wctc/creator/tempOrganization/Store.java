package edu.wctc.creator.tempOrganization;
import edu.wctc.creator.Animal.Cow;
import edu.wctc.creator.Animal.Horse;
import edu.wctc.creator.Animal.Pig;
import edu.wctc.creator.Animal.Sheep;

import java.util.HashMap;
import java.util.Map;

public class Store {

    private Map<String, Integer> map = new HashMap<>();


    //createCollectables();
    public void createCollectables(){
        map.put("Plastic Trophy", 100);
        map.put("Iron Trophy", 500);
        map.put("Golden Trophy", 2000);
        map.put("Diamond Trophy", 5000);
        map.put("Good-luck Trophy", 1000000);
    }

    public void buyFoodOptionOne(Player player){
        player.setMoney(player.getMoney() - 50);
        player.setAnimalFoodAmount(player.getAnimalFoodAmount() + 10);
    }

    public void buyFoodOptionTwo(Player player){
        player.setMoney(player.getMoney() - 200);
        player.setAnimalFoodAmount(player.getAnimalFoodAmount() + 50);
    }

    public void buyFoodOptionThree(Player player){
        player.setMoney(player.getMoney() - 500);
        player.setAnimalFoodAmount(player.getAnimalFoodAmount() + 100);
    }

    public void buyHorse(Player player){
        player.animalList.add(2, new Horse("Horse", 100,100,100,false));
    }
    public void buyPig(Player player){
        player.animalList.add(3, new Pig("Pig", 100,100,100,false));
    }
    public void buyCow(Player player){
        player.animalList.add(0, new Cow("Cow", 100,100,100,false));
    }
    public void buySheep(Player player){
        player.animalList.add(1, new Sheep("Sheep", 100,100,100,false));
    }


}
