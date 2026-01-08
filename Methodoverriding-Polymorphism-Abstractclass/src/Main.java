import animals.Animal;
import animals.Cat;
import animals.Dog;
import bank.Account;

import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

//    public static void printToString(int[] arr){
//        System.out.println("[%d , %d]".formatted(arr[0], arr[1] ));
//    }
//    public static int[] twoSum(int[] nums, int target) {
//
//        int[] responsIndex = new int[2];
//        boolean isbreak = false;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                int sum = nums[i] + nums[j];
//                if(sum == target){
//                    responsIndex[0] = i;
//                    responsIndex[1] = j;
//                    isbreak = true;
//                    break;
//                }
//            }
//            if(isbreak){
//               break;
//            }
//        }
//        return responsIndex;
//    }
//
//    public static String longestCommonPrefix(String[] strs) {
//
//        String commonAlphabet = "";
//        String moreLongestCommonAlphabet = "";
//        String checkWord = "";
//        boolean isCheckCommonWord = false;
//
//        if(strs.length == 0){
//            moreLongestCommonAlphabet = "";
//        }else if(strs.length == 1){
//            moreLongestCommonAlphabet = strs[0];
//        }else{
//            String firstItem = strs[0];
//            for (int i = 0; i < firstItem.length(); i++) {
//
//                    checkWord += firstItem.charAt(i);
//                    commonAlphabet = checkWord;
//
//                    for(int k = 0; k < strs.length; k++){
//
//                        if(!(strs[k].toLowerCase().trim().startsWith(checkWord.toLowerCase().trim()))){
//                            commonAlphabet = "";
//                            checkWord = "";
//                            isCheckCommonWord = false;
//                            break;
//                        }else{
//                            isCheckCommonWord = true;
//                        }
//
//                        if(!isCheckCommonWord){
//                            break;
//                        }
//                    }
//                    if(moreLongestCommonAlphabet.length() < commonAlphabet.length() && isCheckCommonWord){
//                        moreLongestCommonAlphabet = commonAlphabet;
//                    }
//
//                    if(!isCheckCommonWord){
//                        break;
//                    }
//                }
//
//        }
//        return moreLongestCommonAlphabet.toLowerCase();
//    }
//
//    public static int removeDuplicates(int[] nums) {
//
//        Set<Integer> set = new HashSet<>();
//
//        int arrMaxLength = 3 * 10000;
//        if(nums.length > arrMaxLength){
//            return -1;
//        }else if(nums.length < 1){
//            return -1;
//        }else if(nums.length == 1){
//            return 1;
//        }else{
//            for(int i = 0; i < nums.length; i++){
//                set.add(nums[i]);
//            }
//        }
//       // int[] numbers = new int[set.size()];
//        Object[] arr = set.toArray();
//
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i] + " ");
//        }
//        return arr.length;
//    }


    public static void main(String[] args) {


      //  Account account = new Account(1000);
//        account.displayBalance();
//        account.deposit(100);
//        account.displayBalance();
//        account.withdraw(300.83f);
//        account.displayBalance();
//        Animal cat = new Cat();
//        System.out.println(cat.getAge());
//
//        Cat cat2 = new Cat();
//        System.out.println(cat2.getAge());

//        Cat.sayMyName();
//        Animal.sayMyName();

//
//        int target = 9;
//        int[] numbers = new int[3];
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        int element = input.nextInt();
//        numbers[0] = element;
//        System.out.print("Enter second number: ");
//        element = input.nextInt();
//        numbers[1] = element;
//        System.out.print("Enter third number: ");
//        element = input.nextInt();
//        numbers[2] = element;
//
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i; j < numbers.length; j++) {
//                int sum = numbers[i] + numbers[j];
//                if(sum == target){
//                    System.out.println("[%d %d]".formatted(numbers[i], numbers[j]));
//                }
//            }
//        }


//        System.out.println("Enter infos");
//        Scanner input = new Scanner(System.in);
//        String text = input.nextLine();



//        Cat.age = 1;
//        Animal.age = 2;
//        Dog.age = 3;
//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        Animal animal = new Animal();
//        System.out.println(cat.age); // 1
//        System.out.println(dog.age); // 3
//        System.out.println(animal.age);//2
//    Cat cat = new Cat("Bunny", 2);
//    cat.makeSound();

//        Animal dog = new Dog("Rotfeller",4);
//        dog.makeSound();

//        int[] numbers = new int[3];
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter target value: ");
//        int target = input.nextInt();
//        System.out.print("Enter first number: ");
//        int element = input.nextInt();
//        numbers[0] = element;
//        System.out.print("Enter second number: ");
//        element = input.nextInt();
//        numbers[1] = element;
//        System.out.print("Enter third number: ");
//        element = input.nextInt();
//        numbers[2] = element;
//        int[] numbers = {3,3,3};
//        int target = 6;
//        var resultArr = twoSum(numbers,target);
//        printToString(resultArr);

        //String[] strings = {"reflower","flow","flight"};
        //String[] strings = {"", "b"};
        //System.out.println(longestCommonPrefix(strings));

//         int[] nums = {0,0,1,1,1,2,2,3,3,4};
//          System.out.println(removeDuplicates(nums));
    }


}