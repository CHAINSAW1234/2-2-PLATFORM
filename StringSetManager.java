import java.util.Arrays;
import java.util.Scanner;
enum StringCommand {ADD, REMOVE, CLEAN, QUIT, INVALID};

public class StringSetManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        String[] stringSet = new String[100];
        while (true) {
            final StringCommand command = getCommand(scanner);
            if (command == StringCommand.QUIT) {
                System.out.println("BYE!");
                break;
            }
            switch (command) {
                case ADD: {
                    final String str = getString(scanner);
                    add(stringSet, str);
                    break;
                }
                case REMOVE: {
                    final String str = getString(scanner);
                    remove(stringSet, str);
                    break;
                }
                case CLEAN: {
                    clear(stringSet);
                    break;
                }
                default:
                    System.out.println("Unknown Command!");
                    break;
            }
            print(stringSet);
        }
    }
    private static StringCommand getCommand(Scanner s) {
        final String str = s.next();
        StringCommand command;
        try {
            command = StringCommand.valueOf(str.toUpperCase());
        } catch( IllegalArgumentException e) {command = StringCommand.INVALID; }
        return command;
    }
    private static String getString(Scanner scanner) {
        final String str = scanner.next();
        return str;
    }
    private static int len(String[] Stringset) {
        int i;
        for(i = 0; Stringset[i] != null; ++i)
            ;
        return i;
    }
    private static boolean find(String[] Stringset, String str) {
        for(int i=0;i<len(Stringset);i++) {
            if(Stringset[i] !=null)
                if(Stringset[i].equals(str))
                    return true;
        }
        return false;
    }
    private static void add(String[] Stringset, String str) {
        if(find(Stringset,str) != true)
            Stringset[len(Stringset)] = str;
    }
    private static void remove(String[] Stringset, String str) {
        int i=0;
        while(!(find(Stringset, str))) {
            i++;
            if(i>len(Stringset))
                return ;
        }
        for(;Stringset[i]!=null && i!=100; ++i) {
            Stringset[i] = Stringset[i+1];
        }
        if(i==100)
            Stringset[i] = null;
    }
    private static void clear(String[] StringSet) {
        int i=0;
        while(StringSet[i]!=null && i!=100)
            StringSet[i++]=null;
    }
    private static void print(String[] Stringset) {
        System.out.print("Element Size: " + len(Stringset) + ", Values = [");
        for( int i=0;i<len(Stringset);++i) {
            System.out.print(Stringset[i]);
            if(i!=len(Stringset)-1)
                System.out.print(", ");
            }
        System.out.println("]");
    }
}

