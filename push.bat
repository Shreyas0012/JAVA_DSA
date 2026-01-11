@echo off
cd /d D:\java
setlocal enabledelayedexpansion

REM Collect all .java files
set count=0
for %%f in (*.java) do (
    set files[!count!]=%%f
    set /a count+=1
)

REM Exit if no Java files
if %count%==0 exit /b

REM Get current day
for /f "tokens=3" %%a in ('wmic os get localdatetime ^| find "."') do set dt=%%a
set day=!dt:~6,2!

REM Select file using modulo
set /a index=day %% count
set file=!files[%index%]!

REM Add harmless daily comment (guarantees change)
echo // Auto update: %date% %time%>> "!file!"

REM Git operations
git add "!file!"
git commit -m "Daily automated update"
git push origin main
