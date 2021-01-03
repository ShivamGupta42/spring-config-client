package demo.spring.config.client.springconfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringConfigClientApplication {

	@Autowired
	public void setEnv(Environment e)
	{
		System.out.println(e.getProperty("msg"));
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigClientApplication.class, args);
	}

}
