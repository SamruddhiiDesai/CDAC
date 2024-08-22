class Demo{
      public static void main(String args[]){
             /*  //BYTE
                 //byte range -128 to 127
                   byte b=100; //implicite type casting by java 
                // byte b=128; //error incompatable types
               byte b=(byte)128;  // for resolve imcomtable error explicite type casting we have to do this output -128
              System.out.println(b);
           */
        
            /*  //INTEGER
                int a=10;
                byte b2=a;    //Error incompatible type int 32bit and byte 8bit
                System.out.println(b2); 
            */

            // Char 
              char c='A';
              //System.out.println(c); //op=A
              //System.out.println((int)c); //type casting for ASCII value op= 65
              System.out.println((char)66); //op= B 
              // System.out.println((char)500); //op-?
              //System.out.println((float)c); //op=65.0
              //System.out.println((float)66);  //op=66.0
              
            
}
}