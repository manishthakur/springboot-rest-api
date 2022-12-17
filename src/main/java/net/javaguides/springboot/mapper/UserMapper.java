package net.javaguides.springboot.mapper;

import net.javaguides.springboot.dto.UserDto;
import net.javaguides.springboot.entity.User;

public class UserMapper {

    public static UserDto mapToUserDto(User user) {

        UserDto userDto = new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getFirstName(),
                user.getEmail()
        );
        return userDto;
    }

    public static User mapToUser(UserDto userDto) {

        User user = new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getFirstName(),
                userDto.getEmail()
        );
        return user;
    }
}
