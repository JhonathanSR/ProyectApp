package User;public class kt {

    data class User(val name: String, val email: String, val password: String)

    object Database {
        var users = mutableListOf<User>()
    }
}
