@echo off

setlocal enabledelayedexpansion

set /p "path=class directory: "

set "scr=%path%"
set "tests=%path%\tests\tests"
set "results=%path%\tests\results"

if not exist "!results!" (mkdir !results!)

tj.exe "!scr!" "!tests!" "!results!" -t 2s

endlocal