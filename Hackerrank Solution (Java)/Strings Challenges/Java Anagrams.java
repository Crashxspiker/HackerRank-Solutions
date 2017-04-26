 static boolean isAnagram(String a, String b) {
        
        // Complete the function by writing your code here.
        a=a.toLowerCase();
        b=b.toLowerCase();
        int []array = new int[128];
        
        for(char c: a.toCharArray() ){
             array[(int)(c)]++;
        }
        for(char c: b.toCharArray() ){
            array[(int)(c)]--;
        }
        for(int i: array)
            if (i!=0) return false;
            
        
         return true;
        
    }