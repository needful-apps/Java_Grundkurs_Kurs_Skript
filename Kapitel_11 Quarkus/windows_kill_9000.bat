@echo off
for /f "tokens=5" %%a in ('netstat -ano ^| find ":9000" ^| find "LISTENING"') do (
    echo Prozess-ID gefunden: %%a
    taskkill /PID %%a /F
    echo Prozess mit PID %%a wurde beendet.
)
pause
