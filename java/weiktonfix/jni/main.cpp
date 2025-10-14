#include "main.h"
#include "jniutil.h"

uintptr_t g_libGTASA = 0;
const char* g_pAPKPackage;

jobject appContext;
JavaVM *mVm;
JNIEnv *mEnv;


void *InitialiseThread(void *p)
{
	//Main();
	pthread_exit(0);
}          

JNIEnv *getEnv() 
{
	JNIEnv* env = nullptr;
	JavaVM* javaVM = mVm;
	int getEnvStat = javaVM->GetEnv((void**)& env, JNI_VERSION_1_6);

	if (getEnvStat == JNI_EDETACHED)
		if (javaVM->AttachCurrentThread(&env, NULL) != 0)
		  return nullptr;

	if (getEnvStat == JNI_EVERSION)
	    return nullptr;

	if (getEnvStat == JNI_ERR)
	   return nullptr;

	return env;
}

jint JNI_OnLoad(JavaVM *vm, void *reserved)
{
    mVm = vm;
    mEnv = getEnv();

	appContext = GetGlobalActivity(mEnv);
	if(appContext != NULL) 
	{ 
		toasty(OBFUSCATE("t.me/edgar_gamedev"));

		char sea_of_feelings[100+1];
    }

	return JNI_VERSION_1_6;
}

uint32_t GetTickCount()
{
	struct timeval tv;
	gettimeofday(&tv, nullptr);

	return (tv.tv_sec*1000 + tv.tv_usec/1000);
}
