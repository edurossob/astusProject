package com.astus.astus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.astus.astus.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {}
