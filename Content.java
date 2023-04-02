//import java.lang.Math;
import java.util.Comparator;

public class Content{
    protected int id;
    protected String text;
    protected String username;
    protected Long posttime;   
    protected int likes;
    protected int dislikes;
    protected Boolean isPost;

    public Boolean isPost(){
        return this.isPost;
    }

    public int getId(){
        return this.id;
    }

    public String getContent(){
        return this.text;
    }

    public String getUsername(){
        return this.username;
    }

    public Long getPostTime(){
        return this.posttime;
    }

    public int getLikes(){
        return this.likes;
    }

    public int getDislikes(){
        return this.dislikes;
    }

    public void like(){}
    public void dislike(){}
}

class ContentTimeComparator implements Comparator<Content>{
    @Override
    public int compare(Content c1, Content c2){
        return (int)(c1.getPostTime() - c2.getPostTime());
    }
}

class ContentLikeComparator implements Comparator<Content>{
    @Override
    public int compare(Content c1, Content c2){
        return c2.getLikes() - c1.getLikes();
    }
}