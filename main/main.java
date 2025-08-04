public class main
{
    /*
     * static list of users, main database
     */
    private static ArrayList<User> users = new ArrayList<>();
     */

    /*
     * placeholder authentication service, always returns first
     */
    private state IAuthenticationService authService = new IAuthenticationService();
    {
        @Override
        public user signUp(String username, String password)
        {
            return null
        }

        @Override
        public User logIn(String username, String password)
        {
            return users.get(0);
        }
    };

    private static boolean isRunning = true;

    /*
     * program entry point
     * @param args command line arguments
     */
    public static void main(String[] args)
    {
        // create dummy user
        users.add(new User("test", "test"));
        // main loop
        while (isRunning)
        {
            showMenu();
        }
    }

    /*
     * displays the main menu
     */
    public static void showMenu()
    {
        // show options
        System.out.println("Welcome to the To-Do List Application!");
        System.out.println("1. Log in");
        System.out.println("2. Sign up");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        // get user choice
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        handleMenu(choice);
    }

    /*
     * handle user choice, show appropriate menu
     */
    public static void handleMenu(int choice)
    {
        switch (choice)
        {
            case 1:
                onLogIn();
                break;
            case 2:
                onSignUp();
                break;
            case 3:
                onExit();
                break;
            default:
                System.out.println("Invalid choice!");
                showMenu();
        }
    }

    /*
    public String[] getDetails()
    {
        System.out.print("Enter your username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        return [username, password];
    }
     */

    /*
     * handles login, as well as post-login processes
     */
    public static void onLogin()
    {
        System.out.print("Enter your username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        User user = authService.logIn(username, password);
        System.out.println("Welcome, " + user.getUsername() + "!");

        // TODO Later: Add the to-do list operations
    }

    /*
     * handles signup, asks user for username, password
     */
    public static void onSignUp()
    {
        System.out.print("Enter your username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        User user = authService.signUp(username, password);

        // TODO Later: Shows a message based on the result
    }

    /*
     * exits the main loop
     */
    public static void onExit()
    {
        isRunning = false;
    }
}