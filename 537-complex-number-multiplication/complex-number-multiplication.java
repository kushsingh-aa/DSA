class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] p1=num1.split("\\+");
        String[] p2=num2.split("\\+");
        int a=Integer.parseInt(p1[0]);
        int c=Integer.parseInt(p2[0]);
        int b=Integer.parseInt(p1[1].replace("i",""));
        int d=Integer.parseInt(p2[1].replace("i",""));
        int real=(a*c)-(b*d);
        int img=(a*d)+(b*c);
        return real+"+"+img+"i";
    }
}