
---

# Intergalactic Battlefront

Intergalactic Battlefront is a thrilling multiplayer spacecraft shooting game set in a futuristic universe where players engage in epic space battles. Players can choose from a variety of spacecraft, each with unique strengths and capabilities, and arm themselves with an array of missiles with distinct effects. The game includes solo and team-based modes, offering diverse gameplay experiences from one-on-one duels to large-scale planetary invasions.

## Getting Started

To get started with the project, you'll need to set up JavaFX on your machine and configure your environment. Follow the instructions below to set up JavaFX and run the project.

### Prerequisites

1. **Java Development Kit (JDK)**: Ensure you have JDK 17 or later installed. You can download it from the [Oracle JDK](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) or [OpenJDK](https://jdk.java.net/17/).

2. **Apache Maven**: Make sure Maven is installed. You can download it from [Apache Maven](https://maven.apache.org/download.cgi) and follow the installation instructions.

3. **JavaFX SDK**: You need the JavaFX SDK. Download it from [Gluon](https://gluonhq.com/products/javafx/) or use the version specified in `pom.xml`.

### Setting Up JavaFX

1. **Download JavaFX SDK**:
    - Download the JavaFX SDK appropriate for your operating system from the [Gluon website](https://gluonhq.com/products/javafx/).

2. **Configure JavaFX SDK**:
    - Extract the downloaded JavaFX SDK to a location of your choice.
    - Note the path to the `lib` directory within the JavaFX SDK.

3. **Configure Maven**:
    - Ensure the `pom.xml` in your project includes the JavaFX dependencies and the JavaFX Maven plugin. Here’s a sample configuration:

      ```xml
      <properties>
          <javafx.version>17.0.6</javafx.version>
          <maven.compiler.source>17</maven.compiler.source>
          <maven.compiler.target>17</maven.compiler.target>
      </properties>
 
      <dependencies>
          <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-controls</artifactId>
            <version>${javafx.version}</version>
          </dependency>
          <!-- Add other JavaFX dependencies as needed -->
      </dependencies>
 
      <build>
          <plugins>
            <plugin>
              <groupId>org.apache.maven.plugins</groupId>
              <artifactId>maven-compiler-plugin</artifactId>
              <version>3.11.0</version>
              <configuration>
                <source>${maven.compiler.source}</source>
                <target>${maven.compiler.target}</target>
              </configuration>
            </plugin>
            <plugin>
              <groupId>org.openjfx</groupId>
              <artifactId>javafx-maven-plugin</artifactId>
              <version>0.0.8</version>
              <configuration>
                <mainClass>com.yourcompany.intergalacticbattlewars.HelloApplication</mainClass>
              </configuration>
            </plugin>
          </plugins>
      </build>
      ```

### Running the Project

#### Using the Terminal

1. **Open Terminal**:
    - Navigate to the root directory of the project where `pom.xml` is located.

2. **Build the Project**:
    - Run `mvn clean install` to build the project and download the necessary dependencies.

3. **Run the Project**:
    - Execute `mvn javafx:run` to start the JavaFX application. This command uses the configuration defined in the `javafx-maven-plugin` to run the application.

#### Running the Application Directly

1. **Navigate to the `src/main/java` Directory**:
    - Ensure you are in the directory where `HelloApplication.java` is located.

2. **Compile the Application**:
    - Use the following command to compile the Java files:
      ```sh
      javac --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml -d out src/main/java/com/yourcompany/intergalacticbattlewars/HelloApplication.java
      ```

3. **Run the Application**:
    - Use the following command to run the application:
      ```sh
      java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml -cp out com.yourcompany.intergalacticbattlewars.HelloApplication
      ```

    - Replace `/path/to/javafx-sdk/lib` with the path to the `lib` directory of your JavaFX SDK.

### Troubleshooting

- **JavaFX Not Found**: Ensure that the `--module-path` option points to the correct location of the JavaFX SDK `lib` directory.

- **Dependencies Issue**: If Maven cannot resolve dependencies, try running `mvn clean install` again or check your `pom.xml` for correctness.

### Contribution

If you wish to contribute to the project, please follow the standard Git workflow:
1. Fork the repository.
2. Create a feature branch.
3. Make your changes.
4. Submit a pull request with a detailed description of the changes.

### License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
