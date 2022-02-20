package com.example.emlakburada.repository;



import com.example.emlakburada.enums.UserType;
import com.example.emlakburada.mapper.AdvertMapper;
import com.example.emlakburada.model.Advert;
import com.example.emlakburada.model.RealEstate;
import com.example.emlakburada.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
@RequiredArgsConstructor
public class AdvertRepository {
    private final AdvertMapper advertMapper;
    private final UserRepository userRepository;
    private final RealEstateRepository realEstateRepository;
    /*******************************************************************AUTOMATIC CREATE************************************************************************************/

    List<Advert> advertList = new ArrayList<>();

    public List<Advert> createAdvertList(int advertSize){
        for(int i=1;i<advertSize+1;i++){
            Advert advert = createAdvert(i);
            advertList.add(advert);
        }
        return advertList;
    }

    public Advert createAdvert(int i){
        Advert advert = new Advert();
        advert.setAdvertNo(randomNumber(7000));
        advert.setId((long) randomNumber(20000));
        advert.setRealEstates(realEstateRepository.createRealEstate(1));
        advert.setActive(true);
        advert.setDescription("Sahibinden Lux Kiralik Daire !");
        advert.setTitle("Istanbul Maltepe Sifir Daire");
        advert.setDuration(new Date());
        advert.setPutFordward(randomNumber(200));
        advert.setReviewed(userRepository.createUserList(5));
        int randomNumber = randomNumber(100);
        advert.setOwner(userRepository.createUser(String.valueOf(randomNumber),randomNumber % 2 == 0 ? UserType.INSTITUTIONAL : UserType.INDIVIDUAL));
//        System.out.println(advert);
        return advert;
    }


    public int randomNumber(int number){
        return 1 + new Random().nextInt(number);
    }

    /*********************************************************************************METHOD OVERLOADING******************************************************************************************************/
    public Advert createAdvert(RealEstate realEstate, String description, String title,
                               Date duration, int putFordward, List<User> reviewed, User owner, Set<User> users){
        Advert advert = new Advert();
        advert.setAdvertNo(randomNumber(7000));
        advert.setId((long) randomNumber(20000));
        advert.setRealEstates(realEstate);
        advert.setActive(true);
        advert.setDescription(description);
        advert.setTitle(title);
        advert.setDuration(duration);
        advert.setPutFordward(putFordward);
        advert.setReviewed(reviewed);
        advert.setOwner(owner);
//        System.out.println(advert);
        return advert;
    }

    public List<Advert> getAllList() {
        return advertList;
    }

    public Advert create(Advert advert) {
        advertList.add(advert);
        return advert;
    }

    public Advert getAdvertByAdvertNo(Integer advertNo){
        return advertList.stream().filter(i->i.getAdvertNo().equals(advertNo)).findAny().orElse(new Advert());
    }
}
