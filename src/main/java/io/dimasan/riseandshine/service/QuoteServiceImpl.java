package io.dimasan.riseandshine.service;

import io.dimasan.riseandshine.core.QuotesLoader;
import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImpl implements QuoteService {

    private final QuotesLoader quotesLoader;

    public QuoteServiceImpl() {
        this.quotesLoader = new QuotesLoader();
    }

    @Override
    public String getQuote() {
        return quotesLoader.getRandomQuote();
    }
}
