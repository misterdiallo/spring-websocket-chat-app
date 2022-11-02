-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Nov 02, 2022 at 08:09 PM
-- Server version: 5.7.34
-- PHP Version: 7.4.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `chat_app`
--

-- --------------------------------------------------------

--
-- Table structure for table `conversation`
--

CREATE TABLE `conversation` (
  `id` bigint(20) NOT NULL,
  `created_at` datetime NOT NULL,
  `name_conversation` varchar(255) NOT NULL,
  `update_at` datetime DEFAULT NULL,
  `creator_user_conversation` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `group_message`
--

CREATE TABLE `group_message` (
  `id` bigint(20) NOT NULL,
  `created_at` datetime NOT NULL,
  `message_body_group` text NOT NULL,
  `send_time_message_group` datetime NOT NULL,
  `update_at` datetime DEFAULT NULL,
  `group_id` bigint(20) NOT NULL,
  `send_user_message_group` bigint(20) NOT NULL,
  `type_message_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `group_table`
--

CREATE TABLE `group_table` (
  `id` bigint(20) NOT NULL,
  `created_at` datetime NOT NULL,
  `description_group` text,
  `name_group` varchar(255) NOT NULL,
  `picture_group` text,
  `update_at` datetime DEFAULT NULL,
  `conversation_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `simple_message`
--

CREATE TABLE `simple_message` (
  `id` bigint(20) NOT NULL,
  `body_message_simple` varchar(255) NOT NULL,
  `created_at` datetime NOT NULL,
  `parent_message_id` varchar(255) DEFAULT NULL,
  `type_of_type_message` varchar(255) NOT NULL,
  `update_at` datetime DEFAULT NULL,
  `conversation_id` bigint(20) NOT NULL,
  `receiver_user_id` bigint(20) NOT NULL,
  `sender_user_id` bigint(20) NOT NULL,
  `type_message_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `type_message`
--

CREATE TABLE `type_message` (
  `id` bigint(20) NOT NULL,
  `created_at` datetime NOT NULL,
  `name_type_message` varchar(255) NOT NULL,
  `type_of_type_message` varchar(255) NOT NULL,
  `update_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `created_at` datetime NOT NULL,
  `creator_user_conversation` varchar(255) NOT NULL,
  `email_user` varchar(255) NOT NULL,
  `first_open_id_user` varchar(255) DEFAULT NULL,
  `name_user` varchar(255) DEFAULT NULL,
  `password_user` text,
  `phone_user` varchar(255) NOT NULL,
  `photo_user` text,
  `second_open_id_user` varchar(255) DEFAULT NULL,
  `third_open_id_user` varchar(255) DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `username` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `user_group`
--

CREATE TABLE `user_group` (
  `id` bigint(20) NOT NULL,
  `alias_user_group` varchar(255) NOT NULL,
  `created_at` datetime NOT NULL,
  `update_at` datetime DEFAULT NULL,
  `group_id` bigint(20) NOT NULL,
  `user_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `conversation`
--
ALTER TABLE `conversation`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKng9quklofekn3tgv33nygp9kx` (`creator_user_conversation`);

--
-- Indexes for table `group_message`
--
ALTER TABLE `group_message`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKt0wynm5k21v3j1wqkoucc463i` (`group_id`),
  ADD KEY `FKsi9mu00s042rmfgx59pe9uwfq` (`send_user_message_group`),
  ADD KEY `FK5k2uqwq8qgsf1af1jfyck4q5` (`type_message_id`);

--
-- Indexes for table `group_table`
--
ALTER TABLE `group_table`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKmn7krjguyv3reu5xre1tkqsp0` (`conversation_id`);

--
-- Indexes for table `simple_message`
--
ALTER TABLE `simple_message`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_6wk5ev9ock6j79sibwtkkejje` (`type_of_type_message`),
  ADD KEY `FKnudddwrthdho19wekrk88n26n` (`conversation_id`),
  ADD KEY `FK7n39rwne293utr4b3ubm8wuoc` (`receiver_user_id`),
  ADD KEY `FKlab8gqfedx1rq7fai9wevwinr` (`sender_user_id`),
  ADD KEY `FKi4vcgu25wukufytgw5k0u40k0` (`type_message_id`);

--
-- Indexes for table `type_message`
--
ALTER TABLE `type_message`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_binp3aqocbcgxgxa3xa1qjd18` (`type_of_type_message`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_kq63yk7wimr36fle6dn16r0x8` (`email_user`),
  ADD UNIQUE KEY `UK_9ydsedk0pi4n58qi2cvu4fk7o` (`phone_user`),
  ADD UNIQUE KEY `UK_sb8bbouer5wak8vyiiy4pf2bx` (`username`),
  ADD UNIQUE KEY `UK_maex01yfx6s049ax6694va0fu` (`first_open_id_user`),
  ADD UNIQUE KEY `UK_qfh1hth04c3me4470tqa16h4q` (`second_open_id_user`),
  ADD UNIQUE KEY `UK_8mdlf0erskxmss7gnn79iulok` (`third_open_id_user`);

--
-- Indexes for table `user_group`
--
ALTER TABLE `user_group`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKqm96uvno3nhkbplft6mytlos` (`group_id`),
  ADD KEY `FK1c1dsw3q36679vaiqwvtv36a6` (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `conversation`
--
ALTER TABLE `conversation`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `group_message`
--
ALTER TABLE `group_message`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `group_table`
--
ALTER TABLE `group_table`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `simple_message`
--
ALTER TABLE `simple_message`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `type_message`
--
ALTER TABLE `type_message`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user_group`
--
ALTER TABLE `user_group`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `conversation`
--
ALTER TABLE `conversation`
  ADD CONSTRAINT `FKng9quklofekn3tgv33nygp9kx` FOREIGN KEY (`creator_user_conversation`) REFERENCES `user` (`id`);

--
-- Constraints for table `group_message`
--
ALTER TABLE `group_message`
  ADD CONSTRAINT `FK5k2uqwq8qgsf1af1jfyck4q5` FOREIGN KEY (`type_message_id`) REFERENCES `type_message` (`id`),
  ADD CONSTRAINT `FKsi9mu00s042rmfgx59pe9uwfq` FOREIGN KEY (`send_user_message_group`) REFERENCES `user_group` (`id`),
  ADD CONSTRAINT `FKt0wynm5k21v3j1wqkoucc463i` FOREIGN KEY (`group_id`) REFERENCES `group_table` (`id`);

--
-- Constraints for table `group_table`
--
ALTER TABLE `group_table`
  ADD CONSTRAINT `FKmn7krjguyv3reu5xre1tkqsp0` FOREIGN KEY (`conversation_id`) REFERENCES `conversation` (`id`);

--
-- Constraints for table `simple_message`
--
ALTER TABLE `simple_message`
  ADD CONSTRAINT `FK7n39rwne293utr4b3ubm8wuoc` FOREIGN KEY (`receiver_user_id`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `FKi4vcgu25wukufytgw5k0u40k0` FOREIGN KEY (`type_message_id`) REFERENCES `type_message` (`id`),
  ADD CONSTRAINT `FKlab8gqfedx1rq7fai9wevwinr` FOREIGN KEY (`sender_user_id`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `FKnudddwrthdho19wekrk88n26n` FOREIGN KEY (`conversation_id`) REFERENCES `conversation` (`id`);

--
-- Constraints for table `user_group`
--
ALTER TABLE `user_group`
  ADD CONSTRAINT `FK1c1dsw3q36679vaiqwvtv36a6` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `FKqm96uvno3nhkbplft6mytlos` FOREIGN KEY (`group_id`) REFERENCES `group_table` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
