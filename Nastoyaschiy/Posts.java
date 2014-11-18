import java.util.ArrayList;


public class Posts {

    private ArrayList<Post> blogdb = new ArrayList<Post>(0);

    public void addpost(Post post) {
        if (blogdb.size() > 0) {
            post.setid(blogdb.get(blogdb.size()-1).getid() + 1);
        } else {
            post.setid(1);
        }
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
