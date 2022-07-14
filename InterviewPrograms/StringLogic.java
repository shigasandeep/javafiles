/*Find the nth index of a character in a given string. Without string operations.

For Eg:
nth : 2
character: e
Who is the expert in the domain of corelab automation industry. */

class StringLogic {
	
	public static void main(String arg[]) throws Exception {
       System.out.println(getNthIndex(2,'e'));
    }

  int getNthIndex(Integer n, char ch) {
  		String s="Who is the expert in the domain of corelab automation industry";
      int count=0;
      for (int i=0;i<s.length();i++) {
         char c=s.charAt(i);
         if (ch == c) {
           ++count;
           if (count==n) {
             return i;
           }
         }
      }
      return -1;
  }
	
  
}