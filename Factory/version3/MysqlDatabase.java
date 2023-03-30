package Factory.version3;

public class MysqlDatabase implements Database {

    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new MysqlDatabaseFactory();
    }
    
}
