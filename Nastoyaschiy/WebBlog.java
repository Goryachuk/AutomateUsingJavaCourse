import java.io.IOException;

public class WebBlog {

    public static void main(String[] args) throws IOException, InterruptedException {

        Posts posts = new Posts();

        Post post = new Post("Первая заметка","Это типа первая заметка. Тут я буду писать еще очень много и вообще разную фигню, потому что мне надо тут написать много фигни. Очень много.","http://demotivators.to/media/posters/1441/15405168_kakaya-zhe-tyi-krasivaya.jpg","ололо");
        posts.addpost(post);
        post = new Post("1", "1", "1", "1");
        posts.addpost(post);
        post = new Post("2", "2", "2", "2");
        posts.addpost(post);
        output.outpost(posts.get(2));
        output.outpost(posts.get(1));
        output.outpost(posts.get(10));
        posts.delete(1);
        output.outpost(posts.get(1));
        post = new Post("3", "3", "3", "3");
        posts.addpost(post);

    }
}
