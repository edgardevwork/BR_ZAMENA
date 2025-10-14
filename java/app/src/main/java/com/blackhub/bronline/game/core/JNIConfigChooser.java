package com.blackhub.bronline.game.core;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.launcher.dialogs.PhoneDoesNotSupportGameDialog;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* loaded from: classes2.dex */
public class JNIConfigChooser implements GLSurfaceView.EGLConfigChooser {
    public static int[][] ATTRIBUTE_TABLE = {new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 16, 12326, 8, 12352, 64, 12337, 4, 12338, 1, 12344}, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12326, 8, 12352, 64, 12337, 4, 12338, 1, 12344}, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 8, 12352, 64, 12337, 4, 12338, 1, 12344}, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 16, 12326, 8, 12352, 64, 12344}, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12326, 8, 12352, 64, 12344}, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 8, 12352, 64, 12344}, new int[]{12324, 5, 12323, 6, 12322, 5, 12325, 24, 12326, 8, 12352, 64, 12344}, new int[]{12324, 5, 12323, 6, 12322, 5, 12325, 16, 12326, 8, 12352, 64, 12344}, new int[]{12324, 5, 12323, 6, 12322, 5, 12325, 24, 12352, 64, 12344}, new int[]{12324, 5, 12323, 6, 12322, 5, 12325, 16, 12352, 64, 12344}, new int[]{12324, 5, 12323, 6, 12322, 5, 12352, 64, 12344}};
    public final WeakReference<Context> context;

    public JNIConfigChooser(Context context) {
        this.context = new WeakReference<>(context);
    }

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public EGLConfig chooseConfig(EGL10 egl, EGLDisplay eglDisplay) {
        UtilsKt.crashlyticsLog("ConfigChooser.chooseConfig: Model: " + Build.MODEL + ", board: " + Build.BOARD + ", product: " + Build.PRODUCT);
        int i = 0;
        while (true) {
            int[][] iArr = ATTRIBUTE_TABLE;
            if (i < iArr.length) {
                int[] iArr2 = {0};
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (egl.eglChooseConfig(eglDisplay, iArr[i], eGLConfigArr, 1, iArr2) && iArr2[0] > 0) {
                    UtilsKt.crashlyticsLog("ConfigChooser.chooseConfig: Selected display configuration: " + i);
                    return eGLConfigArr[0];
                }
                i++;
            } else {
                FirebaseCrashlytics.getInstance().recordException(new IllegalArgumentException("Failed to choose EGLConfig!"));
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.blackhub.bronline.game.core.JNIConfigChooser$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.lambda$chooseConfig$0();
                    }
                });
                return null;
            }
        }
    }

    public final /* synthetic */ void lambda$chooseConfig$0() {
        PhoneDoesNotSupportGameDialog phoneDoesNotSupportGameDialog = new PhoneDoesNotSupportGameDialog(this.context.get());
        phoneDoesNotSupportGameDialog.getWindow().setType(1000);
        phoneDoesNotSupportGameDialog.show();
    }
}
