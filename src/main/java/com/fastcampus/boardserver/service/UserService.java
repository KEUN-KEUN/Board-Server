package com.fastcampus.boardserver.service;

import com.fastcampus.boardserver.dto.UserDTO;

public interface UserService {

    void register(UserDTO userProfile);

    UserDTO login(String id, String password);

    boolean isDuplicatedId(String Id);

    UserDTO getUserInfo(String userID);

    void updatePassword(String id, String beforePassword, String afterPassword);

    void deleteId(String id, String password);

}
