public class IDimArray{
    public static void main(String args[]){
       int i[]=new int[5];
       i[0]=1; i[1]=2;i[2]=3;i[3]=4;i[4]=5;
//dynamic array declaration and intialization
       int[] j = {1,2,3,4,5};
//accessing values from array
//using length and index
       int len1=i.length;
       for(int k=0; k<=len1;k++){
         System.out.println(i[k]+"");
       }
       System.out.println();
       
       //USING FOR EACH LOOP
       for(int k:j){
        System.out.print(k+"");
      }
    System.out.println();
}

       
