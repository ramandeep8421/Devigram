
const int MOD = 599


int hash(String s){

       int key = 0;
       
       for(int i = 0;i < s.length(); i++){
             int c = (int)s.charAt(i);
             key = (key + c * i)%MOD;
       }

       return key;
}

/**__
 * 
 *    key  = 3
 *   
 *    3 : ["abc","bac"]
 *    
 *    4 : ["bde","",]
 * 
 * 
 * 
 * 
 * 
 * ___***/


bool search(ArrayList<ArrayList>String>>&lookUpTable, String str){


}


ArrayList<ArrayList<String>> createLookUpTable(ArrayList<String>arr){
        int n = arr.size();
          
        //create a lookup table 
        ArrayList<ArrayList<String>>lookUpTable = new ArrayList();


        for(int i=0;i<=MOD;i++){
              lookUpTable.add(new ArrayList<>());
        }
        /***
         *  0 : {}
         *  1 : {}
         *  2 : {}
         *  3 : {"abc","bac"}
         *  4
         *  5
         * 
         * 
         * 
         * **/


        for(int i=0;i<n;i++){

                 String str = arr[i];
                 int key = hash(str);
                 lookUpTable[key].add(str);

        }

        // look up table is ready !!!!
}


// Exercise :

//1. Implement the search function 
// 2. Find the time and space complexity for the above code
