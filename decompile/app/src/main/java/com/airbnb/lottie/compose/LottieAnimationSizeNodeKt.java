package com.airbnb.lottie.compose;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.layout.ScaleFactor;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.runtime.Stable;
import androidx.media3.extractor.flv.ScriptTagPayloadReader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LottieAnimationSizeNode.kt */
@Metadata(m7104d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0001\u001a\u001f\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, m7105d2 = {"lottieSize", "Landroidx/compose/ui/Modifier;", "width", "", "height", ScriptTagPayloadReader.KEY_TIMES, "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/geometry/Size;", "scale", "Landroidx/compose/ui/layout/ScaleFactor;", "times-UQTWf7w", "(JJ)J", "lottie-compose_release"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class LottieAnimationSizeNodeKt {
    @Stable
    @NotNull
    public static final Modifier lottieSize(@NotNull Modifier modifier, int i, int i2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then(new LottieAnimationSizeElement(i, i2));
    }

    /* renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m14308timesUQTWf7w(long j, long j2) {
        return IntSizeKt.IntSize((int) (Size.m11168getWidthimpl(j) * ScaleFactor.m12680getScaleXimpl(j2)), (int) (Size.m11165getHeightimpl(j) * ScaleFactor.m12681getScaleYimpl(j2)));
    }
}
