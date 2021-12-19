# Random Password Generator (RPG)

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [App testing](#app-testing)

## General info 
There are two java classes. 'Password.java' is focused on the logical process, and 'Password_Generator.java' is made for executing and testing the logical java class.

>(This is my first project using java)

## Technologies
This project is created with:
* Java SE Development Kit 15.0.1 

## App testing
### Inputs
When you execute the code, the console will request how many passwords, and the length for them, in this case, I put 5 PW, of 10 char.

![console-input](https://i.imgur.com/QgwnYxD.png) 
### Outputs
This is the result
>("Is it Strong?" is referring to an array of booleans (forcibly created to complete all statements of my class, I think it is not necessary because you can call the method instead) that if the password has at least 1 uppercase, 1 lowercase, 1 number, 1 special character and is longer than 8 characters. It returns true, like "yeah, this pw is secure, don't worry")

![console-output](https://i.imgur.com/WHclUL2.png)
