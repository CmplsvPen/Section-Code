public class Fall2015Prob4 {
    public static void main(String[] args){
        int size = 3;
        int numrow = size * size;
        for(int i = 1; i<= numrow; i++){
            for( int j = 0; j < numrow - i; j ++ ){
                System.out.print(".");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
