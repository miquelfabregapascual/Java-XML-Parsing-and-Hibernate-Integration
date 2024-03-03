# Java-XML-Parsing-and-Hibernate-Integration - By Miquel
This repository showcases a Java application, ClashJabX, adeptly integrating XML parsing via JAXB and Hibernate ORM for seamless database management.

## Overview
This project demonstrates Java XML parsing and Hibernate integration. It includes functionality to parse XML data representing Clash Royale player information and their respective cards using JAXB. Additionally, it showcases Hibernate integration for database operations related to player and game data.

## Functionality

1. **Parsing XML Data**:
   - Utilizes JAXB to parse XML data representing Clash Royale player information and their cards.
   - Main classes involved: `Clashjabx.java`, `ClashType.java`, `JugadorType.java`, `CartaType.java`, `ClanType.java`.

2. **Hibernate Integration**:
   - Demonstrates Hibernate configuration and integration for performing CRUD operations on player and game data.
   - Includes entity classes for players and game data, DAO classes for database operations, and utility classes for Hibernate setup.
   - Main classes involved: `HibernateUtil.java`, `DaoGeneric.java`, `jugador.java`, `partida.java`.

3. **GUI (Work-in-progress)**:
   - GUI functionality using exported packages from NetBeans.
   - Provides an interface to interact with player and game data.
   - Main classes involved: GUI classes (yet to be implemented).

## Features

- **XML Data Parsing**: Parse XML data to retrieve player and game information.
- **Hibernate Database Operations**: Perform CRUD operations on player and game data using Hibernate.
- **GUI Interface**: Interact with player and game data through a graphical user interface (GUI).

## Screenshots (Work-in-progress)

### 1. GUI Interface (WIP)

![GUI Interface](/Images/displayGui.png)

- This screenshot showcases the GUI interface for interacting with player and game data (work-in-progress).

## Dependencies

- Java Development Kit (JDK)
- JAXB API (Included in JDK)
- Hibernate Framework
- PostgreSQL Database (or other compatible database)
- NetBeans (for GUI development, if applicable)

## Usage

1. Clone the repository.
2. Import the project into your preferred Java IDE (e.g., NetBeans).
3. Ensure the necessary dependencies are configured in your IDE.
4. Run the project to execute the XML parsing, Hibernate database operations, and GUI (if implemented).

## Structure

- `generated`: Contains JAXB-generated classes based on the XML schema.
- `model`: Contains entity classes representing players and game data.
- `dao`: Contains DAO (Data Access Object) classes for Hibernate database operations.
- `util`: Contains utility classes for Hibernate setup and configuration.
- `Images`: Directory for storing project-related images.

## Running the Code

- Ensure all dependencies are correctly configured in your development environment.
- Run the main classes or GUI classes to execute the desired functionality.
- For GUI functionality, ensure proper setup and integration with the existing project structure.
- Some Imports might be outdated
