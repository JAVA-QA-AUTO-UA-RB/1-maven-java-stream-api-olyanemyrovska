package org.example;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.dto.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class UserLoader {

    public static List<User> loadUsersFromJson(String filePath) throws IOException {
        // Додайте реалізацію метода, який
        // з JSON файлу який знаходиться за відносним шляхом filepath
        // з допомогою вбудованих засобів бібліотеки https://mvnrepository.com/artifact/com.google.code.gson/gson/2.10.1
        // десеріалізує контент JSON файлу у список з об*єктів типу User і повертає список
        Gson gson = new Gson();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        StringBuilder usersJson = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            usersJson.append(line);
        }
        Type collectionType = new TypeToken<List<User>>() {}.getType();
        return gson.fromJson(String.valueOf(usersJson), collectionType);
    }
}
