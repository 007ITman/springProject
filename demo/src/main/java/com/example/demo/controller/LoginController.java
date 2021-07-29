package com.example.demo.controller;

import com.example.demo.constant.ZDConstants;
import com.example.demo.dto.LoginDto;
import com.example.demo.service.LoginService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/**
 * 2021.05.20(再修正)
 * 登録クラス
 * */
@Controller
@RequestMapping(value = "/test")
public class LoginController {
	
	private static final Logger log = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	LoginService loginService;

	// googleでアクセスするURLは「http://localhost:8080/test/confirm」だ。
    @RequestMapping(value = "/confirm")
    /**
     * 画面初期化メソッド
     * 
     * */
    public String confirm(@Validated @ModelAttribute LoginDto form, BindingResult result, Model model) {
    	// 登録画面へ遷移
    	log.info("画面初期化");
        return "html/login";
    }

    @RequestMapping(value = "/admit", method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute LoginDto loginDto) {

    	ModelAndView modelAndView = new ModelAndView();
    	// 登録データが確認
        if ("zd123".equals(loginDto.getLoginName()) && "password".equals(loginDto.getLoginPassword())) {

        	loginService.APInsert(loginDto);
        	modelAndView.addObject("loginDto", loginDto);
            modelAndView.setViewName("html/loginSuccess");
            log.info("登録成功");
            return modelAndView;
        }
        LoginDto loginDtoL = new LoginDto();
        loginDtoL.setResultMessage(ZDConstants.LOGIN_RESULT_MESSAGE);
        modelAndView.setViewName("html/login");
        modelAndView.addObject("loginDto", loginDtoL);
        log.info("登録失敗");
        return modelAndView;
    }
}
