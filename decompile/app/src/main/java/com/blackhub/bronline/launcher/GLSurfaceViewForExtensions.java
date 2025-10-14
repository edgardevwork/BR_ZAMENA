package com.blackhub.bronline.launcher;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.JNIConfigChooser;
import com.blackhub.bronline.game.core.constants.NativeGraphicConstants;
import com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GLSurfaceViewForExtensions.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/GLSurfaceViewForExtensions;", "Landroid/opengl/GLSurfaceView;", "context", "Landroid/content/Context;", "mainActivityViewModel", "Lcom/blackhub/bronline/launcher/viewmodel/MainActivityViewModel;", "(Landroid/content/Context;Lcom/blackhub/bronline/launcher/viewmodel/MainActivityViewModel;)V", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class GLSurfaceViewForExtensions extends GLSurfaceView {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLSurfaceViewForExtensions(@Nullable Context context, @NotNull final MainActivityViewModel mainActivityViewModel) {
        super(context);
        Intrinsics.checkNotNullParameter(mainActivityViewModel, "mainActivityViewModel");
        setEGLContextClientVersion(3);
        setEGLConfigChooser(new JNIConfigChooser(context));
        setRenderer(new GLSurfaceView.Renderer() { // from class: com.blackhub.bronline.launcher.GLSurfaceViewForExtensions.1
            @Override // android.opengl.GLSurfaceView.Renderer
            public void onDrawFrame(@NotNull GL10 gl) {
                Intrinsics.checkNotNullParameter(gl, "gl");
            }

            @Override // android.opengl.GLSurfaceView.Renderer
            public void onSurfaceChanged(@NotNull GL10 gl, int width, int height) {
                Intrinsics.checkNotNullParameter(gl, "gl");
            }

            @Override // android.opengl.GLSurfaceView.Renderer
            public void onSurfaceCreated(@Nullable GL10 gl, @Nullable EGLConfig config) {
                String strGlGetString = GLES20.glGetString(7939);
                Log.d("GL_RENDERER_TAG", "GLES30.glGetString(GLES30.GL_EXTENSIONS) " + strGlGetString);
                Intrinsics.checkNotNull(strGlGetString);
                if (!StringsKt__StringsKt.contains$default((CharSequence) strGlGetString, (CharSequence) "GL_ARM_shader_framebuffer_fetch", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) strGlGetString, (CharSequence) "GL_EXT_shader_pixel_local_storage2", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) strGlGetString, (CharSequence) "GL_EXT_shader_pixel_local_storage", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) strGlGetString, (CharSequence) "GL_EXT_shader_framebuffer_fetch", false, 2, (Object) null)) {
                    FirebaseCrashlytics.getInstance().recordException(new Throwable());
                }
                String str = StringsKt__StringsKt.contains$default((CharSequence) strGlGetString, (CharSequence) NativeGraphicConstants.ASTC_FULL_NAME, false, 2, (Object) null) ? NativeGraphicConstants.ASTC : NativeGraphicConstants.ETC2;
                Log.d("GL_RENDERER_TAG", "result " + str);
                mainActivityViewModel.setCurrentArchitectureFolder(str);
            }
        });
    }
}
