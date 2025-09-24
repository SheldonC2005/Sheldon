# Script to set Java 21 as the default Java version
# This script sets the environment variables for the current session

Write-Host "Setting Java 21 as default..." -ForegroundColor Green

# Set JAVA_HOME to Java 21
$env:JAVA_HOME = "C:\Program Files\Eclipse Adoptium\jdk-21.0.8.9-hotspot\"

# Update PATH to include Java 21 bin directory first
$env:PATH = $env:JAVA_HOME + "bin;" + $env:PATH

Write-Host "Environment variables set for current session:" -ForegroundColor Yellow
Write-Host "JAVA_HOME = $env:JAVA_HOME" -ForegroundColor Cyan
Write-Host ""

# Verify Java version
Write-Host "Current Java version:" -ForegroundColor Yellow
java -version

Write-Host ""
Write-Host "To set these permanently:" -ForegroundColor Green
Write-Host "1. Open System Properties (Win+R, type 'sysdm.cpl')" -ForegroundColor White
Write-Host "2. Click 'Environment Variables'" -ForegroundColor White
Write-Host "3. Under System Variables, find and edit 'JAVA_HOME'" -ForegroundColor White
Write-Host "4. Set JAVA_HOME to: C:\Program Files\Eclipse Adoptium\jdk-21.0.8.9-hotspot\" -ForegroundColor White
Write-Host "5. Update PATH to include: %JAVA_HOME%\bin at the beginning" -ForegroundColor White