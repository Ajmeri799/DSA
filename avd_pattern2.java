public class avd_pattern2 {
    public static void main(String[]args){
        int n=5;
        for(int i=1;i<=n;i++){
            for (int x=1;x<=n-i+1;x++){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
