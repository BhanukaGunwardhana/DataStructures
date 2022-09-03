package DataStructures;

public class Getinput {
    int []array={-10,25,50,60,-40,80,-22};
    public int maxfind(int [] array){
        int max=array[0];

        for(int i=0;i<array.length;i++){
            if(array[i]>=max){
                max=array[i];

            }

        }
        return max;


    }
    public int minfind(int []array){
        int min=array[0];

        for(int i=0;i<array.length;i++){
            if(array[i]<=min){
                min=array[i];

            }

        }
        return min;

    }

}
