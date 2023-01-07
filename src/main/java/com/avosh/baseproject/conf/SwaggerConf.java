/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.conf;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConf {
    @Bean
    GroupedOpenApi tokenApis() {
        return GroupedOpenApi.builder().group("Token").pathsToMatch("/**/token/**").build();
    }

    @Bean
    GroupedOpenApi newsApis() {
        return GroupedOpenApi.builder().group("News").pathsToMatch("/**/news/**").build();
    }

    @Bean
    GroupedOpenApi postApis() {
        return GroupedOpenApi.builder().group("Post").pathsToMatch("/**/post/**").build();
    }

    @Bean
    GroupedOpenApi profileApis() {
        return GroupedOpenApi.builder().group("Profile").pathsToMatch("/**/profile/**").build();
    }

    @Bean
    GroupedOpenApi redeemApis() {
        return GroupedOpenApi.builder().group("Redeem").pathsToMatch("/**/redeem/**").build();
    }

    @Bean
    GroupedOpenApi transactionApis() {
        return GroupedOpenApi.builder().group("Transaction").pathsToMatch("/**/transaction/**").build();
    }
    @Bean
    GroupedOpenApi accountApis() {
        return GroupedOpenApi.builder().group("Account").pathsToMatch("/**/account/**").build();
    }
    @Bean
    GroupedOpenApi billApis() {
        return GroupedOpenApi.builder().group("Bill").pathsToMatch("/**/bill/**").build();
    }
    @Bean
    GroupedOpenApi inquiryApis() {
        return GroupedOpenApi.builder().group("Inquiry").pathsToMatch("/**/inquiry/**").build();
    }
    @Bean
    GroupedOpenApi chargeApis() {
        return GroupedOpenApi.builder().group("Charge").pathsToMatch("/**/charge/**").build();
    }

}
