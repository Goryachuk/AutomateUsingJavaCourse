import java.util.ArrayList;


public class Posts {

    private ArrayList<Post> blogdb = new ArrayList<Post>(0);
    private int lastID;

    public void addpost(Post post) {
        lastID++;
        post.setid(lastID);
        blogdb.add(post);
    }

    public Post get(int id) {
        Post post;
        post = null;
        for (int i = 0; i < blogdb.size(); i++) {
            if (blogdb.get(i).getid() == id) {
                post = blogdb.get(i);
                break;
            }
        }
        return post;
    }


    public void search(String head) {
        boolean found = false;
        for (Post p : blogdb) {
            if (p.gethead().equals(head)) {
                output.outpost(p);
                found = true;
            }
        }
        if (!found) System.out.println("Posts with head \"" + head + "\" not found");
    }

    public void delete(int id) {
        for (int i = 0; i < blogdb.size(); i++) {
            if (blogdb.get(i).getid() == id) {
                blogdb.remove(i);
                break;
            }
        }
        blogdb.trimToSize();
    }

}
