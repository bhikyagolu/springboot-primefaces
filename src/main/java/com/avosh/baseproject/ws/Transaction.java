/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.ws;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ws")
public class Transaction {
    @PostMapping("/transaction")
    public void getTransaction(@RequestHeader("authorization") String token, @RequestBody String body){

    }
}
