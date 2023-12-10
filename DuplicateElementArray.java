import java.util.HashSet;

public class DuplicateElementArray {
    
    public static void main(String[] args)
    {
        String array[]={"vellai","samy","karthick"};  //int array[]={1,2,3,4,5,1};
        boolean status=false;
        //Normal Method
        /*
          for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]==array[j])
                {

                    System.out.println("The Duplicate Element is "+array[i]);
                    status=true;
                }
               
            }
        }
        if(status==false)
        {
            System.out.println("No Duplicate Element in array");
        }
         */   
        //HASHSET RETURNS FALSE IF ANY DUPLICATE FOUND
        HashSet <String>input=new HashSet<>();
       for(String value:array)
       {
        if(input.add(value)==false)
        {
            status=true;
            System.out.println("The Duplicate Element is "+value);
        }
        
       }
       if(status==false)
        {
            System.out.println("No Duplicate Element in array");
        }
    }
}
//Hashset
//System.out.println(langs.add("Java"));  true
//System.out.println(langs.add("Java")); false
//System.out.println(langs.add("c")); true