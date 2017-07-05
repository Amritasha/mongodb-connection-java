import com.mongodb.DB;
import com.mongodb.MongoClient;

public class Main {

    public static void main(String[] args) {
        try {
            MongoClient mc = new MongoClient("localhost", 27017);

            DB db = mc.getDB("test");
            System.out.println("Connected successfully");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" "+e.getMessage());
        }
    }
}
