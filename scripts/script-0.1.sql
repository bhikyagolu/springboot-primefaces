create schema AvDb collate utf8_general_ci COLLATE utf8_general_ci;

INSERT INTO `sec_role` (`id`, `role`, `title`, `create_date`) VALUES
    (1, 'ROLE_USER', 'title', '2022-07-27 17:05:10');

INSERT INTO `sec_role` (`id`, `role`, `title`, `create_date`) VALUES
    (2, 'ROLE_ADMIN', 'title', '2022-07-27 17:05:10');

INSERT INTO `sec_role` (`id`, `role`, `title`, `create_date`) VALUES
    (3, 'ROLE_SERVICE', 'title', '2022-07-27 17:05:10');

INSERT INTO `sec_user` (`id`, `name`, `family`, `gender`, `cellphone`, `phone`, `email`, `address`, `password`, `nationalcode`, `about`, `is_login`, `is_enable`, `last_login`, `create_date`, `update_date`, `token`, `iban`, `user_type`) VALUES
    (1, 'علیرضا', 'امیرخانی', 1, '09128922899', '88078696', 'amirkhany@gmail.com', 'تهران شهرک غرب بلوار دادمان', '$2a$10$JJSrmEr0yp2JYDdZHp9x9e.M3bSvrFg6GNKMucgiFrLrztO7R2DWi', '0079386474', 'یه متن درباره', 0, 1, '2022-07-27 17:04:55', '2022-07-27 17:04:55', '2022-07-27 17:04:55', NULL, 'IR2222222222222222222221', NULL);

INSERT INTO `sec_user_role` (`id`, `create_date`, `sec_user_id`, `sec_role_id`, `update_date`) VALUES
    (1, '2022-07-27 17:05:25', 1, 1, NULL);

INSERT INTO `sec_user_role` (`id`, `create_date`, `sec_user_id`, `sec_role_id`, `update_date`) VALUES
    (2, '2022-07-27 17:05:25', 1, 2, NULL);