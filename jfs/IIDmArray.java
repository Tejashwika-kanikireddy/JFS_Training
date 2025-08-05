//||DimArray.java
class IIDimArray{
    public static void Main(Stringargs[]){
        int[][] i=new int[2][3];
        int[0][0]=1; i[0][1]=2; i[0][2]=3;
        int[1][0]=4; i[1][1]=5; i[1][2]=6;
        intj[][]={
            {1,2,3},
            {4,5,6}
        };
        //accessing array using index
        int rowSize=i.length;
        for(int k=0;k<rowSize;k++){
            int colSize=i[k].length;//i[k] means accessing each row
            for(int l=0;l<colSize;l++){
                System.out.println(i[k][l]+" ")
            }
            System.out.println();
        }
        System.out.println();

            //accessing array using for-each loop
            for(int l[].j){
                for(int m:l){
                    System.out.println(m+" ");
                }
                System.out.println();
            }
        }     
    }
}