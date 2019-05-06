package com.xych.prototype.mapstruct.mapmappper;

import java.util.List;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.xych.prototype.mapstruct.dto.UserDto;
import com.xych.prototype.mapstruct.entity.User;

@Mapper
public interface UserMapMapper {
    @Mappings(
        { @Mapping(
            target = "amount",
            expression = "java( user.getAmount()/1000 )"
        ), @Mapping(
            target = "nickName",
            expression = "java( user.getNickName() == null || user.getNickName().length() == 0?user.getName() : user.getNickName() )"
        ) }
    )
    UserDto toDto(User user);

    @InheritConfiguration
    List<UserDto> toDtoList(List<User> users);
}
