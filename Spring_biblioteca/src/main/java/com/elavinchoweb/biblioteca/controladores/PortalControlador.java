/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.elavinchoweb.biblioteca.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author elavincho
 */

@Controller
@RequestMapping("/") //localhost:8080/
public class PortalControlador {
    
    @GetMapping("/") //localhost:8080/
    public String index(){
        
        return "index.html";
    }
}
