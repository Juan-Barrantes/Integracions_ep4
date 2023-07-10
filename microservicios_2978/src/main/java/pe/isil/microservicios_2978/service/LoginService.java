package pe.isil.microservicios_2978.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import pe.isil.microservicios_2978.model.Login;
import pe.isil.microservicios_2978.repository.LoginRepository;

@Service
public class LoginService {

//    private  PasswordEncoder passwordEncoder;
//
//    @Autowired
//    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
//        this.passwordEncoder = passwordEncoder;
//    }

    @Autowired
    private LoginRepository loginRepository;
//    @Autowired
//    private JavaMailSender mail;


//    public Login obtenerUsuarioPorEmail(String email) {
//        return loginRepository.findByEmail(email);
//    }

//    public int iniciarSesion(String email, String password) {
//        Login login = loginRepository.findByEmail(email);
//
//        if (login == null) {
//            return 0;
//        }
//
//        if (email==login.getEmail() && password == login.getContrasena()) {
//            return 1;
//        }else {
//            return 0;
//        }
//
//    }
}
