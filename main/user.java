public class User
{
    private string username;
    private String password;

    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    /*
     * returns the user's username
     */
    public String getUsername()
    {
        return username;
    }

    /*
     * updates the user's username
     */
    private void setUsername(String username)
    {
        this.username = username;
    }

    /*
     * returns the user's password
     */
    public String getPassword()
    {
        return password;
    }

    /*
     * updates the user's password
     */
    private void setPassword(String password)
    {
        this.password = password;
    }
}