import com.mongodb.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            MongoClient mc = new MongoClient("localhost", 27017);

           DB db = mc.getDB("test");
            System.out.println("Connected successfully");

            List<String> dbs = mc.getDatabaseNames();
            for(String db_name: dbs){
                System.out.println(db_name);
            }

            Set<String> tables = db.getCollectionNames();
            for(String col : tables){
                System.out.println("col");
            }

            DBCollection dbc = db.getCollection("new");
            /*BasicDBObject bdb = new BasicDBObject();
            bdb.put("first_name","amritasha");
            bdb.put("last_name","agrawal");
            bdb.put("date",new Date());
            dbc.insert(bdb);*/

            DBCursor cursor = dbc.find();
            while(cursor.hasNext()){
                System.out.println(cursor.next());
            }

        }catch(Exception e){
            System.err.println(e.getClass().getName()+" "+e.getMessage());
        }
    }
}
