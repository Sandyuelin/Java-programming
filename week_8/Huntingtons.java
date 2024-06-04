public class Huntingtons {

    // Returns the maximum number of consecutive repeats of CAG in the DNA string.
    public static int maxRepeats(String dna){
        int maxRepeats = 0;
        int repeat = 0;
        for (int i = 0; i<dna.length()-3;i+=3) {
            String codon = dna.substring(i, i + 3);
            if (codon.equals("CAG")) {
                repeat++;
                if (repeat > maxRepeats) maxRepeats = repeat;
            }
            else repeat = 0;
        }
        return maxRepeats;
    }

    // Returns a copy of s, with all whitespace (spaces, tabs, and newlines) removed.
    public static String removeWhitespace(String s){
        String s2 = s.replace("\n" , "");
        String s3 = s2.replace("\t","");
        return s3;

    }


    // Returns one of these diagnoses corresponding to the maximum number of repeats:
    // "not human", "normal", "high risk", or "Huntington's".
    public static String diagnose(int maxRepeats){
        if (maxRepeats >=0 && maxRepeats <=9) return "not human";
        if (maxRepeats >=10 && maxRepeats <=35) return "normal";
        if (maxRepeats >=36 && maxRepeats <=39) return "high risk";
        if (maxRepeats >=40 && maxRepeats <=180) return "Huntington's";
        else return "not human";
    }

    // Sample client (see below).
    public static void main(String[] args){
        String dna = args[0];
        String newDNA = removeWhitespace(dna);
        int repeat = maxRepeats(newDNA);
        StdOut.println("max repeats = " + repeat);
        StdOut.println(diagnose(repeat));
    }

}