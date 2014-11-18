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
        blogdb.trimToSize();
    }

    public Post get(int id) {
        Post post;
        post = null;
        for (Post p : blogdb) {
            if (p.getid() == id) post = p;
        }
        return post;
    }


    public int search(String head) {
        int i = 0;
        for (Post p : blogdb) {
            if (p.gethead().equals(head)) i = p.getid();
        }
        return i;
    }

    public void delete(int id) {
        for (Post p : blogdb) {
            if (p.getid() == id) blogdb.remove(p);
        }
    }

}
