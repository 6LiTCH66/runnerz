package ilja.spring.runnerz.user.auth;


import ilja.spring.runnerz.user.auth.dto.SigninRequest;
import ilja.spring.runnerz.user.auth.dto.SignupRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("signup")
    public ResponseEntity<AuthenticationResponse> signup(@RequestBody SignupRequest request){
        return ResponseEntity.ok(this.authenticationService.signup(request));
    }

    @PostMapping("signin")
    public ResponseEntity<AuthenticationResponse> signin(@RequestBody SigninRequest request){
        return ResponseEntity.ok(this.authenticationService.authenticate(request));
    }
}
