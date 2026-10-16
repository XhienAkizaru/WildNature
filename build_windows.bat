@echo off
setlocal
where java >nul 2>nul || (echo ERROR: Java not found. Install JDK 25 x64.& pause & exit /b 1)
java -version 2>&1 | findstr /C:"25" >nul
if errorlevel 1 (
  echo ERROR: This project targets Java 25. Select JDK 25 in JAVA_HOME/PATH.
  pause
  exit /b 1
)
where gradle >nul 2>nul || (echo ERROR: Gradle not found. Install Gradle 9.1.x and add it to PATH, or use IntelliJ IDEA Gradle integration.& pause & exit /b 1)
python scripts\validate_assets.py || exit /b 1
gradle --version || exit /b 1
gradle clean build --no-daemon
if errorlevel 1 (
  echo.
  echo BUILD FAILED. Copy the full error output when requesting help.
  pause
  exit /b 1
)
echo.
echo Build complete. JAR should be in build\libs\wildnature-1.0.0.jar
pause
