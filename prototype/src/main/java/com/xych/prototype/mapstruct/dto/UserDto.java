package com.xych.prototype.mapstruct.dto;

import java.io.Serializable;
import java.math.BigInteger;

import lombok.Data;

@Data
public class UserDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigInteger id;
    private String name;
    private String sex;
    private String nickName;
    private long amount;
}
