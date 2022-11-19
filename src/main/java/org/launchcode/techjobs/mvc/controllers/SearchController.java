package org.launchcode.techjobs.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.launchcode.techjobs.mvc.controllers.ListController.columnChoices;


/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("search")
public class SearchController {

    @GetMapping(value = "")
    public String search(Model model) {
        model.addAttribute("columns", columnChoices);
        return "search";
    }

    // TODO #3 - Create a handler to process a search request and render the updated search view.
    
//    @PostMapping(value = "")
//    public String displaySearchResults(Model model, @RequestParam String id, @RequestParam(required = false) String searchTerm) {
//        ArrayList<Job> jobs;
//        if (id.equals("all")) {
//            jobs = JobData.findAll();
//        } else {
//            jobs = JobData.
//        }
//        model.addAttribute("title", "Jobs with " + id.get(column) + ": " + value);
//        model.addAttribute("jobs", jobs);
//        return "results";
//    }
}
