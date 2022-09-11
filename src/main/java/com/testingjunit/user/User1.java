package com.testingjunit.user;

import java.util.ArrayList;

public class User1 {

    ArrayList <User2> user1 = new ArrayList();

    public User2 crear(User2 user2){
        user1.add(user2);
        return user2;
    }

    public String buscar(User2 user2){
        for (User2 usuarioActual : user1){
            if(usuarioActual.name.equalsIgnoreCase(user2.name)){
                return usuarioActual.name;
            }
        }
        return null;
    }

    public boolean borrar(User2 user2){
        return user1.remove(user2);
    }
}
