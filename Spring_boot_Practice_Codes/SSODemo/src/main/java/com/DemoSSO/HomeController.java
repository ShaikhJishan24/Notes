/*

//Why is the type OAuth2User?

Ans:-

	You are using OAuth2 / SSO login

	Google / Facebook returns user details

	Spring Security wraps those details into an OAuth2User

	So:

	OAuth2User user

	represents:

		Logged-in Google/Facebook user

		With attributes like name, email, picture

*/

/*

@AuthenticationPrincipal OAuth2User user  
	above line means

Apply @AuthenticationPrincipal to the parameter user of type OAuth2User.”

*/

package com.DemoSSO;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Public Page";
    }

    @GetMapping("/dashboard")
    public String dashboard(@AuthenticationPrincipal OAuth2User user) {
        return "Welcome " + user.getAttribute("name") +" | Email: " + user.getAttribute("email");
    }
}
