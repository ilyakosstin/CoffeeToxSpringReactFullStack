package ru.coffeetox.cfx;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.coffeetox.cfx.zesty.UserSeeder;

@SpringBootApplication
@Log
public class CfxApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(CfxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("fuck");



	}
}
