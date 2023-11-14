@echo off

setlocal enabledelayedexpansion

set /p "path=Enter the directory path: "

for %%f in (%path%\*.java) do (
    
	set "scrFile=%%f"
	set "testsFolder=%path%\tests\tests"
	set "resultsFolder=%path%\tests\results"

	if not exist !resultsFolder! (mkdir !resultsFolder!)
<<<<<<< HEAD
	tj.exe !scrFile! !testsFolder! !resultsFolder!
=======

	tj.exe !scrFile! !testsFolder! !resultsFolder! -t 2s
>>>>>>> 6967fff7f729775465ad4ca12dc3893d28f565c7
)

endlocal