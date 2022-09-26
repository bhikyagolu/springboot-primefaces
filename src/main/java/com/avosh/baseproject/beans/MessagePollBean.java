/*******************************************************************************
* Created by Alireza Amirkhani 2022
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
