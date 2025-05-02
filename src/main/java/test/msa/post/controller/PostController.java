package test.msa.post.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/posts")
@RestController
public class PostController {

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("/api/posts/health OK");
    }
}
