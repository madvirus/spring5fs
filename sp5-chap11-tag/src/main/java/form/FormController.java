package form;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")
public class FormController {

	@ModelAttribute("formCommand")
	public FormCommand createCommand() {
		return new FormCommand();
	}

	@GetMapping
	public String form(Model model,FormCommand formCmd) {
		formCmd.setLoginType("기업회원");
		List<String> loginTypes = new ArrayList<String>();
		loginTypes.add("일반회원");
		loginTypes.add("기업회원");
		loginTypes.add("헤드헌터회원");
		model.addAttribute("loginTypes", loginTypes);
		
		List<Code> jobCodes = Arrays.asList(
				new Code("01", "프로그래머"),
				new Code("02", "디자이너"));
		model.addAttribute("jobCodes", jobCodes);
		
		model.addAttribute("favoriteOsNames", new String[] {"윈도우8", "윈도우10", "맥OS"});
		model.addAttribute("favoriteOsCodes", Arrays.asList(
				new Code("01", "윈도우8"),
				new Code("02", "윈도우10")));
		return "form";
	}
}
