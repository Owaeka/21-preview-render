package br.com.brunorodrigo.controller;

import br.com.brunorodrigo.service.PreviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/preview")
@RequiredArgsConstructor
public class PreviewController {
    private final PreviewService previewService;

    @GetMapping
    public ResponseEntity<String> helloRender() {
        final String response = "Hello, render";

        return ResponseEntity.ok(response);
    }
}
