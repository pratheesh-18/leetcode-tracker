// Last updated: 7/8/2026, 3:38:50 PM
class Solution {
    static boolean isdivide(int num,int org){
        while(num!=0){
            int last=num%10;
            if(last==0 || org%last!=0) return false;
            num/=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> arr=new ArrayList();
        for(int i=left;i<=right;i++){
            if(isdivide(i,i)) arr.add(i);
        }
        return arr;
        
    }
}