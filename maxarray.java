public class maxarray {
    public static void main(String[] args) {
        int[] numbers = {5,1,2,4,3,6};
        int max = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("maximum element in array: "+max);
    }
}
