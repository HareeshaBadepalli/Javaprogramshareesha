
public class commonletters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1="ajay kumar";
       String s2="mohit Sharma";
       String s3="";
       char []arr1=s1.toCharArray();
       char []arr2=s2.toCharArray();
       for(int i=0;i<arr1.length;i++) {
    	   int c=0;
    	   for(int j=0;j<arr2.length;j++) {
    		   if(arr1[i]==arr2[j] && arr1[i]!=' ') {
    			   c++;
    			   break;
    		   }
    	   }
    	   if(c==1) {
    		  
    		   if(!s3.contains(arr1[i]+"")) {
    			   s3+=arr1[i];
    		   }
    	   }
       }
       System.out.println(s3);
       }

}
