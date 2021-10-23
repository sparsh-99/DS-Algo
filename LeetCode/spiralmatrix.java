public class PrintMatrixInSpiralForm {
   public static void main(String args[]){
      int a[][]={{1,2,3},{4,5,6},{7,8,9}};
      int w = 0;
      int x = a.length-1;
      int y = 0;
      int z = a[0].length-1;
      while(w <= x && y <= z){
         for (int i = w; i <= z; i++) {
            System.out.print(a[w][i] + " ");
         }
         for (int i = w+1; i <= x; i++) {
            System.out.print(a[i][z] + " ");
         }
         if(w+1 <= x){
            for (int i = z-1; i >= y; i--) {
               System.out.print(a[x][i] + " ");
            }
         }
         if(y+1 <= z){
            for (int i = x-1; i > w; i--) {
               System.out.print(a[i][y] + " ");
            }
         }
         w++;
         x--;
         y++;
         z--;
      }
   }
}
