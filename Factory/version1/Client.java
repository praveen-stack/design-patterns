package Factory.version1;

public class Client {
    public static void main(String[] args) {
        Database db = new MysqlDatabase();
        Query q;

        if(db instanceof PostgresDatabase){
            q = new PostgresQuery();
        } else {
            q = new MysqlQuery();
        }

        // here srp is violated
    }
}
