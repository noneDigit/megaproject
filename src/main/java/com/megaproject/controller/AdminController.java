package com.megaproject.controller;

import com.megaproject.entity.BankAccount;
import com.megaproject.entity.Role;
import com.megaproject.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static com.megaproject.controller.MainController.bankAccountService;
import static com.megaproject.controller.MainController.roleService;
import static com.megaproject.controller.MainController.userService;

@Controller
@RequestMapping("/")
public class AdminController {

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView goToAdminPage() {
        ModelAndView model = new ModelAndView();

        List<User> userList = userService.findAll();
        List<BankAccount> bankAccountList = bankAccountService.findList();
        List<Role> roleList = roleService.findAll();

        model.addObject("bankList", bankAccountList);
        model.addObject("roleList", roleList);
        model.addObject("userList", userList);
        model.setViewName("admin");
        return model;
    }

    @RequestMapping(value = "/admin/add", method = RequestMethod.GET)
    public ModelAndView updateUser(@RequestParam(value = "admin", required = false) String changeRole,
                                   @RequestParam("login") String login,
                                   @RequestParam("name") String name,
                                   @RequestParam("surname") String surname,
                                   @RequestParam("email") String email,
                                   @RequestParam("id") int id) {

        ModelAndView model = new ModelAndView();
        if (changeRole != null) {
            Role role = roleService.findByUserId(id);
            roleService.update(role, MainController.ROLE_ADMIN);
        }
        User user = new User();
        user.setId(id);
        user.setLogin(login);
        user.setName(name);
        user.setSurname(surname);
        user.setEmail(email);
        userService.update(user);

        model.setViewName("redirect:/admin");
        return model;
    }
}