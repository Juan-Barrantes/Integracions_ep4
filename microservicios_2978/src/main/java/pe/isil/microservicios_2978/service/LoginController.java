package pe.isil.microservicios_2978.service;

import com.mysql.cj.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.isil.microservicios_2978.model.Login;
import pe.isil.microservicios_2978.repository.LoginRepository;

import java.util.List;


@RestController
@RequestMapping("/api_2978/login")
public class LoginController {

    @Autowired
    private LoginRepository loginRepository;
    @Autowired
    private LoginService loginService;

    @PostMapping("/iniciarSesion")
    public Boolean login (@RequestBody Login login){
        List<Login> userList = loginRepository.findByEmail(login.getEmail());
        try {
            Login user = userList.get(0);
            System.out.println(user.toString());

            if (user.getContrasena().equals(login.getContrasena())) {
                return true;
            } else {
                return false;
            }

        }catch (Exception ex){
            return  false;
        }
    }



}
