# Algo App

All the presented algo_App folder is the replacement for the same folder in https://github.com/segway-robotics/loomo-algodev.

We contribute with a new mode in the Loomo-Algodev execution: **VITA_Testing**.

Combined with the work in https://github.com/cconejob/Autonomous_driving_pipeline we create flexible and robust testing platform. We allow to verify that algorithms for Perception, Prediction, Estimation, Path Planning or Control, are working in real scenarios and not only in simulations.

## Quick Start

We strongly recommend to read the following documments and complement them with our comments.

* [Getting Started with Loomo](/Getting_started_with_Loomo.pdf). **Read** the *Installation* section (do not install Android Studio, beacause it requires a specific version that can be found in Dependencies). 
    * Install all dependencies mentioned below.
    * Execute steps 2 and 3 of the document.
    * Add 3rd party libraries ```3rdparty_android``` inside the ```./dependency``` project's folder, once it is downloaded. 
    * Inside the Android Studio project, go to ```Tools -> SDK Manager```.
      * SDK Platforms: Check in Android API 30 and Android 8.0 (Oreo) and click Apply.
      * SDK Tools: Check in Show Package Details below. Then check in Android SDK Build-Tools 30.0.2, CMake 3.6, Android SDK Platform-Tools 30.0.4, Android SDK Tools 26.1.1, NDK. Other checks set by default should not be modifyied. 
  
* [Environment Setup Robots](/Environment_Setup_Robots.pdf).
  
* [Loomo Deployment Instructions](/Loomo_Deployment_Instruction.pdf).
  * Section 3, Tuning, is required, not optional. Once it is executed, we don't need this command anymore.

## Dependencies

```shell
sudo chmod +x dependencies_loomo-algodev.sh
./dependencies_loomo-algodev.sh
```



