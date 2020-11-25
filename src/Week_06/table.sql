CREATE TABLE `user` (
 `id` int  NOT NULL AUTO_INCREMENT COMMENT 'id',
 `name` varchar(20)  NOT NULL  COMMENT '昵称',
 `password` varchar(30)  NOT NULL  COMMENT '加密密码',
 `avatar` varchar(50)  NOT NULL  COMMENT '头像',
 `email` varchar(20)  NOT NULL  COMMENT '邮箱',
 `tel` bigint  NOT NULL  COMMENT '电话',
 `created` timestamp  NOT NULL DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间',
 `last_modified` timestamp  NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
 COMMENT '最后修改时间',
 PRIMARY KEY (`id`)) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8 COMMENT='';


 CREATE TABLE `brand_good` (
 `id` int  NOT NULL AUTO_INCREMENT COMMENT 'id',
 `name` varchar(30)  NOT NULL  COMMENT '商品名',
 `img_url` varchar(255)  NOT NULL  COMMENT '图片url',
 `price` float unsigned  NOT NULL  COMMENT '价格',
 `on_sale` bit  NOT NULL DEFAULT 0  COMMENT '上架or下架',
 `desc_url` varchar(255)  NOT NULL  COMMENT '详情页链接',
 `created` timestamp  NOT NULL DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间',
 `last_modified` timestamp  NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
 COMMENT '最后修改时间',
 PRIMARY KEY (`id`)) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8 COMMENT='';


CREATE TABLE `brand_good_order` (
 `id` bigint  NOT NULL  COMMENT 'id',
 `brand_good_id` bigint  NOT NULL  COMMENT '商品id',
 `user_id` bigint  NOT NULL  COMMENT '用户id',
 `price` float unsigned  NOT NULL  COMMENT '价格',
 `remarks` varchar(255)  NOT NULL  COMMENT '备注',
 `number` float  NOT NULL  COMMENT '总价',
 `created` timestamp  NOT NULL DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间',
 `last_modified` timestamp  NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
 COMMENT '最后修改时间',
 PRIMARY KEY (`id`)) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8 COMMENT='';

