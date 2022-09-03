package DataStructures;

public class Getinput {
    int []array={-10,25,50,60,-40,80,-22};
    public void maxfind(int [] array){
        int max=array[0];
        int min=array[0];

        for(int i=0;i<array.length;i++){
            if(array[i]>=max){
                max=array[i];

            }
            if(array[i]<=min){
                min=array[i];

        }

        }

        System.out.println("Max :"+max);
        System.out.println("Min :"+min);


    }

}
