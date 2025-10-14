#pragma once 

#include <jni.h>
#include <android/log.h>
#include <cstdlib>
#include <string>
#include <vector>
#include <list>
#include <unistd.h>
#include <algorithm>
#include <cmath>
#include <iostream>

#include "arm/util.h"
#include "str_obfuscate.hpp"

extern JavaVM *mVm;
extern JNIEnv *mEnv;

uint32_t GetTickCount();
void SetFunc(uintptr_t addr, uintptr_t *orig);