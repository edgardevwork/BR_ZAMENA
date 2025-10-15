package androidx.compose.p003ui.res;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* compiled from: ColorResources.android.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m7105d2 = {"colorResource", "Landroidx/compose/ui/graphics/Color;", "id", "", "(ILandroidx/compose/runtime/Composer;I)J", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nColorResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorResources.android.kt\nandroidx/compose/ui/res/ColorResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,54:1\n74#2:55\n*S KotlinDebug\n*F\n+ 1 ColorResources.android.kt\nandroidx/compose/ui/res/ColorResources_androidKt\n*L\n38#1:55\n*E\n"})
/* loaded from: classes3.dex */
public final class ColorResources_androidKt {
    @Composable
    @ReadOnlyComposable
    public static final long colorResource(@ColorRes int i, @Nullable Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1777644873, i2, -1, "androidx.compose.ui.res.colorResource (ColorResources.android.kt:36)");
        }
        long jM12976getColorWaAFU9c = ColorResourceHelper.INSTANCE.m12976getColorWaAFU9c((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), i);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM12976getColorWaAFU9c;
    }
}
