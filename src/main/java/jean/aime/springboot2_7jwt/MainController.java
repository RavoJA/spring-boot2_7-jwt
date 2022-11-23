package jean.aime.springboot2_7jwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {
    private static final Logger LOG = LoggerFactory.getLogger(MainController.class);
    private final TokenService tokenService;

    public MainController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @GetMapping
    public String home(Principal principal) {
        return "Hello, " + principal.getName();
    }


    @PostMapping("/token")
    public String token(Authentication authentication) {
        LOG.debug("Token requested for user: '{}'", authentication.getName());
        String token = tokenService.generateToken(authentication);
        LOG.debug("Token granted: {}", token);
        return token;
    }
}
