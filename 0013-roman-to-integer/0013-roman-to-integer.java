class Solution {
    public int romanToInt(String s) {
        List<Character> l = new ArrayList<>();
        l.add('I');
        l.add('V');
        l.add('X');
        l.add('L');
        l.add('C');
        l.add('D');
        l.add('M');
        int v[]={1,5,10,50,100,500,1000};
        int sum=0;
        int i;
        for(i = 0; i<s.length()-1;i++){
            int j = l.indexOf(s.charAt(i));
            int k = l.indexOf(s.charAt(i+1));
            int a = v[j];
            int b = v[k];
            if(a>b){
                sum = sum + a;
            }
            if (a<b){
                int c = b-a;
                sum = sum + c;
                ++i;
            }
            if(a==b){
                sum = sum + a;
            }
        }
        if(i != s.length()){
            int j = l.indexOf(s.charAt(i));
            sum = sum + v[j];
        }
        return sum;
    }
}