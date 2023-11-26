
object UsuariosRepository {
    private val usuarios = mutableListOf<Usuario>()

    fun agregarUsuario(usuario: Usuario) {
        usuarios.add(usuario)
    }

    fun obtenerUsuarios(): List<Usuario> {
        return usuarios.toList()
    }
}
