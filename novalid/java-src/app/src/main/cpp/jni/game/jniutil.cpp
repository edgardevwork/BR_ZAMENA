#include "jniutil.h"
#include "chat.h"


extern "C" JavaVM* javaVM;

JNIEnv* CJavaWrapper::GetEnv()
{
    JNIEnv* env = nullptr;
    int getEnvStat = javaVM->GetEnv((void**)& env, JNI_VERSION_1_6);

    if (getEnvStat == JNI_EDETACHED)
    {
        if (javaVM->AttachCurrentThread(&env, nullptr) != 0)
        {
            return nullptr;
        }
    }
    if (getEnvStat == JNI_EVERSION)
    {
        return nullptr;
    }

    if (getEnvStat == JNI_ERR)
    {
        return nullptr;
    }

    return env;
}
#include "xorstr.h"

void CJavaWrapper::ShowInventory(const std::string &jsonString)
{
    JNIEnv* env = nullptr;
    javaVM->GetEnv((void**)& env, JNI_VERSION_1_6);
    if (!env) {
        return;
    }
    if (guiManagerClass != nullptr) {
        jmethodID getInstanceMethod = env->GetStaticMethodID(guiManagerClass, "getInstance", "()Lcom/blackhub/bronline/game/GUIManager;");
        if (getInstanceMethod != nullptr) {
            jobject guiManagerInstance = env->CallStaticObjectMethod(guiManagerClass, getInstanceMethod);

            jstring jsonJString = env->NewStringUTF(jsonString.c_str()); 

            jmethodID showCurrentGUIMethod = env->GetMethodID(guiManagerClass, "onPacketIncoming", "(ILorg/json/JSONObject;)V");
            if (showCurrentGUIMethod != nullptr) {
                jclass jsonObjectClass = env->FindClass("org/json/JSONObject");
                if (jsonObjectClass != nullptr) {
                    jmethodID constructor = env->GetMethodID(jsonObjectClass, "<init>", "(Ljava/lang/String;)V");
                    if (constructor != nullptr) {
                        jobject jsonObject = env->NewObject(jsonObjectClass, constructor, jsonJString);
                        env->CallVoidMethod(guiManagerInstance, showCurrentGUIMethod, 33 , jsonObject);

                        env->DeleteLocalRef(jsonObject);
                    }
                    env->DeleteLocalRef(jsonObjectClass);
                }
            }

            env->DeleteLocalRef(jsonJString);
            env->DeleteLocalRef(guiManagerInstance);
        }
    }

    EXCEPTION_CHECK(env);
}

void CJavaWrapper::ShowFamily(const std::string &jsonString)
{
    JNIEnv* env = nullptr;
    javaVM->GetEnv((void**)& env, JNI_VERSION_1_6);
    if (!env) {
        return;
    }
    if (guiManagerClass != nullptr) {
        jmethodID getInstanceMethod = env->GetStaticMethodID(guiManagerClass, "getInstance", "()Lcom/blackhub/bronline/game/GUIManager;");
        if (getInstanceMethod != nullptr) {
            jobject guiManagerInstance = env->CallStaticObjectMethod(guiManagerClass, getInstanceMethod);

            jstring jsonJString = env->NewStringUTF(jsonString.c_str());
            jmethodID showCurrentGUIMethod = env->GetMethodID(guiManagerClass, "onPacketIncoming", "(ILorg/json/JSONObject;)V");
            if (showCurrentGUIMethod != nullptr) {
                jclass jsonObjectClass = env->FindClass("org/json/JSONObject");
                if (jsonObjectClass != nullptr) {
                    jmethodID constructor = env->GetMethodID(jsonObjectClass, "<init>", "(Ljava/lang/String;)V");
                    if (constructor != nullptr) {
                        jobject jsonObject = env->NewObject(jsonObjectClass, constructor, jsonJString);
                        env->CallVoidMethod(guiManagerInstance, showCurrentGUIMethod, 45 , jsonObject);

                        env->DeleteLocalRef(jsonObject);
                    }
                    env->DeleteLocalRef(jsonObjectClass);
                }
            }

            env->DeleteLocalRef(jsonJString);
            env->DeleteLocalRef(guiManagerInstance);
        }
    }

    EXCEPTION_CHECK(env);
}

