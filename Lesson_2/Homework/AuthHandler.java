/**
 * Java Level 3. Lesson 2. Homework 2.
 * @author Maya Plieva
 * @version Jan 24 2019
 */

public interface AuthHandler {
    void start();
    String getNickByLoginPass(String login, String pass);
    boolean changeNick(String login, String newNick);
    void stop();
}