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
            System.out.println(inter);
        }





//        thirdSet.addAll(secondSet);
//
//         for (Integer number: thirdSet){
//             System.out.println(number);
//         }





    }
}
