package Recursion;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,9,23};
        System.out.println(Find(arr,0,18));
    }
    static boolean Find(int[] arr,int index, int num){
        if(index == arr.length ){
            return false;
        }
        return arr[index] == num || Find(arr,index + 1, num);
    }
}
