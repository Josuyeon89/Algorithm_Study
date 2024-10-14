import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;
        
        while(number>0){    //Math함수를 쓰면 홀수자리일때 불가능, num이 0일때까지 반복하면 자리수에 관계없이 두 자리씩 나눌 수 있음 
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
    }
}
