CREATE TABLE building(
  id INT,
  owner_name VARCHAR(100),
  address VARCHAR(100),
  building_type_id INT,
  contact_number VARCHAR(100),
  email_address VARCHAR(100),
  PRIMARY KEY(id),
  FOREIGN KEY( building_type_id) REFERENCES building_type(id)
);