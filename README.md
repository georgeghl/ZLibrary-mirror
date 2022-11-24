# **zlib-master**

**A spring-boot  +  Thymeleaf  + MySQL8.0 based zlib mirror search website.**

## Release Note

Current Version: 0.0.1    Release Date: 20221124

## Dependence

1. MySQL8.0
2. OpenJDK11

## How to deploy?

### 0. Restore Database

Create a MySQL8.0 database named `zlib`, and run the SQL scripts in `\MySQL_Database_File` to restore table `book`.

### 1. Run on Windows-based server

A. Specify your MySQL server IP address, port, username and password in `\spring-boot_Project\mirror\src\main\resources\application.yml`. Or you can also modify `\Docker_Build_File_And_Run_Shell\run_v0_0_1.cmd` to specify the parameters above.

B. Then run `mvn package` in `\spring-boot_Project\mirror`.

C. Copy the generated jar file to `\Docker_Build_File_And_Run_Shell`

D. Run `run_v0_0_1.cmd`. 

### 2. Run on Linux-based docker server

A. Specify your MySQL server IP address, port, username and password in `\spring-boot_Project\mirror\src\main\resources\application.yml`.

B. Then run `mvn package` in `\spring-boot_Project\mirror`.

C. Copy the generated jar file to `\Docker_Build_File_And_Run_Shell`

D. Run `sudo bash ./buildDockerImage.sh`, and `sudo docker images` to see whether the docker image had been generated.

E. Run `sudo docker run -itd --name zlib_default -p 80:8080 zlib_mirror:1.0` to start a container. You can also specify your own exposed-port by alter the `-p 80:8080` parameter above.