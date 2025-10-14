@echo off
"C:\\Users\\AORUS\\AppData\\Local\\Android\\Sdk\\ndk\\16.1.4479499\\ndk-build.cmd" ^
  "NDK_PROJECT_PATH=null" ^
  "APP_BUILD_SCRIPT=C:\\CRMP\\BR_ZAMENA\\java\\app\\src\\main\\cpp\\jni\\Android.mk" ^
  "NDK_APPLICATION_MK=C:\\CRMP\\BR_ZAMENA\\java\\app\\src\\main\\cpp\\jni\\Application.mk" ^
  "APP_ABI=armeabi-v7a" ^
  "NDK_ALL_ABIS=armeabi-v7a" ^
  "NDK_DEBUG=1" ^
  "APP_PLATFORM=android-24" ^
  "NDK_OUT=C:\\CRMP\\BR_ZAMENA\\java\\app\\build\\intermediates\\cxx\\Debug\\683ul1j3/obj" ^
  "NDK_LIBS_OUT=C:\\CRMP\\BR_ZAMENA\\java\\app\\build\\intermediates\\cxx\\Debug\\683ul1j3/lib" ^
  "APP_SHORT_COMMANDS=false" ^
  "LOCAL_SHORT_COMMANDS=false" ^
  -B ^
  -n
