package org.example;

public class PostgreSQLQueryBuilder implements QueryBuilder{
    private StringBuilder query;
    public PostgreSQLQueryBuilder() {
        query = new StringBuilder();
    }
    @Override
    public QueryBuilder select(String... columns) {
        query.append("SELECT ");
        query.append(String.join(", ", columns));
        query.append(" ");
        return this;
    }
    @Override
    public QueryBuilder where(String condition) {
        query.append("WHERE ");
        query.append(condition);
        query.append(" ");
        return this;
    }
    @Override
    public QueryBuilder limit(int limit) {
        query.append("LIMIT ");
        query.append(limit);
        query.append(" ");
        return this;
    }
    @Override
    public String getSQL() {
        return query.toString();
    }
}
