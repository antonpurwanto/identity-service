package id.tamkin.identity.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

import id.tamkin.identity.dao.UserDao;
import id.tamkin.identity.entity.User;


@Controller
public class UserControlller {

	@Autowired
    private UserDao userDao;
    /*@Autowired
    private JenisSuratDao jenisSuratDao;
    @Autowired
    private DosenDao dosenDao;*/

    /*@ModelAttribute("daftarJenisSurat")
    public Iterable<JenisSurat> daftarJenisSurat() {
        return jenisSuratDao.findAll();
    }*/
    @RequestMapping("/user/delete")
    public String delete(@RequestParam("id") String id) {
    	userDao.delete(id);
        return "redirect:list";
    }
    /*@ModelAttribute("daftarDosen")
    public Iterable<Dosen> daftarDosen() {
        return dosenDao.findAll();
    }*/

    @RequestMapping("/user/list")
    public ModelMap SuratTugas() {
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("daftarUser", userDao.findAll());
        return modelMap;
    }

    @RequestMapping(value = "/user/form", method = RequestMethod.GET)
    public ModelMap tampilkanForm(@RequestParam(value = "id", required = false) User user) {
        if (user == null) {
            user = new User();
        }
        return new ModelMap("User", user);
    }

    @RequestMapping(value = "/user/form", method = RequestMethod.POST)
    public String prosesForm(@ModelAttribute @Valid User user, BindingResult err, SessionStatus status) {
        if (err.hasErrors()) {
            return "/user/form";
        }
        userDao.save(user);
        status.setComplete();
        return "redirect:/user/list";
    }

}
