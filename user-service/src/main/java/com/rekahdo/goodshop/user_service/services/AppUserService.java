package com.rekahdo.goodshop.user_service.services;

import com.rekahdo.goodshop.user_service.entities.AppUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppUserService {

    public List<AppUser> getAll() {
        return List.of(
                new AppUser("Rekahdo", "rekPass"),
                new AppUser("Johnny", "johPass"),
                new AppUser("Mariana", "marPass")
        );
    }

}
