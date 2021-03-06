package com.gachon_food.dto;

import lombok.*;

/*
회원정보 DTO
 */
public class AccountDto {
//    private int userId;
//    private String name;
//    private String email;
//    private String password;
//    private String major;
//    private String deleteYN;

    @Getter
    @Setter
    @NoArgsConstructor
    public static class AccountRequestDto{
        private String email;
        private String password;
        private String password_confirm;
        private String major;
        private String name;
        @Builder
        public AccountRequestDto(String email, String password, String password_confirm){
            this.email = email;
            this.password = password;
            this.password_confirm = password_confirm;
            this.major = major;
            this.name = name;
        }
    }
}
