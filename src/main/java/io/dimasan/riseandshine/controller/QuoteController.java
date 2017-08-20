package io.dimasan.riseandshine.controller;

import io.dimasan.riseandshine.service.QuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuoteController {

    private QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping({"/", ""})
    public String showQuote(Model model) {
        model.addAttribute("quote", quoteService.getQuote());
        return "getup";
    }
}
