
package webblog;

import java.util.Scanner;
public class WebBlog {

    
    public static void main(String[] args) {
        
        Users ul=new Users();
        ul.CreateUser();
        
       System.out.println("Select post type.\n 1.Regular post.\n 2.External URL post.\n");
       Scanner sc=new Scanner(System.in);
       int choise=sc.nextInt();
       int n=3;
       
       switch (choise)
       {
           case 1:
        RegularPost [] regposts =new RegularPost[n];
        for(int rp=0;rp<regposts.length;rp++)
        {
        regposts [rp]=new RegularPost();
        regposts[rp].AddNewPost();
        } 
          break;
           case 2:
        ExternalURLPost [] urlposts=new ExternalURLPost[n];
        for(int up=0;up<urlposts.length;up++)
        {
        urlposts[up]=new ExternalURLPost();
        urlposts[up].AddNewPost();
       }
        break;
        default:
        System.out.println("You did not select a post type...");
        break;
       }
              
       System.out.println(n+" posts have been submitted by user "+ul.login_user.toUpperCase());
       
    }
}