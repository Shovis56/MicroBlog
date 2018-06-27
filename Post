package Microblog2;

public class Post {


    public String comment;
    public String user;
    private int orderOfPosts;
    static int counter =1;


    public Post(String user, String comment ){

        this.comment = comment;
        this.user = user;
        this.orderOfPosts = counter;

        counter++;

    }


    public String getPost()
    {
        return user + " " + comment ;
    }

    public String getPostContent(){ return comment;}


    public String getUser(){
        return user;
    }

    public String allPosts()
    {
        return (orderOfPosts + ". " + user+ ": "+ comment);
    }



}
