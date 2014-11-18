import java.util.Date;


public class Post {

    private int id;
    private String head;
    private String body;
    private Date date;
    private String picture;
    private String tag;

    Post(String head, String body, String picture, String tag) {
        this.head = head;
        this.body = body;
        this.date = new Date();
        this.picture = picture;
        this.tag = tag;
    }

    public int getid() {
        return id;
    }
    public void setid(int id) {
        this.id = id;
    }

    public String gethead() {
        return head;
    }
    public void sethead(String head) {
        this.head = head;
    }

    public String getbody() {
        return body;
    }
    public void setbody(String body) {
        this.body = body;
    }

    public Date getdate() {
        return date;
    }
    public void setdate() {
        this.date = new Date();
    }

    public String getpicture() {
        return picture;
    }
    public void setpicture(String picture) {
        this.picture = picture;
    }

    public String gettag() {
        return tag;
    }
    public void settag(String tag) {
        this.tag = tag;
    }
}