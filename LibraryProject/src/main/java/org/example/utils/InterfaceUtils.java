package org.example.utils;

import org.example.manager.BookManager;
import org.example.manager.UserManager;
import org.example.model.Book;
import org.example.model.User;

import java.util.Optional;
import java.util.Scanner;
import java.util.UUID;

public class InterfaceUtils {

    public static String askString (Scanner reader, String question){
        System.out.println(question);
        String result = reader.nextLine();

        return result;
    }

    public static int askInt (Scanner reader, String question){
        System.out.println(question);
        int result = Integer.parseInt(reader.nextLine());
        return result;
    }


    public static String createUUID () {

        UUID uuid = UUID.randomUUID();
        //System.out.println("UUID generated ( version - " + uuid.version() + ") : " +  uuid);
        String id = uuid.toString();
        return id;

    }

    public static void populateFakeDataStorage(){
        BookManager.createBooks(10);
        UserManager.createUsers(10);

        Optional<String> firstUserKey = UserManager.users.keySet().stream().findFirst();
        String firstUserId = "";
        if (firstUserKey.isPresent()) {
            firstUserId = firstUserKey.get();
            System.out.println("userId: " + firstUserId );
        }

        Optional<String> firstBookKey = BookManager.books.keySet().stream().findFirst();
        String firstBookId ="";
        if (firstBookKey.isPresent()) {
            firstBookId = firstBookKey.get();
            System.out.println("bookId: " + firstBookId );
        }




    }
}