package leecode.math;

public class SubtractProductAndSum {
    public int subtractProductAndSum(int n) {

        String num = String.valueOf(n);
        int product=1;
        int sum=0;
        for(int i=0;i<num.length();i++) {
            product = product * (num.charAt(i) - '0');
            sum+= (num.charAt(i) - '0');
        }
        return product-sum;
    }
}
