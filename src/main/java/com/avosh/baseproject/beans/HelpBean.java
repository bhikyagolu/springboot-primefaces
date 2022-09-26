/*******************************************************************************
* Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class HelpBean extends BaseBean{
    @Override
    public void save() {

    }

    @Override
    public void init() {

    }


    public void deleteRecord() {

    }
}
