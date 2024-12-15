-- Roles
INSERT INTO roles (role_id, name) VALUES (1, 'ADMIN');
INSERT INTO roles (role_id, name) VALUES (2, 'DOCTOR');

-- Users
INSERT INTO users (first_name, last_name, username, password, enabled) VALUES ('Admin', 'Adminovich', 'admin', '$2a$12$VsZT.hoqqNvrJ0ylr1JuP.Y7UEW4QkDKyWot.FTRCzA9Tc4k9B4dy', '1');
INSERT INTO users (first_name, last_name, username, password, enabled) VALUES ('John', 'Doe', 'johndoe', '$2a$12$VsZT.hoqqNvrJ0ylr1JuP.Y7UEW4QkDKyWot.FTRCzA9Tc4k9B4dy', '1');
INSERT INTO users (first_name, last_name, username, password, enabled) VALUES ('Jane', 'Smith', 'janesmith', '$2a$12$VsZT.hoqqNvrJ0ylr1JuP.Y7UEW4QkDKyWot.FTRCzA9Tc4k9B4dy', '1');
INSERT INTO users (first_name, last_name, username, password, enabled) VALUES ('Emily', 'Johnson', 'emilyj', '$2a$12$VsZT.hoqqNvrJ0ylr1JuP.Y7UEW4QkDKyWot.FTRCzA9Tc4k9B4dy', '1');
INSERT INTO users (first_name, last_name, username, password, enabled) VALUES ('Michael', 'Brown', 'michaelb', '$2a$12$VsZT.hoqqNvrJ0ylr1JuP.Y7UEW4QkDKyWot.FTRCzA9Tc4k9B4dy', '1');

-- Users and Roles
INSERT INTO users_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO users_roles (user_id, role_id) VALUES (2, 2);
INSERT INTO users_roles (user_id, role_id) VALUES (3, 2);
INSERT INTO users_roles (user_id, role_id) VALUES (4, 2);
INSERT INTO users_roles (user_id, role_id) VALUES (5, 2);

-- Laboratories
INSERT INTO laboratory (id, lab_name, address, phone) VALUES (1, 'Central Lab', '123 Main St', '070000001');
INSERT INTO laboratory (id, lab_name, address, phone) VALUES (2, 'BioTech Lab', '45 Elm St', '070000002');
INSERT INTO laboratory (id, lab_name, address, phone) VALUES (3, 'Precision Lab', '67 Oak St', '070000003');
INSERT INTO laboratory (id, lab_name, address, phone) VALUES (4, 'Advanced Diagnostics', '89 Maple St', '070000004');
INSERT INTO laboratory (id, lab_name, address, phone) VALUES (5, 'HealthCare Lab', '101 Pine St', '070000005');
INSERT INTO laboratory (id, lab_name, address, phone) VALUES (6, 'MediLab', '23 Birch St', '070000006');
INSERT INTO laboratory (id, lab_name, address, phone) VALUES (7, 'VitalPath Lab', '78 Cedar St', '070000007');
INSERT INTO laboratory (id, lab_name, address, phone) VALUES (8, 'FutureLab', '36 Willow St', '070000008');

-- Doctors
INSERT INTO doctors (id, first_name, last_name, specialty, address, mobile_number) VALUES (1, 'Emmie', 'Baldick', 'Therapist', '79 Garrison Way', '077777701');
INSERT INTO doctors (id, first_name, last_name, specialty, address, mobile_number) VALUES (2, 'Corinne', 'Limpkin', 'Pediatrician', '593 Debs Lane', '080788802');
INSERT INTO doctors (id, first_name, last_name, specialty, address, mobile_number) VALUES (3, 'Abe', 'Bourdel', 'Neurologist', '98 Center Rd', '055055503');
INSERT INTO doctors (id, first_name, last_name, specialty, address, mobile_number) VALUES (4, 'Meir', 'Labrum', 'Dermatologist', '5 MapleWood Ave', '077777704');
INSERT INTO doctors (id, first_name, last_name, specialty, address, mobile_number) VALUES (5, 'Elaina', 'Hardin', 'Psychiatrist', '53 Independence Blvd', '077777705');
INSERT INTO doctors (id, first_name, last_name, specialty, address, mobile_number) VALUES (6, 'Samuel', 'Evans', 'Cardiologist', '12 Spring St', '077777706');
INSERT INTO doctors (id, first_name, last_name, specialty, address, mobile_number) VALUES (7, 'Jessica', 'White', 'Endocrinologist', '34 Summer St', '077777707');
INSERT INTO doctors (id, first_name, last_name, specialty, address, mobile_number) VALUES (8, 'Oliver', 'Green', 'Oncologist', '56 Fall St', '077777708');
INSERT INTO doctors (id, first_name, last_name, specialty, address, mobile_number) VALUES (9, 'Sophia', 'Lee', 'Ophthalmologist', '78 Winter St', '077777709');
INSERT INTO doctors (id, first_name, last_name, specialty, address, mobile_number) VALUES (10, 'Benjamin', 'Miller', 'Orthopedic', '90 Meadow Lane', '077777710');