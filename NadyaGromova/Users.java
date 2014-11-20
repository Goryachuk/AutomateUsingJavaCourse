
package webblog;

import java.util.Scanner;

public class Users {
   public String login_user;
   Scanner u= new Scanner(System.in);
   
   private void AddUserLogin (String login)
   {
       System.out.println("Login name...");
       login=u.next();
       this.login_user=login;
   }
   
   private String GetUserLogin ()
   {
       return login_user;
   }
   
   public void CreateUser()
   {
       AddUserLogin(login_user);
       System.out.println("User "+this.GetUserLogin().toUpperCase()+" has been successfully created.\nYou may  start submitt your posts.\n");
   }
   
}
