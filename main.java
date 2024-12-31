public class Main {
  
  public static void Printfibonacci(int n){
    int a=0;
    int b=1;
    int c;
    for(int i=0;i<n;i++){
      System.out.println(a);
      c=a+b;
      a=b;
      b=c;
    }
  }
  
  public static void main(String[] args) {
    System.out.println("Hello, World!");
    System.out.println("Learning");
    Printfibonacci(n);
  }
}

