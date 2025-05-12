package com.sg.ai.question;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuestionController {

	@Autowired
	private QuestionRepository questionrepository;
	
	@GetMapping("/question/list")
//	@ResponseBody
	public String list(Model model) {
		
		List<Question> questionList = this.questionrepository.findAll();
		model.addAttribute("questionList", questionList);
		return "question_list";
	}
}
