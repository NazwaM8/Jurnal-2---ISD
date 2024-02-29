import java.util.ArrayList;
import java.util.Collections;

public class ListBarang <E extends Comparable <? super E>> {
    private final ArrayList<E> list;

    public ListBarang() {
        this.list = new ArrayList<>();
    }

    public void addData(E data) {
        list.add(data);
    }

    public void removeData(int index){
        list.remove(list.get (index));
    }

    public void editData(int index,E data){
        list.set(index, data);
    }

    public int size(){
        return list.size();
    }

    public E getIndex(int index){
        return list.get(index);
    }

    public void sorting(){
        Collections.sort(list);
    }
}
