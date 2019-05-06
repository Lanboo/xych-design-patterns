package com.xych.prototype.mapstruct.entity;

import java.io.Serializable;
import java.math.BigInteger;

import lombok.Data;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigInteger id;
    private String name;
    private String sex;
    private String nickName;
    private long amount;
}