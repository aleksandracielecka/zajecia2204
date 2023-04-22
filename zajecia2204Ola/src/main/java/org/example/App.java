package org.example;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Interjection");
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();

        firstSet.add (1);
        firstSet.add (4);
        firstSet.add (6);
        firstSet.add (8);
        firstSet.add (12);

        secondSet.add (1);
        secondSet.add (12);
        secondSet.add (9);
        secondSet.add (0);


        Set<Integer> interjection = new HashSet<>();

        for (Integer number: firstSet){

             for(Integer number2: secondSet){
                 if (number == number2){
                     interjection.add(number2);

                 }
             }
         }
        for (Integer inter: interjection){
            System.out.println("Interjection: "+ inter);
        }



       // suma

        System.out.println("Union:");

        Set<Integer> sumWithCommonPart = new HashSet<>();
        sumWithCommonPart.addAll(firstSet);
        sumWithCommonPart.addAll(secondSet);


        for (Integer number : sumWithCommonPart){
            System.out.println(number);
        }

        System.out.println("Union without common part:");

        Set<Integer> sumWithoutCommonPart = new HashSet<>(sumWithCommonPart);
        sumWithoutCommonPart.removeAll(interjection);


          for(Integer el: sumWithoutCommonPart){
            System.out.println("to jest set bez czesci wspolnej: " + el);
        }



        System.out.println("Difference between first and second set:");

        Set<Integer> difference = new HashSet<>(firstSet);
        difference.removeAll(secondSet);

        for(Integer num : difference){
            System.out.println(num);
        }

  //zadanie 3

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> shoppingList1 = new HashMap<>();
        HashMap<String, Integer> shoppingList2 = new HashMap<>();

        shoppingList1.put("Eggs",3);
        shoppingList1.put("Milk",1);
        shoppingList1.put("Cookies",4);

        shoppingList2.put("Ham",4);
        shoppingList2.put("Milk",11);
        shoppingList2.put("Cheese",1);
        shoppingList2.put("Cookies",4);

        HashMap<String, Integer> shoppingListCommon = new HashMap<>();

        for (Map.Entry <String,Integer> entry: shoppingList1.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();


        }

        System.out.println("wersja 1");
        for (Map.Entry <String,Integer> entry: shoppingListCommon.entrySet()) {

            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        for (Map.Entry <String,Integer> entry: shoppingList2.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            Integer value2 = entry.getValue();

            if (shoppingListCommon.containsKey(key)==false){
                shoppingListCommon.put(key,value);
            } else if (shoppingListCommon.containsKey(key)==true) {

                System.out.println("Value 1 :" +value);
                System.out.println("Value 2 :" +value2);
                shoppingListCommon.put(key,value+value2);

            }
        }
        System.out.println("Common shopping List:");
       // for (Map.Entry <String,Integer> entry: shoppingListCommon.entrySet()) {
            for (String key : shoppingListCommon.keySet()) {
                int quantity = shoppingListCommon.get(key);
                System.out.println(key + ": " + quantity);
             //   System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
        //komentarz










    }

