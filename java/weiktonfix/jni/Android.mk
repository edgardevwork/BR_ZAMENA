LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := edgarbr
LOCAL_LDLIBS := -llog

# path
FILE_LIST := $(wildcard $(LOCAL_PATH)/*.cpp)
FILE_LIST += $(wildcard $(LOCAL_PATH)/arm/*.cpp)
LOCAL_SRC_FILES := $(FILE_LIST:$(LOCAL_PATH)/%=%)

LOCAL_CPPFLAGS := -w -s -fvisibility=hidden -pthread -Wall -fpack-struct=1 -O2 -std=c++14 -fexceptions
LOCAL_LDLIBS := -llog -landroid -lEGL -lGLESv2
include $(BUILD_SHARED_LIBRARY)