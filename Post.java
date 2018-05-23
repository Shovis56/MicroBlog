package Microblog2;

public class Post {

    private String postContent;
    private String userName;
    private int orderOfPosts;
    static int counter =1;


    public Post(String userName1, String getContents ){

        this.postContent = getContents;
        this.userName = userName1;
        this.orderOfPosts = counter;

        counter++;

    }



    public String getPost()
    {
        return userName + " " + postContent ;
    }

    public String getUser(){
        return userName;
    }

    public String allPosts()
    {
        return (orderOfPosts + ". " + userName+ ": "+ postContent);
    }



}
