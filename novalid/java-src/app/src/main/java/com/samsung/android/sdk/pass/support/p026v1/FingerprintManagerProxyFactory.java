package com.samsung.android.sdk.pass.support.p026v1;

import android.content.Context;
import android.util.Log;
import com.samsung.android.sdk.pass.support.IFingerprintManagerProxy;
import com.samsung.android.sdk.pass.support.SdkSupporter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class FingerprintManagerProxyFactory {

    /* renamed from: com.samsung.android.sdk.pass.support.v1.FingerprintManagerProxyFactory$a */
    public static class C8028a implements InvocationHandler {

        /* renamed from: a */
        public Object f1012a;

        /* renamed from: b */
        public Map f1013b = new HashMap();

        public C8028a(Object obj) throws SecurityException {
            this.f1012a = obj;
            Method[] methods = IFingerprintManagerProxy.class.getMethods();
            for (Method method : obj.getClass().getMethods()) {
                String name = method.getName();
                if (m1426a(methods, method)) {
                    this.f1013b.put(name, method);
                }
            }
        }

        /* renamed from: a */
        public static boolean m1426a(Method[] methodArr, Method method) {
            String name = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Method method2 : methodArr) {
                if (method2.getName().equals(name)) {
                    Class<?>[] parameterTypes2 = method2.getParameterTypes();
                    if (parameterTypes == null || parameterTypes2 == null) {
                        return true;
                    }
                    if (parameterTypes.length == parameterTypes2.length) {
                        int length = parameterTypes.length;
                        boolean z = false;
                        for (int i = 0; i < length; i++) {
                            if (!parameterTypes2[i].equals(parameterTypes[i])) {
                                z = true;
                            }
                        }
                        if (!z) {
                            return true;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return false;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Method method2 = (Method) this.f1013b.get(method.getName());
            if (method2 != null) {
                return method2.invoke(this.f1012a, objArr);
            }
            return null;
        }
    }

    public static IFingerprintManagerProxy create(Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        try {
            objInvoke = Class.forName(SdkSupporter.CLASSNAME_FINGERPRINT_MANAGER).getMethod("getInstance", Context.class).invoke(null, context);
        } catch (Exception e) {
            Log.e("FingerprintManagerProxy", "Cannot create FingerprintManagerProxy : " + e);
            objInvoke = null;
        }
        if (objInvoke == null) {
            return null;
        }
        return (IFingerprintManagerProxy) Proxy.newProxyInstance(FingerprintManagerProxyFactory.class.getClassLoader(), new Class[]{IFingerprintManagerProxy.class}, new C8028a(objInvoke));
    }
}
