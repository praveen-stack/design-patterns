package Factory.version2;

public class MysqlDatabase implements Database {

    @Override
    public Query creatQuery() {
        return new MysqlQuery();
    }
    
}
