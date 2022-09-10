/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.enums;

public enum MessageTypeEnum {
    INSTANT_MESSAGE_SENT(1,"INSTANT_MESSAGE_SENT"),
    INSTANT_MESSAGE_RECEIVED(2,"INSTANT_MESSAGE_RECEIVED"),
    SMS(3,"SMS");

    private Integer type;
    private String description;

    MessageTypeEnum(Integer type, String description) {
        this.type = type;
        this.description = description;
    }

    public static String valueByCode(Integer code) {
        for (MessageTypeEnum typeEnum : MessageTypeEnum.values()) {
            if(typeEnum.getType() == code){
                return typeEnum.description;
            }
        }
        return null;
    }

    public Integer getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
