# BasisAssignment
Android Application in Kotlin for showing StackCard and functionality like Primer app.

## Sdk Version and Tools
    min_sdk_version = 21
    target_sdk_version = 28
    compile_sdk_version = 28
    build tool version = 3.4.2

# Installation
* Download the project and rebuild it with the abouve mentioned configuration.
* Use the latest android studio version.
* This project contains Androidx artifacts.

# Deployment
* Make sure that the gradle build is successfull.
* Use emulator or your device to deploy the app.

# Working Steps
1.Make sure you have internet connectivity.
  * If network connectivity is not there you will get a RETRY button to call the api again,

2.Open the app and you will find the loader untill the data is fetched from the API call.

3.After sucessfull fetch of data from API you will find stack of Cards showing the data.

4.OnRightSwipe/OnLeftSwipe - Next card will pop up

5.OnBottomSwipe - Previous card will pop up

6.On the bottom of screen there are three views 
  * a.next - to swipe next
  * b.previous - to swipe previous
  * c.reload - to scroll back to position 0 
