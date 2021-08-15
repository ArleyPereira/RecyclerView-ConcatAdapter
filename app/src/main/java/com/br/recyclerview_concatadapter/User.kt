package com.br.recyclerview_concatadapter

import java.io.Serializable

data class User(
    val name: String? = "",
    val email: String? = ""
) : Serializable {
    fun getList() : List<User> {
        return arrayListOf(
            User("Usuário 1", "email@gmail.com"),
            User("Usuário 2", "email@gmail.com"),
            User("Usuário 3", "email@gmail.com"),
            User("Usuário 4", "email@gmail.com"),
            User("Usuário 5", "email@gmail.com"),
            User("Usuário 6", "email@gmail.com"),
            User("Usuário 7", "email@gmail.com"),
            User("Usuário 8", "email@gmail.com"),
            User("Usuário 9", "email@gmail.com"),
            User("Usuário 10", "email@gmail.com"),
            User("Usuário 11", "email@gmail.com"),
            User("Usuário 12", "email@gmail.com"),
            User("Usuário 13", "email@gmail.com"),
            User("Usuário 14", "email@gmail.com"),
            User("Usuário 15", "email@gmail.com"),
        )
    }
}