void CJavaWrapper::ShowDonate(const std::string &jsonString)
{
    JNIEnv* env = nullptr;
    javaVM->GetEnv((void**)& env, JNI_VERSION_1_6);
    if (!env) {
        return;
    }
    if (guiManagerClass != nullptr) {
        jmethodID getInstanceMethod = env->GetStaticMethodID(guiManagerClass, "getInstance", "()Lcom/blackhub/bronline/game/GUIManager;");
        if (getInstanceMethod != nullptr) {
            jobject guiManagerInstance = env->CallStaticObjectMethod(guiManagerClass, getInstanceMethod);

            jstring jsonJString = env->NewStringUTF(jsonString.c_str());

            jmethodID showCurrentGUIMethod = env->GetMethodID(guiManagerClass, "onPacketIncoming", "(ILorg/json/JSONObject;)V");
            if (showCurrentGUIMethod != nullptr) {
                jclass jsonObjectClass = env->FindClass("org/json/JSONObject");
                if (jsonObjectClass != nullptr) {
                    jmethodID constructor = env->GetMethodID(jsonObjectClass, "<init>", "(Ljava/lang/String;)V");
                    if (constructor != nullptr) {
                        jobject jsonObject = env->NewObject(jsonObjectClass, constructor, jsonJString);
                        env->CallVoidMethod(guiManagerInstance, showCurrentGUIMethod, 22 , jsonObject);

                        env->DeleteLocalRef(jsonObject);
                    }
                    env->DeleteLocalRef(jsonObjectClass);
                }
            }

            env->DeleteLocalRef(jsonJString);
            env->DeleteLocalRef(guiManagerInstance);
        }
    }

    EXCEPTION_CHECK(env);
}

void CJavaWrapper::ShowFraction(const std::string &jsonString)
{
    JNIEnv* env = nullptr;
    javaVM->GetEnv((void**)& env, JNI_VERSION_1_6);
    if (!env) {
        return;
    }
    if (guiManagerClass != nullptr) {
        jmethodID getInstanceMethod = env->GetStaticMethodID(guiManagerClass, "getInstance", "()Lcom/blackhub/bronline/game/GUIManager;");
        if (getInstanceMethod != nullptr) {
            jobject guiManagerInstance = env->CallStaticObjectMethod(guiManagerClass, getInstanceMethod);

            jstring jsonJString = env->NewStringUTF(jsonString.c_str()); 

            jmethodID showCurrentGUIMethod = env->GetMethodID(guiManagerClass, "onPacketIncoming", "(ILorg/json/JSONObject;)V");
            if (showCurrentGUIMethod != nullptr) {
                jclass jsonObjectClass = env->FindClass("org/json/JSONObject");
                if (jsonObjectClass != nullptr) {
                    jmethodID constructor = env->GetMethodID(jsonObjectClass, "<init>", "(Ljava/lang/String;)V");
                    if (constructor != nullptr) {
                        jobject jsonObject = env->NewObject(jsonObjectClass, constructor, jsonJString);

                        env->CallVoidMethod(guiManagerInstance, showCurrentGUIMethod, 46 , jsonObject);

                        env->DeleteLocalRef(jsonObject);
                    }
                    env->DeleteLocalRef(jsonObjectClass);
                }
            }

            env->DeleteLocalRef(jsonJString);
            env->DeleteLocalRef(guiManagerInstance);
        }
    }

    EXCEPTION_CHECK(env);
}

void CJavaWrapper::ShowTuning(const std::string &jsonString)
{
    JNIEnv* env = nullptr;
    javaVM->GetEnv((void**)& env, JNI_VERSION_1_6);
    if (!env) {
        return;
    }
    if (guiManagerClass != nullptr) {
        jmethodID getInstanceMethod = env->GetStaticMethodID(guiManagerClass, "getInstance", "()Lcom/blackhub/bronline/game/GUIManager;");
        if (getInstanceMethod != nullptr) {
            jobject guiManagerInstance = env->CallStaticObjectMethod(guiManagerClass, getInstanceMethod);

            jstring jsonJString = env->NewStringUTF(jsonString.c_str()); 

            jmethodID showCurrentGUIMethod = env->GetMethodID(guiManagerClass, "onPacketIncoming", "(ILorg/json/JSONObject;)V");
            if (showCurrentGUIMethod != nullptr) {
                jclass jsonObjectClass = env->FindClass("org/json/JSONObject");
                if (jsonObjectClass != nullptr) {
                    jmethodID constructor = env->GetMethodID(jsonObjectClass, "<init>", "(Ljava/lang/String;)V");
                    if (constructor != nullptr) {
                        jobject jsonObject = env->NewObject(jsonObjectClass, constructor, jsonJString);
                        env->CallVoidMethod(guiManagerInstance, showCurrentGUIMethod, 28 , jsonObject);

                        env->DeleteLocalRef(jsonObject);
                    }
                    env->DeleteLocalRef(jsonObjectClass);
                }
            }

            env->DeleteLocalRef(jsonJString);
            env->DeleteLocalRef(guiManagerInstance);
        }
    }

    EXCEPTION_CHECK(env);
}

