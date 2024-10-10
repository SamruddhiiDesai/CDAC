

class Que4ReverseString{
   static String revString(String str){
     if(str.length()<=0){
	 return "";
	 }
	 else{
	 StringBuilder sb=new StringBuilder();
	 sb.append(str);
	  sb.reverse();
	  return sb.toString();
	 }
   }
  public static void main(String[] args){
   String s="Hello Woorld";
   System.out.print(revString(s));
  }
}
