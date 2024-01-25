import java.util.ArrayList;
import java.util.List;

public class p_2788 {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("one.two.three");
        test.add("four.five");
        test.add("six");
        printList(splitWordsBySeparator(test, '.'));

        test = new ArrayList<>();
        test.add("$easy$");
        test.add("$problem$");
        printList(splitWordsBySeparator(test, '$'));

        test = new ArrayList<>();
        test.add("|||");
        printList(splitWordsBySeparator(test, '|'));
    }

    public static void printList(List<String> arr) {
        if(arr.size() <= 0) { return; }
        for(int i = 0; i < arr.size() - 1; i++) {
            System.out.print(arr.get(i) + ", ");
        }
        System.out.println(arr.get(arr.size() - 1));
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < words.size(); i++) {
            String[] wordSplit = words.get(i).split("\\" + separator);
            for(int j = 0; j < wordSplit.length; j++) {
                if(wordSplit[j].length() > 0) {
                    result.add(wordSplit[j]);
                }
            }
        }
        return result;
    }
}