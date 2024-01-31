
class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class Q4 {
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgumentException("Number of arguments should be at least 4.");
            } else {
                int sum = 0;
                for (int i = 0; i < args.length; i++) {
                    int num = Integer.parseInt(args[i]);
                    sum += num * num;
                }
                System.out.println("The addition of squares of all the four elements is " + sum);
            }
        } catch (CheckArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
