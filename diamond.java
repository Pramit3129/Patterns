public class diamond {
    public static void main(String[] args) {
        int n=8;
        int k =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");}
            for(int j=1;j<=k;j++){
                System.out.print("*");}
            k+=2;
            System.out.println();}
        k-=2;
    for (int i=(n);i>=1;i--){
    for(int j=1;j<=(n-i);j++){
        System.out.print(" ");}
    for(int j = 1; j<=k;j++){
        System.out.print("*");}
        k-=2;
        System.out.println();}
    }
    }



