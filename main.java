class Solution {
    public static boolean isPalindrome(int x) {
        String number=""+x;
        boolean flag=true;
        int left=0;
        int right=number.length()-1;
        while(left<right){
            if(number.charAt(left)!=number.charAt(right)){
                flag=false;
                break;
            }
            left++;
            right--;
        }
        return flag;
    }
    public static void main(String[] args){
    int x=-121;
    boolean output=isPalindrome(x);}
}
