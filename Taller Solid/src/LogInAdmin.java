public class LogInAdmin extends AdminValidator implements ILogIn{
    private boolean userIsAdmin;

    @Override
    public void log(User user) {
        this.userIsAdmin = verifyIfTheUserIsAdmin(user);
        if (!userIsAdmin) {
            System.out.println("No access: User is not an admin.");
            return;
        }
        System.out.println("Has access to the website in admin mode");
        // Logic
    }

    private boolean verifyIfTheUserIsAdmin(User user) {
        // Logic
        return true;
    }


}

