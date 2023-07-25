public class PascalsTriangle{
    public static void main(String[]args){
  for(int i=0;i<8;i++){
    for(int j=1;j<=8-i;j++){
    System.out.print(" ");
  }
  int number=1;
  for(int k=0;k<=i;k++){
  System.out.print(number+" ");
  number=number* (i-k)/(k+1);
  }
  System.out.println();
  }
}
}