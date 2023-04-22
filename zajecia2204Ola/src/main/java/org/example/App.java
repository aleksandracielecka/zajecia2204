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
            System.out.println("Interjestion: "+ inter);
        }





        thirdSet.addAll(secondSet);

         for (Integer number: thirdSet){
             System.out.println(number);
         }

       // suma

        System.out.println("Suma:");

        Set<Integer> sumWithCommonPart = new HashSet<>();
        sumWithCommonPart.addAll(firstSet);
        sumWithCommonPart.addAll(secondSet);


        for (Integer number : sumWithCommonPart){
            System.out.println(number);
        }


        // suma bez czesci wspolnej to Suma - czesc wspolna
        //sumWithCommonPart - interjection 0,4,6,8,9
        //sumWithCommonPar 0,1,4,6,8,9,12
        //interjection 1, 12


//        Set<Integer> sumWithoutCommonPart = new HashSet<>();
//
//        for( Integer num: sumWithCommonPart){
//            for(Integer num2: interjection){
//                if(num !=num2){
//                    sumWithoutCommonPart.add(num2);
//
//                   // sumWithoutCommonPart.add(num);
//                }
//            }
//        }
//        for(Integer el: sumWithoutCommonPart){
//            System.out.println("to jest set bez czesci wspolnej: " + el);
//        }






        // difference between set first and second - 4,6,8

        Set<Integer> difference = new HashSet<>(firstSet);
        difference.removeAll(secondSet);

        for(Integer num : difference){
            System.out.println(num);
        }










    }
}
