import java.util.Scanner;

enum Command {ADD, LIST, SUM, MAX, MIN, QUIT, INVALID};

public class ArrayEnum {
    public static void main(String[] args) {
        int[] values = new int[100];
        int index=0;
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            final Command command = getCommand(scanner);
            if(command == Command.QUIT) {
                System.out.println("Bye!");
                break;
            }
            switch(command) {
                case ADD:
                    final int newValue = getValue(scanner);
                    values[index] = newValue;
                    index++;
                    break;
                case LIST:
                    printList(values, index);
                    break;
                case SUM:
                    System.out.println(getSum(values, index));
                    break;
                case MAX:
                    System.out.println(getMax(values, index));
                    break;
                case MIN:
                    System.out.println(getMin(values, index));
                    break;
                case INVALID:
                    System.out.println("Invalid Command");
                    break;
            }
        }
        scanner.close();
    }
    private static Command getCommand(Scanner s) {
        final String str = s.next();
        Command command;
        try {
            command = Command.valueOf(str.toUpperCase());
        }
        catch( IllegalArgumentException e) {command = Command.INVALID; }
        return command;
    }
    private static int getValue(Scanner s) {
        final int value = s.nextInt();
        return value;
    }
    private static void printList(int[] array, int index) {
        for(int i=0; i<index; ++i) {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }

    private static int getSum(int[] array,int index) {
        int sum=0;
        for(int i =0; i< index; i++) {
            sum+= array[i];
        }
        return sum;
    }
    private static int getMax(int[] array, int index) {
        int max=0;
        for(int i =0; i< index; i++) {
            if(array[i]>=max)
                max = array[i];
        }
        return max;
    }
    private static int getMin(int[] array, int index) {
        int min = 999;
        for(int i =0; i< index; i++) {
            if(min>=array[i])
                min = array[i];
        }
        return min;
    }
}