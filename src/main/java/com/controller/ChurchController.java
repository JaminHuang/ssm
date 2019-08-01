package com.controller;

import com.model.Church;
import com.service.IChurchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/church")
public class ChurchController {

    @Resource
    private IChurchService churchService;

    @RequestMapping("/get")
    public String getChurch(HttpServletRequest request, Model model) {
        String churchId = request.getParameter("id");
        Church church = churchService.get(churchId);
        model.addAttribute("church", church);
        return "info";
    }
}
