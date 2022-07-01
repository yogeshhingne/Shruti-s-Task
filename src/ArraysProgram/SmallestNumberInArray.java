package ArraysProgram;

public class SmallestNumberInArray {
    public static void main(String[] args) {
        int [] arr = new int[]{10, 12, 7, 14, 13};
        int temp=arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                }
            }
        }
        System.out.println(temp);
    }
}
