public class output {

    public static void out() {


    }

    public static void outpost(Post post) {
        if (post != null) {
            System.out.println();
            System.out.println("ID is " + post.getid());
            System.out.println(post.gethead());
            System.out.println(post.getbody());
            System.out.println(post.getpicture());
            System.out.println(post.gettag());
            System.out.println(post.getdate());
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Post not found");
            System.out.println();

        }

    }
}
