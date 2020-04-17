# Learnovate - Sensing stress levels in Augmented reality

## Table of contents
* [Introduction](#Introduction)
* [Functionality](#Technologies)
* [Technology and Setup](#Setup)

# Introduction
An android app built for the Learnovate center. The project explores the feasability of linking an augmented reality app to a smart wearable device to measure changes in heart rate in stressful situations. We decided to use a FitBit to collect heart rate data.

# Functionality
This project includes many different technologies including:
  * Transmitting data from a FitBit to a app
  * Displaying a simulated stressful scenario in augmented reality

# Technology
The *ARLearnovate* folder contains our AR application. To emulate a stressful situation we created an augmented reality app that would display a fire on surfaces that the phone camera is pointed at. 
This app can be run on android studios, requires a physical device that supports ArCore as it can not be run on an emmulator.
The AR scenario is created using the library Viro which is based off of ArCore 


The *FitBit-api-test* folder contains a program that transmits data collected by the fitbit to a server. 


(The newproject2 folder contains a main menu and the UI of heart rate line data. This works on expo and iOS devices, but does not work on Android. So it is not used and included in this app.)
