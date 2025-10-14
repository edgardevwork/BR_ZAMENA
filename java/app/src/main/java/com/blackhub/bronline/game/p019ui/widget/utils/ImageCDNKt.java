package com.blackhub.bronline.game.p019ui.widget.utils;

import androidx.annotation.DrawableRes;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.bless.client.R;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImageCDN.kt */
/* loaded from: classes3.dex */
public final class ImageCDNKt {
    public static final long DELAY_BEFORE_RETRY = 1000;
    public static final int MAX_LOAD_ATTEMPTS = 3;

    @NotNull
    public static final String RETRY_HASH = "retry_hash";

    @Deprecated(message = "отказались от такой реализации")
    @Composable
    /* renamed from: ImageCDN-C8z9wKI, reason: not valid java name */
    public static final void m15119ImageCDNC8z9wKI(@NotNull final String model, @Nullable Modifier modifier, @Nullable Alignment alignment, @Nullable ContentScale contentScale, float f, @Nullable ColorFilter colorFilter, int i, boolean z, @DrawableRes int i2, @Nullable Composer composer, final int i3, final int i4) {
        Modifier modifier2;
        Alignment center;
        ContentScale fit;
        float f2;
        ColorFilter colorFilter2;
        int iM11891getDefaultFilterQualityfv9h1I;
        int i5;
        boolean z2;
        int i6;
        final ContentScale contentScale2;
        final ColorFilter colorFilter3;
        final boolean z3;
        Intrinsics.checkNotNullParameter(model, "model");
        Composer composerStartRestartGroup = composer.startRestartGroup(-3865242);
        int i7 = i3 & 1;
        if (i7 != 0 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if (i7 == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier2 = (i4 & 2) != 0 ? Modifier.INSTANCE : modifier;
                center = (i4 & 4) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
                fit = (i4 & 8) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
                f2 = (i4 & 16) != 0 ? 1.0f : f;
                colorFilter2 = (i4 & 32) != 0 ? null : colorFilter;
                if ((i4 & 64) != 0) {
                    iM11891getDefaultFilterQualityfv9h1I = DrawScope.INSTANCE.m11891getDefaultFilterQualityfv9h1I();
                    i5 = i3 & (-3670017);
                } else {
                    iM11891getDefaultFilterQualityfv9h1I = i;
                    i5 = i3;
                }
                z2 = (i4 & 128) != 0 ? false : z;
                i6 = (i4 & 256) != 0 ? R.drawable.ic_br_logo : i2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 & 64) != 0) {
                    center = alignment;
                    fit = contentScale;
                    f2 = f;
                    colorFilter2 = colorFilter;
                    iM11891getDefaultFilterQualityfv9h1I = i;
                    z2 = z;
                    i6 = i2;
                    i5 = i3 & (-3670017);
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    center = alignment;
                    fit = contentScale;
                    f2 = f;
                    colorFilter2 = colorFilter;
                    iM11891getDefaultFilterQualityfv9h1I = i;
                    z2 = z;
                    i6 = i2;
                    i5 = i3;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-3865242, i5, -1, "com.blackhub.bronline.game.ui.widget.utils.ImageCDN (ImageCDN.kt:30)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            contentScale2 = fit;
            colorFilter3 = colorFilter2;
            z3 = z2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            center = alignment;
            contentScale2 = contentScale;
            f2 = f;
            colorFilter3 = colorFilter;
            iM11891getDefaultFilterQualityfv9h1I = i;
            z3 = z;
            i6 = i2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            final Alignment alignment2 = center;
            final float f3 = f2;
            final int i8 = iM11891getDefaultFilterQualityfv9h1I;
            final int i9 = i6;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.utils.ImageCDNKt$ImageCDN$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i10) {
                    ImageCDNKt.m15119ImageCDNC8z9wKI(model, modifier3, alignment2, contentScale2, f3, colorFilter3, i8, z3, i9, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
    }
}

