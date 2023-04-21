package org.example;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {String[] cities = new String[] { "London", "Warsaw", "Paris", "Madrid", "Budapest"};
        for ( String city : cities ) {
            System.out.println(city);
        }
        System.out.println("Cities listed backwards:");
        for (Integer i = cities.length - 1; i >= 0; i--){
            System.out.println(cities[i]);
        }
        System.out.println("Every second city is listed:");
        for (Integer a = 0; a < cities.length; a += 2){
            System.out.println(cities[a]);
        }

        Float[] numbers = new Float[5];
        numbers[0] = 4.5f;
        numbers[1] = 3.0f;
        numbers[2] = 1.0f;
        numbers[3] = 1.0f;
        numbers[4] = 2.0f;
        Float sum = 0f;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum" + ":" + sum + ".");
        Float average = 0f;
        average = sum/numbers.length;
        System.out.println("Average" + ":" + average + ".");

        String [] arrayOfNames = new String [] {"Jan", "Zosia", "Ela", "Jan", "Kasia", "Jan"};
        Integer count = 0;
        for (Integer i = 0; i < arrayOfNames.length; i++ ) {
            if (arrayOfNames[i].equals("Jan")) {
                count++;
            }
        }

        System.out.println("the name john occurs" + ":" + count + "times");

        String [] names = new String [] {"Anna", "Zosia", "Ela", "Jan", "Kasia", "Leon"};
        Set<String> name = new HashSet<>(Arrays.asList(names));
        Integer index = Arrays.asList(names).indexOf("Jan") + 1;
        System.out.println("Name index" + ":" + index);

        Integer[] numbersInt = { 4, 6, 8, 3, 9};
        Integer min = numbersInt [0];
        Integer max = numbersInt [0];
        for (Integer i =1; i < numbersInt .length; i++) {
            if (numbersInt [i] < min) {
                min = numbersInt [i];
            }
            if (numbersInt [i] > max) {
                max = numbersInt [i];
            }
        }
        System.out.println("maximum element" + ":" + max);
        System.out.println("minimum element" + ":" + min);
        System.out.println( "Hello World!" );
        System.out.println( "Hello Kasia!" );

    }
}
