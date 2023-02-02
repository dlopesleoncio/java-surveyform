package com.Diogo.form.FormSubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SurveyForm{

    @GetMapping("/survey")
    public String surveyList(Model model){
        model.addAttribute("suvf", new SurveySub());
        return "SurveyForm/index";
    }
/*
 *  @PostMapping("/survey")
    public String surveyResult(@ModelAttribute SurveyForm index, Model model ){
        model.addAttribute("index",index);
        return "result";
    }
 */
   
}