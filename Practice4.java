public class Practice4 {
    public static void main(String[] args) {
        int a[] = {45,2,70,32,66,75};
        int max = a[0];
        int prev=0;
        for(int i=0;i<a.length;i++)
        {   
            if(a[i]>max){
                prev = max;
                max=a[i];

            }
            
            
        }
        System.out.println("2nd Maximum value: " + prev);
     
        }
       
    }


    