void CJavaWrapper::ShowReg(const std::string &jsonString)
{
    JNIEnv* env = nullptr;
    javaVM->GetEnv((void**)& env, JNI_VERSION_1_6);
    if (!env) {
        return;
    }
    if (guiManagerClass != nullptr) {
        jmethodID getInstanceMethod = env->GetStaticMethodID(guiManagerClass, "getInstance", "()Lcom/blackhub/bronline/game/GUIManager;");
        if (getInstanceMethod != nullptr) {
            jobject guiManagerInstance = env->CallStaticObjectMethod(guiManagerClass, getInstanceMethod);

            jstring jsonJString = env->NewStringUTF(jsonString.c_str());

            jmethodID showCurrentGUIMethod = env->GetMethodID(guiManagerClass, "onPacketIncoming", "(ILorg/json/JSONObject;)V");
            if (showCurrentGUIMethod != nullptr) {
                jclass jsonObjectClass = env->FindClass("org/json/JSONObject");
                if (jsonObjectClass != nullptr) {
                    jmethodID constructor = env->GetMethodID(jsonObjectClass, "<init>", "(Ljava/lang/String;)V");
                    if (constructor != nullptr) {
                        jobject jsonObject = env->NewObject(jsonObjectClass, constructor, jsonJString);
                        env->CallVoidMethod(guiManagerInstance, showCurrentGUIMethod, 38 , jsonObject);

                        env->DeleteLocalRef(jsonObject);
                    }
                    env->DeleteLocalRef(jsonObjectClass);
                }
            }

            env->DeleteLocalRef(jsonJString);
            env->DeleteLocalRef(guiManagerInstance);
        }
    }

    EXCEPTION_CHECK(env);
}

void CJavaWrapper::ShowReg2(const std::string &jsonString)
{
    JNIEnv* env = nullptr;
    javaVM->GetEnv((void**)& env, JNI_VERSION_1_6);
    if (!env) {
        return;
    }
    if (guiManagerClass != nullptr) {
        jmethodID getInstanceMethod = env->GetStaticMethodID(guiManagerClass, "getInstance", "()Lcom/blackhub/bronline/game/GUIManager;");
        if (getInstanceMethod != nullptr) {
            jobject guiManagerInstance = env->CallStaticObjectMethod(guiManagerClass, getInstanceMethod);

            jstring jsonJString = env->NewStringUTF(jsonString.c_str());

            jmethodID showCurrentGUIMethod = env->GetMethodID(guiManagerClass, "handleFragmentScreen", "(ILorg/json/JSONObject;)V");
            if (showCurrentGUIMethod != nullptr) {
                jclass jsonObjectClass = env->FindClass("org/json/JSONObject");
                if (jsonObjectClass != nullptr) {
                    jmethodID constructor = env->GetMethodID(jsonObjectClass, "<init>", "(Ljava/lang/String;)V");
                    if (constructor != nullptr) {
                        jobject jsonObject = env->NewObject(jsonObjectClass, constructor, jsonJString);
                        env->CallVoidMethod(guiManagerInstance, showCurrentGUIMethod, 38, jsonObject);

                        env->DeleteLocalRef(jsonObject);
                    }
                    env->DeleteLocalRef(jsonObjectClass);
                }
            }

            env->DeleteLocalRef(jsonJString);
            env->DeleteLocalRef(guiManagerInstance);
        }
    }

    EXCEPTION_CHECK(env);
}

CJavaWrapper::CJavaWrapper(JNIEnv* env)
{
	jclass localRef = env->FindClass("com/blackhub/bronline/game/GUIManager");
	if (localRef != nullptr) {
		guiManagerClass = (jclass)env->NewGlobalRef(localRef);
		env->DeleteLocalRef(localRef);
	} else {
		guiManagerClass = nullptr;
	}
}

CJavaWrapper::~CJavaWrapper()
{
    JNIEnv* pEnv = GetEnv();
    if (pEnv)
    {
        if (this->activity != nullptr) {
            pEnv->DeleteGlobalRef(this->activity);
        }
        if (this->guiManagerClass != nullptr) {
            pEnv->DeleteGlobalRef(this->guiManagerClass);
        }
    }
}

CJavaWrapper* g_pJavaWrapper = nullptr;