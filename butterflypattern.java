public class butterflypattern {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            int s = 2*(4-i);
            for (int j=1;j<=i;j++){
                System.out.print("*");}
            for(int j=1;j<=s;j++){
                System.out.print(" ");}
            for(int j=1;j<=i;j++){
                System.out.print("*");}
            System.out.println();}
            for(int i=4;i>=1;i--){
                int s = 2*(4-i);
            for(int j=1;j<=i;j++){
                System.out.print("*");}
            for(int j =1; j<=s;j++){
                System.out.print(" ");}
            for(int j = 1; j<=i;j++){
                System.out.print("*");}
                System.out.println();}
            }
    }

