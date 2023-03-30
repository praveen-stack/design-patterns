package Factory.version3;

public class MysqlDatabaseFactory implements DatabaseFactory{

    @Override
    public Query creatQuery() {
        return new MysqlQuery();
    }
    
}
