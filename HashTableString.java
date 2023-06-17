import java.util.Hashtable;

public class HashTableString {
    public static void main(String args[]) {

        // by increasing the capacity of the hashtable we can avoid collisions, but we
        // have to trade off memory for more efficient lookup

        Hashtable<String, String> table = new Hashtable<>(21);

        table.put("100", "Sandy");
        table.put("123", "Tom");
        table.put("321", "Dan");
        table.put("555", "Pat");
        table.put("777", "Cal");

        // different data types have different hash code formulas

        for (String key : table.keySet()) {
            System.out.println(key.hashCode() + "\t" + key + "\t" + table.get(key)); // print hash + key + value
        }
        ;

        for (String key : table.keySet()) {
            System.out.println(key.hashCode() + "\t" + key.hashCode() % 21 + "\t" + key + "\t" + table.get(key)); // print
                                                                                                                  // hash
                                                                                                                  // +
                                                                                                                  // index
                                                                                                                  // +
                                                                                                                  // key
                                                                                                                  // +
                                                                                                                  // value
        }
        ;
    }
}
