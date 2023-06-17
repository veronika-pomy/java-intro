import java.util.Hashtable;

public class HashTable {

    public static void main(String args[]) {

        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(100, "Sandy");
        table.put(123, "Tom");
        table.put(321, "Dan");
        table.put(555, "Pat");
        table.put(777, "Cal");

        System.out.println(table.get(100)); // prints Sandy

        for (Integer key : table.keySet()) {
            System.out.println(key + "\t" + table.get(key)); // prints all vals in table
        }
        ;

        // remove key method
        table.remove(123);

        for (Integer key : table.keySet()) {
            System.out.println(key + "\t" + table.get(key)); // prints all vals in table except Tom since now he is
                                                             // removed
        }
        ;

        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() + "\t" + key + "\t" + table.get(key)); // displays hashcode preceding key
                                                                                     // - primitive int value for int
                                                                                     // keys
        }
        ;

        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() + "\t" + key.hashCode() % 10 + "\t" + key + "\t" + table.get(key)); // displays
                                                                                                                  // hashcode
                                                                                                                  // and
                                                                                                                  // index
                                                                                                                  // before
                                                                                                                  // key
        }
        ;
    }
}
