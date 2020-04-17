# Learnovate - Sensing stress levels in Augmented reality
An android app built for the Learnovate center. The project explores the feasability of linking an augmented reality app to a smart wearable device to measure changes in heart rate in stressful situations. We decided to use a FitBit to collect heart rate data.

This project includes many different technologies including:
  * Transmitting data from a FitBit to a phone app
  * Displaying a simulated stressful scenario in augmented reality
  * graphing heart rate data in real time
  
The *ARLearnovate* folder contains our AR application. To emulate a stressful situation we created an augmented reality app that would display a fire on surfaces that the phone camera is pointed at. 
This app can be run on android studios, requires a device that supports ArCore. 
The AR scenario is created using the library Viro which is based off of ArCore 


The *FitBit-api-test* folder contains a program that transmits data collected by the fitbit to a server. 
