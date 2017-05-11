
public class FibannacciExample {

    public static void main(String args[]) {
    	
     int num1=0,num2=1;
     int n=10;
     int sum;
     System.out.print(num1 + " " +num2);
     
     for(int i=2; i<n; ++i){
   	  sum = num1 + num2;
   	  System.out.println(sum);
   	  num1 = num2;
   	  num2 = sum;
     }
      
    }
}
// 0,1,2,3,4,5,6,7,8,9,10
/*
   public  class FibannacciExample{  
    public static void main(String args[])  
    {    
     int n1=0,n2=1;
     int sum;
     int n = 10;    
     System.out.print(n1+" "+n2);//printing 0 and 1    
        
     for(int i=2;i<n;++i)//loop starts from 2 because 0 and 1 are already printed    
     {    
      sum=n1+n2;    
      System.out.print(" "+sum);    
      n1=n2;    
      n2=sum;    
     }    
      
    }}  */