package com.astus.astus.model;

//import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Contact {
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Id
   private Long id;

   private String name;
   private String email;
   private String phone;

   public String getName() { return this.name ;}
   public String getEmail() { return this.email ;}
   public String getPhone() { return this.phone ;}
   

   public void setName(String name) { this.name=name ;}
   public void setEmail(String email) { this.email=email ;}
   public void setPhone(String phone) { this.phone=phone;}
}