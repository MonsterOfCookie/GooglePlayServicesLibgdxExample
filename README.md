# Google Play Services with Libgdx Example

This project is a bare bones example of how to hook up a simple Google Play Game Services integration in your libGDX game.

##Before going forward...

#THIS PROJECT WILL NOT WORK ON AN ANDROID DEVICE OUT OF THE BOX IT WILL CRASH ON LAUNCH DUE TO DUMMY VALUES BEING USED!
#THIS PROJECT WILL NOT WORK ON AN ANDROID DEVICE OUT OF THE BOX IT WILL CRASH ON LAUNCH DUE TO DUMMY VALUES BEING USED!
#THIS PROJECT WILL NOT WORK ON AN ANDROID DEVICE OUT OF THE BOX IT WILL CRASH ON LAUNCH DUE TO DUMMY VALUES BEING USED!
#THIS PROJECT WILL NOT WORK ON AN ANDROID DEVICE OUT OF THE BOX IT WILL CRASH ON LAUNCH DUE TO DUMMY VALUES BEING USED!
#THIS PROJECT WILL NOT WORK ON AN ANDROID DEVICE OUT OF THE BOX IT WILL CRASH ON LAUNCH DUE TO DUMMY VALUES BEING USED!
#THIS PROJECT WILL NOT WORK ON AN ANDROID DEVICE OUT OF THE BOX IT WILL CRASH ON LAUNCH DUE TO DUMMY VALUES BEING USED!

With that out of the way, this project is to give an insight on how I go about structuring the code to use GPGS, now, this doesn't mean this
is the right way to do, this is a way that works very well for me.

We have 3 modules here, Android, Core and Desktop. Core has the interface to the services we plan to use Android and Desktop have the implementations.

You will need to have also checked out https://github.com/MonsterOfCookie/android-basic-samples and have the location set to the gradle.properties -> GOOGLE_PLAY_HELPER_SDK
The reason I have a fork for the android-basic-samples Google project is that their includes the mega dependency of all the GPGS code, this could mean when you come to build
you will get the 65k code lines error. So instead I changed it to just be the core library needed. If I need Analytics, Ads, Plus etc I can add them separately into the Game build.gradle.

If you run up the DesktopLauncher (gradlew desktop:run) you will find if you click the left side of the screen:
    PLAY_DESKTOP: Achievement One Unlocked
Then on the right:
    PLAY_DESKTOP: Achievement Screen requested

Once you have your account setup with Google and an Game configured, please check their information on how to do it as things change. This code will then work, providing you update
the values in the /res/game-ids.xml ;)

Hopefully the code is self explanatory. Any questions just ask, and good luck!

