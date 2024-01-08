package in.glootech.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@Autowired
	private AppProperties properties;
	
	@GetMapping("/greet")
	public String getGreet() {
		Map<String, String> messages = properties.getMessages();
		return messages.get("welcomeMsg");
	}
}
