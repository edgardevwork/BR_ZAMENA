package androidx.media3.common;

import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes4.dex */
public interface GlObjectsProvider {
    GlTextureInfo createBuffersForTexture(int i, int i2, int i3) throws GlUtil.GlException;

    @RequiresApi(17)
    EGLContext createEglContext(EGLDisplay eGLDisplay, @IntRange(from = 2, m10to = 3) int i, int[] iArr) throws GlUtil.GlException;

    @RequiresApi(17)
    EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i, boolean z) throws GlUtil.GlException;

    @RequiresApi(17)
    EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlUtil.GlException;
}
