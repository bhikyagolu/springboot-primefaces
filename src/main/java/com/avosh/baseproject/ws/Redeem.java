/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.ws;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ws")
public class Redeem {
    @PostMapping("/redeem")
    public void setRedeemForUser(@RequestHeader("authorization") String token, @PathVariable String redeemCode){

    }
}
