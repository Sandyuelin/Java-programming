public class lrs {
    public static String lcp (String s, String t){
        int N = Math.min(s.length(), t.length());
        for (int i = 0;i < N ;i++) {
            if (s.charAt(i) != t.charAt(i)) return s.substring(0, i);
        }return s.substring(0, N);

    }
    public static String lrs(String s){
        int N = s.length();
        String[] suffixs = new String[N];
        for (int i = 0;i<N;i++) suffixs[i]= s.substring(i,N);

        Merge.sort(suffixs);
        String lrs = "";
        for (int i = 0;i<N-1;i++){
            String x = lcp(suffixs[i], suffixs[i+1]);
            if (x.length()>lrs.length()) lrs = x;

        }return lrs;
    }
}
