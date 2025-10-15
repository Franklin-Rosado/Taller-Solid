public class AppWeb implements IDataBase{
    ILogIn logIn;
    IDatabase database;

    public AppWeb(ILogIn logIn, IDatabase database) {
        this.logIn = logIn;
        this.database = database;
    }

    public void connectToDatabase() {
        // Logic
    }


}

