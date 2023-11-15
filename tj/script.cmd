@echo off

setlocal enabledelayedexpansion

set /p "path=Enter the directory path: "

for %%f in (%path%\*.java) do (
    
	set "scrFile=%%f"
	set "testsFolder=%path%\tests\tests"
	set "resultsFolder=%path%\tests\results"

	if not exist !resultsFolder! (mkdir !resultsFolder!)

	tj.exe !scrFile! !testsFolder! !resultsFolder! -t 2s
)

endlocal