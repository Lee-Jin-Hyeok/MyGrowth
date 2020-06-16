package abc.def.ghi;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public HashMap<String, Object> init(@RequestBody HashMap<String, Object> map) {
    	
        map.put("phone", "0000-0000");
    	return map;
    }
	
	@ResponseBody
	@RequestMapping("/join")
	public String join() {
		return "Hello";
	}
}
