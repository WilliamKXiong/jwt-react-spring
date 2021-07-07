package com.jwt.jwt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin()
public class HelloWorldController {
	/*
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtUtil jwtTokenUtil;

	@Autowired
	private MyUserDetailsService userDetailsService;

	@RequestMapping({ "/hello" })
	public String hello() {
		return "Hello World";
	}*/
	
	/*
	@PostMapping("/login2")
	public String createAuthenticationToken(@ModelAttribute User input, Model model) throws Exception {
		//ResponseEntity<?>
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(input.getEmail(), input.getPassword()));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}

		final UserDetails userDetails = userDetailsService
				.loadUserByUsername(input.getEmail());
		
		//System.out.println("userDetails= " + userDetails.getUsername() + ", " + userDetails.getPassword());
		final String token = jwtTokenUtil.generateToken(userDetails);

  		model.addAttribute("email", input.getEmail());
  		model.addAttribute("password", input.getPassword());
  		model.addAttribute("token", token);
  		
  		return "login_success2"; //=login_success.html
		//return ResponseEntity.ok(new AuthenticationResponse(token));
	}*/
}

