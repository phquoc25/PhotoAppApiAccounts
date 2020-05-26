package com.qph.springmicorservices.photoapp.api.accounts.ui.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountsController {
    @GetMapping("/status/check")
    public String getStatus()
    {
        return "working";
    }
}
