public class Solution1 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        //10진수를 2진수로 변경
        //변경한 string을 한글자씩 arr1, arr2를 비교해서 하나라도 1인 경우 #으로 넣어줌
        String[] answer = new String[n];
        String format = "%" + n + "s";

        for(int i = 0; i < n; i++){
            String arr1To2 = String.format(format, Integer.toBinaryString(arr1[i])).replace(' ', '0');
            String arr2To2 = String.format(format, Integer.toBinaryString(arr2[i])).replace(' ', '0');
            answer[i] = "";
            for(int j = 0; j < n; j++){
                if(arr1To2.charAt(j) == '1' || arr2To2.charAt(j) == '1'){
                    answer[i] += "#";
                }else{
                    answer[i] += " ";
                }
            }
        }
        return answer;
    }
}
