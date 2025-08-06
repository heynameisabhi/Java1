public class Practice2 {
    public static void main(String[] args) {
        int input = 10,counter=2;
        int i,j;
        if(input==1)
        System.out.print("1,");
        if(input>=2){
        System.out.print("1,2,");}
        for(i=1;i<=input;i++){
            for(j=1;j<=i;j++){
                if(counter>=input)
                return;
                if(i>j){
                    System.out.print(i+",");
                    counter++;
                }
            }
        }
        
    }
    
}
