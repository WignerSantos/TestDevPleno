package com.wigner.TestDevPleno;

import com.wigner.TestDevPleno.model.Roles;
import com.wigner.TestDevPleno.model.User;
import com.wigner.TestDevPleno.repositories.RoleRepository;
import com.wigner.TestDevPleno.repositories.UserRepository;
import com.wigner.TestDevPleno.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.beans.Encoder;
import java.util.Arrays;

@SpringBootApplication
public class TestDevPlenoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private PasswordEncoder encoder;

	public static void main(String[] args) {
		SpringApplication.run(TestDevPlenoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Roles role = new Roles(1, "ADMIN");
		roleRepository.save(role);

		User user = new User(1, "User", "user@gmail.com", encoder.encode("123"), role);
		userRepository.save(user);
	}
}
