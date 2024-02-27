# JobListing Backend Server

This repository contains the backend server for the JobListing application. The frontend part of the application can be found [here](https://github.com/navinreddy20/UISpringMongodb).

## Overview

The JobListing application is built using Spring Boot and integrated with a MongoDB server. With this backend server, users can perform various operations such as adding job postings, searching for job postings, and listing all job postings.

## Features

- **Add Job Postings**: Users can add new job postings to the system.
- **Search Job Postings**: Users can search for job postings based on different criteria.
- **List All Job Postings**: Users can view a list of all available job postings.

## Technologies Used

- **Spring Boot**: Framework for building the backend server.
- **MongoDB**: NoSQL database used for storing job postings.
- **Java**: Programming language used for backend development.

## How to Run

1. Clone the repository: `git clone https://github.com/PremAmanchi/JobListingBackend.git`
2. Navigate to the project directory: `cd JobListingBackend`
3. Navigate to the `src/main/resources` directory.
4. Create a copy of the sample environment file: `cp .env.example .env`
5. Open the `.env` file and add the credentials for the MongoDB server.
6. Navigate back to the project root directory: `cd ../../`
7. Build the project: `./mvnw clean install`
8. Run the application: `./mvnw spring-boot:run`
9. Access the backend server at `http://localhost:8080`

## Contributors

- [Prem Kumar Amanchi](https://github.com/PremAmanchi)

