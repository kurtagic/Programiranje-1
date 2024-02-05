@echo off

setlocal enabledelayedexpansion

set /p "path=file directory: "

for %%f in (%path%\*.java) do (
    
	set "scr=%%f"
	set "tests=%path%\tests\tests"
	set "results=%path%\tests\results"

	if not exist "!results!" (mkdir !results!)

	tj.exe "!scr!" "!tests!" "!results!" -t 2s

	pause
)

endlocal