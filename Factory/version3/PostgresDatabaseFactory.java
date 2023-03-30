package Factory.version3;

public class PostgresDatabaseFactory implements DatabaseFactory {

    @Override
    public Query creatQuery() {
        return new PostgresQuery();
    }
    
}
