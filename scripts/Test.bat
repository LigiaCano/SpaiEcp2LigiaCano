@echo off
set workspace=C:\Users\Adan\workspace\SpaiEcp2LigiaCano
set PATH=%PATH%C:\Program Files\Java\jdk1.8.0_60\bin;C:\Users\Adan\Downloads\apache-maven-3.3.3-bin\apache-maven-3.3.3\bin
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_60
set M2_HOME=C:\Users\Adan\Downloads\apache-maven-3.3.3-bin\apache-maven-3.3.3
echo -----------------------------------------
echo .(C) MIW
echo -----------------------------------------
echo .
echo Workspace --- %workspace%
echo .
cd %workspace%
echo ============ mvn clean test (profile: develop) =======================================================
echo .
call mvn clean test
pause

