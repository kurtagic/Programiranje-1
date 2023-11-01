@echo off
for /F "delims=" %%a in ('dir D:\UNIVERSITY\BACHELORS\YEAR_1\SEMESTER_1\P1\DODATNE_NALOGE\03_tabele /s /b /o:n /a:d') do (
   echo %%a
	mkdir "%%a\tests\tests"
	move "%%a\*.<in>" "%%a\tests\tests"
	move "%%a\*.<out>" "%%a\tests\tests"

)