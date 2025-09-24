# Java Version Manager Script
# This script allows you to easily switch between Java versions

param(
    [Parameter(Mandatory=$false)]
    [ValidateSet("17", "21", "list")]
    [string]$Version = "list"
)

$java17Path = "C:\Program Files\Eclipse Adoptium\jdk-17.0.12.7-hotspot\"
$java21Path = "C:\Program Files\Eclipse Adoptium\jdk-21.0.8.9-hotspot\"

switch ($Version) {
    "17" {
        Write-Host "Switching to Java 17..." -ForegroundColor Green
        $env:JAVA_HOME = $java17Path
        $env:PATH = $env:JAVA_HOME + "bin;" + $env:PATH
        Write-Host "JAVA_HOME = $env:JAVA_HOME" -ForegroundColor Cyan
        java -version
    }
    "21" {
        Write-Host "Switching to Java 21..." -ForegroundColor Green
        $env:JAVA_HOME = $java21Path
        $env:PATH = $env:JAVA_HOME + "bin;" + $env:PATH
        Write-Host "JAVA_HOME = $env:JAVA_HOME" -ForegroundColor Cyan
        java -version
    }
    "list" {
        Write-Host "Available Java versions:" -ForegroundColor Yellow
        
        if (Test-Path $java17Path) {
            Write-Host "✓ Java 17: $java17Path" -ForegroundColor Green
        } else {
            Write-Host "✗ Java 17: Not found" -ForegroundColor Red
        }
        
        if (Test-Path $java21Path) {
            Write-Host "✓ Java 21: $java21Path" -ForegroundColor Green
        } else {
            Write-Host "✗ Java 21: Not found" -ForegroundColor Red
        }
        
        Write-Host ""
        Write-Host "Usage:" -ForegroundColor White
        Write-Host "  .\switch-java.ps1 17    # Switch to Java 17" -ForegroundColor Gray
        Write-Host "  .\switch-java.ps1 21    # Switch to Java 21" -ForegroundColor Gray
        Write-Host "  .\switch-java.ps1 list  # List available versions" -ForegroundColor Gray
        
        Write-Host ""
        Write-Host "Current Java version:" -ForegroundColor Yellow
        java -version
    }
}