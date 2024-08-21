package com.LRITechnologies.Ads_Site.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String fullName;
    private String username;
    private String password;
    private boolean isAccountNonExpired;
    private boolean isCredentialsNonExpired;
    private boolean isAccountNonLocked;
    private boolean isEnabled;

    @OneToMany(mappedBy = "user")
    private Set<UserRoleHasUser> userRoleHasUsers;

    @OneToMany(mappedBy = "user")
    private Set<UserHasAdvertisements> userHasAdvertisements;


    public User(String fullName, String username, String encode, boolean b, boolean b1, boolean b2, boolean b3, Object o, Object o1) {
        this.fullName = fullName;
        this.username = username;
        this.password = encode;
        this.isAccountNonExpired = true;
        this.isCredentialsNonExpired = true;
        this.isAccountNonLocked = true;
        this.isEnabled = true;
    }
}
