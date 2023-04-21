import java.util.Arrays;

public class Main {
    public static void main(String[] ars) {
        Solution1 s = new Solution1();
        //입력요소를 선언해줘야 출력값이 나옴
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] answer = s.solution(5, arr1, arr2);
        System.out.println(Arrays.toString(answer));
    }
}
