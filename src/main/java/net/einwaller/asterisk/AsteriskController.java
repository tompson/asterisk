package net.einwaller.asterisk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsteriskController {

    private static final Logger log = LoggerFactory.getLogger(AsteriskController.class);

    @PostMapping(value = "/message", consumes = "application/x-www-form-urlencoded")
    public void message(@RequestBody String body) {
        log.info("Received body: {}", body);
    }
}