for(int i=0; i < n; i++)
    {
        for(int j=1; j <(n-i); j++)
        {

int greater = new BigDecimal(s[j-1]).compareTo(new BigDecimal(s[j]));

            if(greater == -1){
                String temp = s[j-1];
                s[j-1] = s[j];
                s[j] = temp;

            }
        }
    }