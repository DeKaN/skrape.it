package it.skrape.core

import it.skrape.core.fetcher.BrowserFetcher
import it.skrape.core.fetcher.HttpFetcher
import java.lang.System.*


class Scraper(val request: Request = Request()) {

    fun scrape(): Result {

        setProperty("sun.net.http.allowRestrictedHeaders", "true")

        return when (request.mode) {
            Mode.DOM -> BrowserFetcher(request).fetch()
            Mode.SOURCE -> HttpFetcher(request).fetch()
        }
    }
}
