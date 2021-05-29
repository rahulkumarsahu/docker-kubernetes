DROP TABLE IF EXISTS b2c_product;
DROP TABLE IF EXISTS b2c_brand;
DROP TABLE IF EXISTS b2c_color;
DROP TABLE IF EXISTS b2c_product_category;
  
CREATE TABLE b2c_brand (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);

  
CREATE TABLE b2c_color (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  code VARCHAR(5) NOT NULL
);

  
CREATE TABLE b2c_product_category (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);

  
CREATE TABLE b2c_product(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  quantity INT NOT NULL,
  size VARCHAR(5) NOT NULL,
  price INT NOT NULL,
  brand_id INT NOT NULL,
  foreign key (brand_id) references b2c_brand(id),
  color_id INT NOT NULL,
  foreign key (color_id) references b2c_color(id),
  product_category_id INT NOT NULL,
  foreign key (product_category_id) references b2c_product_category(id)
);