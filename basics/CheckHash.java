import java.util.ArrayList;
import java.util.LinkedList;

class MyHash {
    int BUCKET;
    ArrayList<LinkedList<Integer>> table;
    MyHash(int b){
        BUCKET = b;
        table = new ArrayList<LinkedList<Integer>>();
        for(int i = 0 ; i < b ; i++) {
            table.add(new LinkedList<Integer>());
        }
    }
    public void insert(int key){
        int i = key % BUCKET;
        table.get(i).add(key);
    }
    public void remove(int key){
        int i = key % BUCKET;
        table.get(i).remove((Integer) key);
    }
    public boolean search(int key){
        int i = key % BUCKET;
        return table.get(i).contains(key);
    }
}

public class CheckHash{
    public static void main(String[] args) {
        MyHash myHash = new MyHash(5);
        myHash.insert(70);
        myHash.insert(71);
        myHash.insert(9);
        myHash.insert(56);
        myHash.insert(72);
        System.out.println(myHash.search(56));
        System.out.println(myHash.search(57));
    }
}