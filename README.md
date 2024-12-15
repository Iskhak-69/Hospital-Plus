# HospitalPlus Application

## Overview

HospitalPlus is a comprehensive hospital management system that simplifies the management of patients, doctors, appointments, donors, and laboratories. It includes a backend implemented with Spring Boot.

---

## Features

- **User Management**: Registration and login for admins and doctors.
- **Patient Management**: Create, update, and delete patient records.
- **Appointment Scheduling**: Manage appointments for patients.
- **Donor Management**: Add and manage blood donors.
- **Laboratory Management**: Manage laboratory details and donors associated with labs.

---

## Technologies Used

### Backend:
- **Spring Boot**: REST API backend for the application.
- **Hibernate**: ORM for database management.
- **PostgreSQL**: Relational database.


---

## Project Structure

### Backend
- **Controllers**: Handles API routes and logic.
    - `LoginController`: Manages user authentication.
    - `RegistrationController`: Handles user registrations.
    - `DoctorController`: Manages doctor-specific operations.
- **Entities**: Maps objects to database tables.
    - `Patient`, `Doctor`, `Laboratory`, etc.
- **Services**: Business logic.
    - `DoctorService`, `PatientService`, etc.


## Getting Started

### Prerequisites
1. **Java 17** or later
2. **Maven** for dependency management
3. **PostgreSQL** for the database
4. **Node.js** (for frontend)

---

