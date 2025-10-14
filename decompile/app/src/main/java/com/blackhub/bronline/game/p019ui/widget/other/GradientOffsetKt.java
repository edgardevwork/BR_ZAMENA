package com.blackhub.bronline.game.p019ui.widget.other;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: GradientOffset.kt */
@Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m7105d2 = {"gradientOffset", "Lcom/blackhub/bronline/game/ui/widget/other/GradientOffset;", "angle", "Lcom/blackhub/bronline/game/ui/widget/other/GradientAngle;", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class GradientOffsetKt {

    /* compiled from: GradientOffset.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GradientAngle.values().length];
            try {
                iArr[GradientAngle.CW45.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GradientAngle.CW90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GradientAngle.CW135.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GradientAngle.CW180.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GradientAngle.CW225.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GradientAngle.CW270.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GradientAngle.CW315.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ GradientOffset gradientOffset$default(GradientAngle gradientAngle, int i, Object obj) {
        if ((i & 1) != 0) {
            gradientAngle = GradientAngle.CW0;
        }
        return gradientOffset(gradientAngle);
    }

    @NotNull
    public static final GradientOffset gradientOffset(@NotNull GradientAngle angle) {
        Intrinsics.checkNotNullParameter(angle, "angle");
        switch (WhenMappings.$EnumSwitchMapping$0[angle.ordinal()]) {
            case 1:
                Offset.Companion companion = Offset.INSTANCE;
                return new GradientOffset(companion.m11115getZeroF1C5BW0(), companion.m11113getInfiniteF1C5BW0(), null);
            case 2:
                return new GradientOffset(Offset.INSTANCE.m11115getZeroF1C5BW0(), OffsetKt.Offset(0.0f, Float.POSITIVE_INFINITY), null);
            case 3:
                return new GradientOffset(OffsetKt.Offset(Float.POSITIVE_INFINITY, 0.0f), OffsetKt.Offset(0.0f, Float.POSITIVE_INFINITY), null);
            case 4:
                return new GradientOffset(OffsetKt.Offset(Float.POSITIVE_INFINITY, 0.0f), Offset.INSTANCE.m11115getZeroF1C5BW0(), null);
            case 5:
                Offset.Companion companion2 = Offset.INSTANCE;
                return new GradientOffset(companion2.m11113getInfiniteF1C5BW0(), companion2.m11115getZeroF1C5BW0(), null);
            case 6:
                return new GradientOffset(OffsetKt.Offset(0.0f, Float.POSITIVE_INFINITY), Offset.INSTANCE.m11115getZeroF1C5BW0(), null);
            case 7:
                return new GradientOffset(OffsetKt.Offset(0.0f, Float.POSITIVE_INFINITY), OffsetKt.Offset(Float.POSITIVE_INFINITY, 0.0f), null);
            default:
                return new GradientOffset(Offset.INSTANCE.m11115getZeroF1C5BW0(), OffsetKt.Offset(Float.POSITIVE_INFINITY, 0.0f), null);
        }
    }
}
