package com.laye.controller;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.laye.entity.Contact;

@RestController
@RequestMapping(value = "/contacts/")
public class ContactController {
	
	private static final List<Contact> contacts = Lists.newArrayList(
           
    );

    @GetMapping
    @PreAuthorize("hasAuthority('read:contacts')")
    public List<Contact> getContacts() {
        return contacts;
    }

    @PostMapping
    @PreAuthorize("hasAuthority('add:contacts')")
    public void addContact(@RequestBody Contact contact) {
        contacts.add(contact);
    }
}
