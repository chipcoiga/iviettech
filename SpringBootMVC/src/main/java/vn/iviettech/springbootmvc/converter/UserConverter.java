package vn.iviettech.springbootmvc.converter;

import vn.iviettech.springbootmvc.domain.User;
import vn.iviettech.springbootmvc.entity.UserEntity;

public class UserConverter {
    public static UserEntity toEntity(User user) {
        UserEntity entity = new UserEntity();
        entity.setName(user.getName());
        entity.setAge(user.getAge());
        return entity;
    }
}
