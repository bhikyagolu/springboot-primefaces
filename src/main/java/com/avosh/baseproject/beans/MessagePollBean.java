/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.beans;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("request")
public class MessagePollBean extends MessageBean{
    private static final Logger log = Logger.getLogger(MessagePollBean.class);


    private Long unreadMessageCount;


    public Long getUnreadMessageCount() {
        return unreadMessageCount;
    }

    public void updateMessageCounter(){
        unreadMessageCount =  service.countUnreadMessage();
    }


}
