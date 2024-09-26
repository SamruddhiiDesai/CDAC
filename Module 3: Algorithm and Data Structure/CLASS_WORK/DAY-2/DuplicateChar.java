

class DuplicateChar{
  static String dupChar(String str,int i){
	  if(str.length()==0){
		  System.out.println("String Emplty");
		  return str;
		  
	  }
	  if(str.charAt(i)==str.charAt(i+1));
	   str.charAt(i);
	  dupChar( str,i+1);
  }
  public static void main(String[] args){
     String str="Samruddhi";
	  dupChar(str, 0);
	 
  }
}