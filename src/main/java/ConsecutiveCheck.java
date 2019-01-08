import java.util.Arrays;

public class ConsecutiveCheck {
    public Boolean consecutiveSeriesMethod(String numbers) {
        String[] number = numbers.split(",");
        int num[] = new int[number.length];
        int i=0;
        Boolean flag = true;
        for(String n: number){
            num[i++] = Integer.parseInt(n);
        }
        Arrays.sort(num);
        for (int j=0;j<number.length-1;j++) {
            if(!((num[j+1]-num[j]) == 1)) {
                flag = false;
            }
        }
        return flag;
    }
}