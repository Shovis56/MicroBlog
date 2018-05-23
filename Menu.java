package Microblog2;

import static java.lang.System.out;


import java.util.Scanner;


public class Menu {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int option;
        int currentUser = 0;
        int numPosts;


        User[] user = new User[3];
        user[0] = new User("Harry Potter", "HPotter", "www.HP.com", "Gryffindor@hogwarts.com");
        user[1] = new User("Hermoine Granger", "HGranger", "www.HP.com", "Smartwizard@hogwarts.com");
        user[2] = new User("Neville Longbottom", "NLongbottom", "www.HP.com", "NLongbottom@hogwarts.com");


        Post[] post = new Post[100];
        post[0] = new Post(user[0].userName, "It does not do to dwell on dreams and forget to live");
        post[1] = new Post(user[1].userName, "I hope you're pleased with yourselves. We could all have been killed — or worse, expelled. Now if you don't mind, I'm going to bed.");
        post[2] = new Post(user[2].userName, "It takes a great deal of bravery to stand up to our enemies, but just as much to stand up to our friends");
        post[3] = new Post(user[0].userName, "I solemnly swear I am up to no good.");
        post[4] = new Post(user[1].userName, "Fear of a name only increases fear of the thing itself.");
        numPosts = 5;


        do {
            out.println("Main Menu");
            out.println("1) Create a new user");
            out.println("2) Become an existing user");
            out.println("3) Create a post as the current user");
            out.println("4) Print all posts");
            out.println("5) Print all users");
            out.println("9) To Exit");
            option = keyboard.nextInt();

            if (option == 1) {

                keyboard.nextLine();
                out.println("Full name: ");
                keyboard.nextLine();
                out.println("User Name: ");
                keyboard.nextLine();
                out.println("Web address: ");
                keyboard.nextLine();
                out.println("Email Address: ");
                keyboard.nextLine();
            } else if (option == 2) {
                out.println("Which user would you like to become?");
                for (int i = 0; i < user.length; i++) {
                    out.println(user[i].getExistingName());
                }
                option = keyboard.nextInt();
                out.println("You are now user " + user[option - 1].getFullName());
            } else if (option == 3) {
                int userPost = -1;
                for (int i = 0; i < numPosts; i++) {
                    if (post[i].getUser().equals(user[currentUser].getUserName())) {
                        userPost = i;
                    }
                }
                if (userPost > -1) {
                    out.println("This was your last post: ");
                    out.println(post[userPost].getPost());
                } else {
                    out.println("No post by current user");
                }

                keyboard.nextLine();
                out.println("Enter in your post: ");
                String pst = keyboard.nextLine();
                post[numPosts] = new Post(user[currentUser].getUserName(), pst);
                out.println("Post entered successfully!");
                out.println(post[numPosts].getPost());
                numPosts++;
            } else if (option == 4) {
                for (int i = 0; i < numPosts; i++) {
                    out.println(post[i].allPosts());
                }

            } else if (option == 5) {

                for (int i = 0; i < user.length; i++) {
                    out.println(user[i].getExistingName());
                }
            }

        } while (option != 9);
        out.println("Thank you for using Microblog :)");

    }


}

