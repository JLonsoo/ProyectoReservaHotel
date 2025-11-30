
public class cAutenticador {
    public boolean validarCredenciales(String usuario, String contrasena, String rol) {
        

        if (rol.equals("cliente")) {
            return usuario.equals("cliente1") && contrasena.equals("cliente123");
        }
        

        if (rol.equals("recepcionista")) {
            return usuario.equals("recep01") && contrasena.equals("recep123");
        }
        

        if (rol.equals("admin")) {
            return usuario.equals("jefe") && contrasena.equals("jefe123");
        }
        
        return false; 
    }

}
