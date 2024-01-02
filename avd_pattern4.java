public class avd_pattern4 {
    public static void main(String[]args){
        int n=5;
        for(int i=1;i<=n;i++){
            for (int x=1;x<=2*(n-i);x++){
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){

                System.out.print("* ");

            }
            for (int j=2;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println("");
        }
        // second half
        for(int i=n;i>=1;i--){
            for (int x=1;x<=2*(n-i+1);x++){
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){

                System.out.print( "* ");

            }
            for (int j=2;j<=i;j++){
                System.out.print("* ");
            }
//
            System.out.println("");
        }
    }
}
