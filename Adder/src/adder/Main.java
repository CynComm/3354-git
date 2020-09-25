package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide three integers to add");
        }
    }

    private static int addArguments(String[] args) {
       boolean negative=false;
	   int index=0,sum=0;
       if(args[0].equals("-"))
       {
           negative=true;
           index=1;
       }
       for(int x=index;x<args.length;x++){
           if(negative==false)
               sum+=Integer.valueOf(args[x]) ;
           if(negative==true)
               sum-=Integer.valueOf(args[x]) ;

       }
       return sum;
    }
}
