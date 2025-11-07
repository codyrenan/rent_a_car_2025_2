package br.com.unipaulistana.rentacar.backend.service;

import br.com.unipaulistana.rentacar.backend.datasource.repository.UserRepository;
import br.com.unipaulistana.rentacar.backend.domainmodel.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;



    public List<User> findAll(){
        return this.userRepository.findAll();
    }

    public User findById(final Long Id){
        if( id == null )
            return null;
        return this.userRepository.findById(id);
    }


    public User save(User user) {
        if (user == null)
            return null;
        return userRepository.save(user);
    }
}