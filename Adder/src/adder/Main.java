package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
			if (args.length==0)
				throw new ArrayIndexOutOfBoundsException
            System.out.println(result);
        }
		catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Please provide three integers to add");
        }
		catch (NumberFormatException n) {
            System.err.println("Arguments are not proper format");
        }
    }

    private static int addArguments(String[] args) {
        return Integer.valueOf(args[0]) + Integer.valueOf(args[1])+ Integer.valueOf(args[2]);
    }
}
