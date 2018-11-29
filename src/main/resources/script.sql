CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `first_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `client` (
  `id` int(11) NOT NULL,
  `client_email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `client_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `client_phone` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `schedule` (
  `id` int(11) NOT NULL,
  `end_datetime` date DEFAULT NULL,
  `start_datetime` date DEFAULT NULL,
  `employee_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKsodsj8c282vagj766ll9g8tdc` (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `appointment` (
  `id` int(11) NOT NULL,
  `cancellation_reason` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cancelled` bit(1) DEFAULT NULL,
  `date_created` datetime DEFAULT NULL,
  `end_datetime` datetime DEFAULT NULL,
  `price_full` double DEFAULT NULL,
  `start_datetime` datetime DEFAULT NULL,
  `client_id` int(11) DEFAULT NULL,
  `employee_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `client_id` (`client_id`),
  KEY `employee_id` (`employee_id`),
  CONSTRAINT `appointment_ibfk_1` FOREIGN KEY (`client_id`) REFERENCES `client` (`id`),
  CONSTRAINT `appointment_ibfk_2` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
