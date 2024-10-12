package org.example;

public class Main {
    public static void main(String[] args) {
        QueryBuilder postgreSQLBuilder = new PostgreSQLQueryBuilder();
        String postgreSQLQuery = postgreSQLBuilder
                .select("id", "name")
                .where("age > 30")
                .limit(10)
                .getSQL();
        System.out.println("PostgreSQL Query: " + postgreSQLQuery);

        QueryBuilder mySQLBuilder = new MySQLQueryBuilder();
        String mySQLQuery = mySQLBuilder
                .select("id", "name")
                .where("age > 30")
                .limit(5)
                .getSQL();
        System.out.println("MySQL Query: " + mySQLQuery);
    }
}