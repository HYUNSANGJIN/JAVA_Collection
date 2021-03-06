import java.util.HashSet;
import java.util.Iterator;

class Myclass{
    private int id;
    private String name;
    
    public Myclass() {
        
    }

    public Myclass(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Myclass [id=" + id + ", name=" + name + "]";
    }
    
    public void displayInfo() {
        System.out.println("학번 : " + this.id);
        System.out.println("이름 : " + this.name);
    }
    
}

public class Ex10_Set_Object {

    public static void main(String[] args) {
        HashSet<Myclass> hset = new HashSet<Myclass>();
        hset.add(new Myclass(1, "Abc"));
        hset.add(new Myclass(2, "Def"));
        hset.add(new Myclass(3, "Asdf"));
        
        for(Myclass m : hset) {
            m.displayInfo();
        }
        
        // iterator 출력
        Iterator<Myclass> itr = hset.iterator();
        while(itr.hasNext()) {
           // itr.next().displayInfo();  // next가 리턴하는게 myclass이다.
            Myclass mc = itr.next();
            mc.displayInfo();
            
        }
        

    }

}
