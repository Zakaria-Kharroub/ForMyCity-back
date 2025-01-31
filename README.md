# ForMyCity - Platform for Urban Problem Reporting and Tracking

## Project Overview
**ForMyCity** is an online platform that facilitates communication between citizens and local authorities for reporting urban issues and tracking progress. It encourages community engagement by providing a centralized, digital solution that improves interactions and optimizes processes.

---

![Thumbnail 1](https://github.com/Zakaria-Kharroub/ForMyCity-back/blob/d4ac62457ae8e519f94b8bcbb449093f7b8e7aa2/formycity.webp)

---
## Problem Statement
Currently, administrative processes and communications with local authorities are fragmented, limiting effectiveness and traceability. Users face challenges in quickly accessing necessary information or services, leading to delays in issue resolution.

## Proposed Solution
ForMyCity provides a centralized digital platform that simplifies and enhances the interactions between citizens and local authorities. The platform enables efficient management of complaints and projects with a robust architecture and intuitive features.

## Key Features

### 1. User Management
- **Create, update, and delete user accounts.**
- Assign specific roles (Admin, Responsible, Citizen, Local Authority).
- Role-based authentication and authorization.

### 2. Task and Project Management
- Create and track projects/tasks by different roles.
- Notification system for concerned users.
- Validation system by local authorities.

### 3. Interaction with Local Authorities
- A dedicated interface for local authorities to manage user requests.
- Track decisions taken by local authorities.
- Maintain a history and traceability of interactions.

### 4. Reporting and Statistics
- Generate reports on user activities.
- Visualize ongoing and completed projects.
- Analyze the performance of local authorities and responsible individuals.

### 5. Security
- Role-based access control for securing system resources.
- Audit trail for critical actions to ensure traceability.

### 6. User Interface
- An intuitive and accessible interface for all user types.
- Multilingual support (e.g., French, Arabic).

## User Stories

### 1. User Account Management
- As a citizen, I can create an account and log in to ForMyCity to report urban issues.
- As a citizen, I can modify my personal details, including my location, to ensure that my complaints are accurate.

### 2. Complaint Management
- As a citizen, I can submit a complaint by specifying the issue, its location, and uploading a photo for better resolution.
- As a responsible person, I can receive citizen complaints and assign them to the appropriate local authorities.
- As a responsible person, I can track the status of complaints (resolved, ongoing, or unresolved).
- As a responsible person, I can block users who submit fraudulent or inappropriate complaints.
- As a local authority, I can view complaints assigned to me and take necessary actions.
- As a local authority, I can update the status of a complaint (completed, ongoing, or pending).

### 3. Statistics Management
- As a responsible person, I can view statistics for complaints in my city, such as the number of complaints by type and their status.
- As an administrator, I can view global statistics for all cities to analyze performance and identify specific needs.

### 4. User Role Management
- As a responsible person, I can:
  - Create accounts for local authorities.
  - Manage platform users, including updating or blocking inappropriate behavior.
- As an administrator, I can:
  - Create accounts for responsible persons, local authorities, and citizens.
  - Manage all accounts and have a comprehensive view of all platform users.
  - Access all complaints and their statuses regardless of location.

## Technologies

- **Backend:** Spring Boot
- **Frontend:** Angular
