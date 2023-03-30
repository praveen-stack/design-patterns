package Factory.version3;

public class Client {
    public static void main(String[] args) {
        Database db = new MysqlDatabase();
        // This is a abstract factory design pattern.
        DatabaseFactory dbf = db.createDatabaseFactory();
        Query q = dbf.creatQuery();
    }
}
