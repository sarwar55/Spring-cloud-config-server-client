package org.sarwar.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RefreshScope
@Controller
public class RateController {

	@Value("${rate}")
	String rate;

	@Value("${lanecount}")
	String lanecount;

	@Value("${tollstart}")
	String tollstart;

	@Value("${connstring}")
	String connString;

	@RequestMapping(value= "/rate", method = RequestMethod.GET)
	public String getRate(Model m) {
		m.addAttribute("rateamount", rate);
		m.addAttribute("lanes", lanecount);
		m.addAttribute("tollstart", tollstart);
		m.addAttribute("connstring", connString);

		return "rateview";
	}
}
