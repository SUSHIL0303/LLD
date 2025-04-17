import java.util.ArrayList;
import java.util.List;

public class Order {
    private ArrayList<MenuItem> list;

    public Order(){
        list = new ArrayList<>();
    }

    public void addItems(MenuItem item){
        list.add(item);
    }


    public int calculationOrder(){
        int total = 0;
        for(MenuItem item : list){
            total += item.getPrice();
        }

        return total;
    }

    public void removeItems(String name) throws ItemNotFound{
        boolean removed = list.removeIf(list ->list.getName().equalsIgnoreCase(name));

        if(!removed){
            throw new ItemNotFound("Item "+name+"not found in the list");
        }
    }

    public void printOrder(){
        System.out.println("Your order");

        for(MenuItem item : list){
            System.out.println(item);
        }
        System.out.println("Your bill:" + calculationOrder());
    }
}
