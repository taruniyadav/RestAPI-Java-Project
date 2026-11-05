@echo off
set "JAVA_HOME=C:\Program Files\Java\jdk-21.0.12.1"
set "PATH=%JAVA_HOME%\bin;%PATH%"
call mvnw.cmd spring-boot:run
