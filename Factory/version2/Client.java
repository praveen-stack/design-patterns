package Factory.version2;

public class Client {
    public static void main(String[] args) {
        Database db = new MysqlDatabase();
        Query q;

        // This is a factory method design pattern.
        db.creatQuery();
    }
}
