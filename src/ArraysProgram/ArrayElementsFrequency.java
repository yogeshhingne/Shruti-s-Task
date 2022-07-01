package ArraysProgram;

public class ArrayElementsFrequency {
    public static void main(String args[]) {
        int a[] = new int[]{1, 2, 0, 3, 2, 3, 9, 8, 4, 9};
        int temp, l = a.length;
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    a[j]=-1;
                }
            }
            if(a[i]!=-1)
                System.out.println(a[i]+"->"+count);
        }

    }
}
