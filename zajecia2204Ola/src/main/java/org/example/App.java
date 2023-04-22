package org.example;
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
        Set<Integer> thirdSet = new HashSet<>();
        thirdSet.addAll(firstSet);
        for (Integer number: thirdSet){

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










    }
}
