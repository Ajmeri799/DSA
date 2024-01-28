import java.util.Scanner;

public class thanoi {

     static void tower(int n ,char sat,char aux ,char end){
        if(n==1){
            System.out.println(sat+"-->"+end);
//            System.out.println(+sat+"-->"+end);
        }
        else {
            tower(n-1,sat,end,aux);
            tower(1,sat,aux,end);
            tower(n-1,aux,sat,end);
        }
    }

public static void main(String args[]){
        int n;
    System.out.println("enter the num of n");
      Scanner sc=new Scanner(System.in);
      n= sc.nextInt();
       tower(n,'A','B','C');

}

}
