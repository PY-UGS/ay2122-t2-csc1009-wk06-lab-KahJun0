import java.util.*;

public class LinkedListImplementation {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11)); //Preinit our linkedlist
        LinkedList<Integer> newll = new LinkedList<Integer>();
        Random rand = new Random();
        int randToFind = rand.nextInt(8999) + 1000; //Sets a random int to find
        System.out.println(ll);
        addAndSort(ll, 4);
        System.out.println(ll);
        swapElements(ll,3,5);
        System.out.println(ll);
        System.out.println("\n-----New linked list operation starts here-----\n");
        System.out.println(newll);
        for(int i=0;i<500;i++){
            int nextRand = rand.nextInt(8999) + 1000;
            newll.add(nextRand);
        }
        System.out.println(newll);
        System.out.format("Integer to find is: %d\n", randToFind);
        System.out.format("Index of the integer is: %d\n", findValue(newll, randToFind));
    }

    public static void addAndSort(LinkedList<Integer> list, int value){
        list.add(value);
        Collections.sort(list);
    }

    public static void swapElements(LinkedList<Integer> list, int indexOne, int indexTwo){
        if(indexOne > list.size() || indexTwo > list.size()){
            System.out.println("Index out of bounds");
        }
        else{
            Collections.swap(list, indexOne, indexTwo);
        }
    }

    public static int findValue(LinkedList<Integer> list, int searchVal){
        return list.indexOf(searchVal);
    }
}
