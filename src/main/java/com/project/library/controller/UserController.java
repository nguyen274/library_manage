package com.project.library.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.project.library.model.User;
import com.project.library.service.MyUserDetails;
import com.project.library.service.UserService;

@SessionAttributes("loggedInUser")
@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/profile")
	public String viewDetail(@AuthenticationPrincipal MyUserDetails user, Model model) {
		
		model.addAttribute("user", user);
		return "user/profile";

	}
	
//	@GetMapping("/profile")
//	public String viewDetail(@AuthenticationPrincipal MyUserDetails loggedUser, Model model) {
//		String username = loggedUser.getUsername();
//		User user = userService.getByUsername(username);
//		model.addAttribute("user", user);
//		return "user/profile";
//
//	}

	@PostMapping("profile/update")
	public String saveDetails(User user, RedirectAttributes redirectAttributes) {
		User updateUser = userService.updateProfile(user);
		redirectAttributes.addFlashAttribute("successMsg", "Update profile thành công!");
		return "redirect:/profile";

	}

}
