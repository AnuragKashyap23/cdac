DROP TABLE IF EXISTS user; 
DROP TABLE IF EXISTS product;

CREATE TABLE user(
    uid INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20),
    age INT
);

INSERT INTO user(name,age) VALUES
("Anil",30),("Mukesh",35),("Ramesh",40),("Suresh",45);

CREATE TABLE product(
    pid INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20),
    price INT
);

INSERT INTO product(name,price) VALUES
("Pen",30),("Pencil",5),("Book",40),("Eraser",5);


