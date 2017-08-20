package io.dimasan.riseandshine.service;

import io.dimasan.riseandshine.core.QuoteGenerator;
import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImpl implements QuoteService {

    private final QuoteGenerator quoteGenerator;

    public QuoteServiceImpl() {
        this.quoteGenerator = new QuoteGenerator();
    }

    @Override
    public String getQuote() {
        return quoteGenerator.getRandomQuote();
    }
}
