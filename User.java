package Microblog2;


import java.util.ArrayList;


public class User {

    //users
    private String fullName;
    public String userName;
    public String webAddress;
    private String emailAddress;


    private ArrayList posts = new ArrayList();

    public User (Post p){
        posts.add(p);

    }
    private int userNumber;

    static int counter = 1;


    public User(String fullName2, String userName2, String webAddress2, String emailAddress2) {

        this.fullName = fullName2;
        this.userName = userName2;
        this.webAddress = webAddress2;
        this.emailAddress = emailAddress2;
        this.userNumber = counter;
        counter ++;

    }


    public String getExistingName(){
        return(userNumber + ") " + fullName);

    }


    public String getFullName(){
        return fullName;
    }

    public String getUserName(){
        return userName;
    }


    }


