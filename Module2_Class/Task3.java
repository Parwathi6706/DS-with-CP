// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        //from task1 last step dynamic allocation
        int[]n= new int[20];
        int cz= 0;//current size we manually maintain for the dynamic feel
        System.out.println("capacity pf array"+n.length);
        
        System.out.println("after allocation all values are by default zero");
        for(int i=0;i<n.length;i++){
            System.out.println(i+"index value is "+n[0]);
        }
        n[0]=100;
        cz=cz+1;
        n[1]=200;
        cz=cz+1;
        n[2]=300;
        cz=cz+1;
        System.out.println("current  size is"+ cz);
        
        //step-1 or operation -1 is append just value
        
        //append the with 400
        int apVal = 400;
        
        if(cz==n.length) {
            System.out.println("array is full con't perform append");
        }
        else{
             n[cz]=apVal;
             cz++;
        }
        System.out.println("____________after append operation__________");
        
        System.out.println("Current size is"+cz);
        
        for(int i=0;i<n.length;i++){
            System.out.println(i+"index value is"+n[i]);
        }
        n[4]=500;
        cz=cz+1;
        
        n[5]=600;
        cz=cz+1;
        
        //step 2 POP Operation
        if(cz==0){
            System.out.println("array is empty con't perform pop");
        }else{
        
        n[cz-1]=0;
        cz--;
        }
         System.out.println("____________after pop operation__________");
        
        System.out.println("Current size is"+cz);
           for(int i=0;i<n.length;i++){
            System.out.println(i+"index value is"+n[i]);
        }
        // for insertion operation we need both index and value
        int insIdx=3;
        int insVal=1000;
        
        if(insIdx>=0 && insIdx<cz){
        
        for(int i= cz;i>insIdx;i--) {
            n[i]=n[i-1];
        }
        n[insIdx]=insVal;
        cz++;
        
    }
    else{
        System.out.println("invalid index");
        }
        
        System.out.println("current size is"+cz);
        
        for(int i = 0;i<n.length;i++){
            System.out.println(i+"index value is" + n[i]);
        }
        // step - 4 deletion operation
        
          
        int idxToDel =3;
        
        if ( idxToDel >=0 && idxToDel < cz){
        
        for(int i= idxToDel ; i< cz-1;i++){
            n[i]=n[i+1];
        }
        
        // manually change it last index to zero
        n[cz-1]=0;
        cz--;
        
        
        }
        
        System.out.println("___after Deletion oparation ___ ");
        
        
        System.out.println("current size is "+ cz);
        
        for(int i=0;i<n.length;i++){
            System.out.println(i+" index val is "+n[i]);
        }
        
        
        
        
}
}
