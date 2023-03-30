package Factory.version2;

public class PostgresDatabase implements Database {

    @Override
    public Query creatQuery() {
        return new PostgresQuery();
    }
    
}
