package com.example.springboot3jwtauthenticationserver.models;

import jakarta.persistence.*;
import lombok.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@ToString
@Getter
@Setter
public class User implements UserDetails {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

   String firstName;
   String lastName;
   @Column(unique = true)
   String email;
   String password;
   LocalDateTime createdAt;
   LocalDateTime updatedAt;
   @Enumerated(EnumType.STRING)
   Role role;
//   @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch=FetchType.EAGER)
//   private List<Pets> pets;




    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }


    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


}
