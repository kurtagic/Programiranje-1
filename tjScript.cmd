@echo off

setlocal enabledelayedexpansion

set /p "path=Enter the directory path: "

for %%f in (%path%\*.java) do (
    
	set "scrFile=%%f"
	set "testsFolder=%path%\tests\tests"
	set "resultsFolder=%path%\tests\results"

	if not exist !resultsFolder! (mkdir !resultsFolder!)
<<<<<<< HEAD
	echo !scrFile!
	echo !testsFolder!
	echo !resultsFolder!
=======

>>>>>>> a411a59fcc1ea4f4eda8708359b323b5d89389ee
	tj.exe !scrFile! !testsFolder! !resultsFolder!
)

endlocal