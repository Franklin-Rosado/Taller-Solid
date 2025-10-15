public class LogIn implements ILogIn{
    @Override
    public void log(User user) {
        System.out.println("Has access to the website");
        insertUserInDatabase(user);
    }

    public void insertUserInDatabase(User user) {
        	// Logic
    }


}

