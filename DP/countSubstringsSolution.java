public class countSubstringsSolution {
    public int countSubstrings(String s) {
        int len=s.length();
        boolean[][] dp=new boolean[len][len];
        int result=0;
        for(int i=len-1;i>=0;i--){
            for(int j=i;j<len;j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(j-i<=1){
                        dp[i][j]=true;
                        result++;
                    }else if(dp[i+1][j-1]){
                        dp[i][j]=true;
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
