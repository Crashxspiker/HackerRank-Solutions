//Write your code here
HashSet temp =  new HashSet();
        int check = 1;
        temp.add(pair_left[0]+"_"+pair_right[0]);
        for (int i =0 ; i<t ;i++){
            int beforeSize = temp.size();
            temp.add(pair_left[i]+"_"+pair_right[i]);
            int afterSize = temp.size();
            if(beforeSize != afterSize){
                check++;
            }
            System.out.println(check);
        }