import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Disscussion {
/*Design one new project called Difference-Arrays-ArrayLists 
(in your IDE), design and add java codes in this project to 
demonstrate these differences. Add comments in your source code 
to demonstrate the differences between array and ArrayList.*/

//Pancake ingredients Array & Arraylist
public static void main(String[] args){
Scanner Disscussion = new Scanner(System.in);

//To start an Array use String[] followed with what you want to name your Array
//Each value on your array is tied to an index number, starting with 0
String[] ingredients = {"flour","baking-powder","sugar","milk","eggs","butter","baking-soda",
"vanilla-extract"};
//You can see how many values are in your Array with .length
System.out.println("There are this many ingredients: " + ingredients.length);
//You can select an index number from your Array to show the valued output
System.out.println("The ingredient you selected is: " + ingredients[2]);
//To change a value in your Array use
System.out.println("Before: "+ingredients[3]);
ingredients[3]= "water";
System.out.println("After: "+ingredients[3]);
//to add or remove a value throughout your project you must recreate the array or add/remove the value at teh start

System.out.println("");

//To begin an ArrayList you must first add the java.util.arraylist package, then add the class
ArrayList<String> pancakein = new ArrayList<String>();
//To add values to your ArrayList use .add
pancakein.add("flour");
pancakein.add("baking-powder");
pancakein.add("eggs");
pancakein.add("milk");
pancakein.add("butter");
pancakein.add("sugar");
pancakein.add("baking-soda");
pancakein.add("vanilla-extract");
System.out.println(pancakein);//Prints out entire ArrayList
System.out.println("");

//You can check the size of your arry with .size()
System.out.println("There are this many ingredients: " + pancakein.size());
System.out.println("");

//To retreave a value you can use .get in system.out.println and the index number
System.out.println(pancakein.get(3)); // will output milk
System.out.println("");

//To change a value use .set(x, "x");
pancakein.set(3, "water");
System.out.println("Value Changed: " + pancakein);//Prints out new ArrayList to show value change
System.out.println("");

//To remove a value from the list use .remove(x);
pancakein.remove(3);
System.out.println("Value Removed: " + pancakein);//Prints out new ArrayList showing removed Value
System.out.println("");

//Using a for loop you can write out all the values in your list in list format
for (int i = 0; i < pancakein.size(); i++) {
    System.out.println(pancakein.get(i));
}
System.out.println("");

//Using the java.util.collections we can sort our lists
Collections.sort(pancakein);
for (String i : pancakein) {//for loop will sort the list to alpabetical order, changing index numbers
    System.out.println(i);
  }
  System.out.println("");
  System.out.println(pancakein.get(3));
  System.out.println("");

//To clear the Array use .clear()
pancakein.clear();
System.out.println("List Cleared" + pancakein);//Prints out new ArrayList showing cleared list


Disscussion.close();
}
}
