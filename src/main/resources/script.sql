CREATE TABLE IF NOT EXISTS employee (
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
first_name varchar(255) NOT NULL,
last_name varchar(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS client (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    client_name varchar(255) NOT NULL,
    client_email varchar(255),
    client_phone varchar(50)
);

CREATE TABLE IF NOT EXISTS schedule (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    employee_id int,
    start_datetime timestamp,
    end_datetime timestamp,
    FOREIGN KEY (employee_id) REFERENCES client(id)
);

CREATE TABLE IF NOT EXISTS appointment (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    date_created TIMESTAMP,
    employee_created int,
    client_id int,
    start_datetime timestamp,
    end_datetime timestamp,
    price_full DECIMAL(10,2),
    cancelled boolean,
    cancellation_reason VARCHAR,
    FOREIGN KEY (employee_created) REFERENCES employee(id),
    FOREIGN KEY (client_id) REFERENCES client(id)
);

INSERT INTO client(client_name, client_email, client_phone) VALUES ('Jasdeep', 'jasdeepaulakh@gmail.com', '123');
INSERT INTO employee(first_name, last_name) VALUES ('John', 'Smith');