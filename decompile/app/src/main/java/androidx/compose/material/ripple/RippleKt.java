package androidx.compose.material.ripple;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Ripple.kt */
@Metadata(m7104d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002\u001a0\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, m7105d2 = {"DefaultTweenSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "incomingStateLayerAnimationSpecFor", "Landroidx/compose/animation/core/AnimationSpec;", "interaction", "Landroidx/compose/foundation/interaction/Interaction;", "outgoingStateLayerAnimationSpecFor", "rememberRipple", "Landroidx/compose/foundation/Indication;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/Color;", "rememberRipple-9IZ8Weo", "(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;", "material-ripple_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,364:1\n50#2:365\n49#2:366\n1116#3,6:367\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleKt\n*L\n83#1:365\n83#1:366\n83#1:367,6\n*E\n"})
/* loaded from: classes.dex */
public final class RippleKt {

    @NotNull
    private static final TweenSpec<Float> DefaultTweenSpec = new TweenSpec<>(15, 0, EasingKt.getLinearEasing(), 2, null);

    @Composable
    @NotNull
    /* renamed from: rememberRipple-9IZ8Weo */
    public static final Indication m9113rememberRipple9IZ8Weo(boolean z, float f, long j, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1635163520);
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            f = C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            j = Color.INSTANCE.m11376getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1635163520, i, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:80)");
        }
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m11330boximpl(j), composer, (i >> 6) & 14);
        Boolean boolValueOf = Boolean.valueOf(z);
        C2046Dp c2046DpM13664boximpl = C2046Dp.m13664boximpl(f);
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(boolValueOf) | composer.changed(c2046DpM13664boximpl);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new PlatformRipple(z, f, stateRememberUpdatedState, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        PlatformRipple platformRipple = (PlatformRipple) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return platformRipple;
    }

    public static final AnimationSpec<Float> incomingStateLayerAnimationSpecFor(Interaction interaction) {
        if (interaction instanceof HoverInteraction.Enter) {
            return DefaultTweenSpec;
        }
        if (!(interaction instanceof FocusInteraction.Focus) && !(interaction instanceof DragInteraction.Start)) {
            return DefaultTweenSpec;
        }
        return new TweenSpec(45, 0, EasingKt.getLinearEasing(), 2, null);
    }

    public static final AnimationSpec<Float> outgoingStateLayerAnimationSpecFor(Interaction interaction) {
        if (!(interaction instanceof HoverInteraction.Enter) && !(interaction instanceof FocusInteraction.Focus)) {
            return interaction instanceof DragInteraction.Start ? new TweenSpec(150, 0, EasingKt.getLinearEasing(), 2, null) : DefaultTweenSpec;
        }
        return DefaultTweenSpec;
    }
}
