/**用户表*/
CREATE TABLE `say_user`(
   `id` INT NOT NULL AUTO_INCREMENT,
   `openId` VARCHAR(100) NOT NULL,
   `userImg` VARCHAR(100),
   `userName` VARCHAR(100),
   `pwd` VARCHAR(20),
   `userLevel` INT,
   `userType` VARCHAR(10),
   `createTime` DATE,
   PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

/**文章say*/
CREATE TABLE `say_essay`(
   `id` INT NOT NULL AUTO_INCREMENT,
   `userId` INT NOT NULL,
   `content` text,
   `sayName` VARCHAR(100),
   `attachCode` VARCHAR(20) COMMENT '附带资源',
   `commentSum` INT COMMENT '评论数',
   `upSum` INT COMMENT '点赞数',
   `essayType` VARCHAR(10),
   `createTime` DATE,
   PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

/**文章附带资源*/
CREATE TABLE `say_attach`(
   `id` INT NOT NULL AUTO_INCREMENT,
   `attachName` VARCHAR(100),
   `attachCode` VARCHAR(20) NOT NULL COMMENT '资源Code',
   `url` VARCHAR(100),
   `attachType` VARCHAR(10),
   `createTime` DATE,
   PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
ALTER TABLE `say_attach` ADD INDEX index_name ( `attachCode` );

/**评论*/
CREATE TABLE `say_comment`(
   `id` INT NOT NULL AUTO_INCREMENT,
   `essayId` INT NOT NULL,
   `userId` INT NOT NULL,
   `upSum` INT COMMENT '点赞数',
   `content` VARCHAR(100),
   `createTime` DATE,
   PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
