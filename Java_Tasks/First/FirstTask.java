package Java_Tasks.First;

public class FirstTask {
    static int sum(int n) {
        int temp=0;
        while(n!=0) {
            temp=temp+n;
            n--;
        }
            return(temp);
}
    public static void main(String[] args) {
        System.out.println(sum(4)); 
    }
}
