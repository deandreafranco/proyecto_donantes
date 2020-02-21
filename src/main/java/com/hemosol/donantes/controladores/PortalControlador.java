package com.hemosol.donantes.controladores;

import com.hemosol.donantes.entidades.Zona;
import com.hemosol.donantes.errores.ErrorServicio;
import com.hemosol.donantes.repositorios.ZonaRepositorio;
import com.hemosol.donantes.servicios.UsuarioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/")
public class PortalControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @Autowired
    private ZonaRepositorio zonaRepositorio;

//    @GetMapping("/")
//    public String index() {
//        return "index.html";
//    }
//
//    @PreAuthorize("hasAnyRole('ROLE_USUARIO_REGISTRADO')")
//    @GetMapping("/index")
//    public String inicio() {
//        return "index.html";
//    }

}
