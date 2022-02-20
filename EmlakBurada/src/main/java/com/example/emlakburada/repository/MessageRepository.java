package com.example.emlakburada.repository;


import com.example.emlakburada.enums.UserType;
import com.example.emlakburada.mapper.MessageMapper;
import com.example.emlakburada.model.Message;
import com.example.emlakburada.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Repository
@RequiredArgsConstructor
public class MessageRepository {
    /*******************************************************************AUTOMATIC CREATE************************************************************************************/
    private final UserRepository userRepository ;
    private final MessageMapper messageMapper;

    List<Message> messageList = new ArrayList<>();
    public List<Message> createMessageList(int messageSize){
        for(int i=1;i<messageSize+1;i++){
            messageList.add(createMessage());
        }
        return messageList;
    }

    public Message createMessage(){
        Message message = new Message();
        message.setId((long) randomNumber(20000));
        message.setReceiver(userRepository.createUser(String.valueOf(randomNumber(200)), 1 + randomNumber(200)  % 2 == 0 ? UserType.INDIVIDUAL : UserType.INSTITUTIONAL));
        message.setSender(userRepository.createUser(String.valueOf(randomNumber(200)), 1 + randomNumber(200)  % 2 == 0 ? UserType.INSTITUTIONAL : UserType.INDIVIDUAL));
        message.setSeen(randomNumber(20) % 2 == 0);
        message.setTitle(String.valueOf(randomNumber(20)) + ". Kattaki eve bakmak istiyorum" );
        message.setReadDate(new Date());
        message.setSentDate(new Date());
        message.setContent("Pazarlik var mi ? ");
        System.out.println(message);
        return message;
    }


    public int randomNumber(int number){
        return 1 + new Random().nextInt(number);
    }

    /*******************************************************************************************************************************************************************/
    //method overloading
    public Message createMessage(User reciver, User sender, String content, String title, Boolean seen, Date sentDate, Date readDate){
        Message message = new Message();
        message.setId((long) randomNumber(20000));
        message.setReceiver(reciver);
        message.setSender(sender);
        message.setSeen(seen);
        message.setTitle(title);
        message.setReadDate(readDate);
        message.setSentDate(sentDate);
        message.setContent(content);
        return message;
    }



    public List<Message> getAllList() {
        return messageList;
    }

    public Message create(Message message) {
        messageList.add(message);
        return message;
    }

    public Message getMessageById(Long id){
        return messageList.stream().filter(i->i.getId().equals(id)).findAny().orElse(new Message());
    }
}
