// Use of Singleton in Java

class Database {

    private static Database dbObject;

    private Database() {
    }
    
    public static Database getInstance() {

        if (dbObject == null) {
            dbObject = new Database();
        }

        return dbObject;

    }

    public void getConnection() {
        System.out.println("You are now connected to the database.");
    }

}

class Example2 {

    public static void main(String[] args) {

        Database db1;

        db1 = Database.getInstance();
        db1.getConnection();

    }

}
