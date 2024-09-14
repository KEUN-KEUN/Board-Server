package com.fastcampus.boardserver.dto;

import lombok.Data;

public class UserDTO {

    public enum Status{
        DEFAULT, ADMIN, DELETED
    }

    private int id;
    private String userId;
    private String password;
    private String nickname;
    private boolean isAdmin;
    private Data createTime;
    private boolean isWithDraw;
    private Status status;
}
