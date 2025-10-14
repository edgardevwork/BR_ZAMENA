package com.blackhub.bronline.game.p019ui.widget.utils;

import android.graphics.Bitmap;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import coil.compose.SingletonAsyncImageKt;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImageBitmap.kt */
@Metadata(m7104d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\u001aZ\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002"}, m7105d2 = {"ImageBitmap", "", "bitmap", "Landroid/graphics/Bitmap;", "modifier", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "ImageBitmap-Ay9G7rc", "(Landroid/graphics/Bitmap;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;II)V", "app_siteRelease", "visible", ""}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nImageBitmap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageBitmap.kt\ncom/blackhub/bronline/game/ui/widget/utils/ImageBitmapKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,54:1\n1116#2,6:55\n81#3:61\n*S KotlinDebug\n*F\n+ 1 ImageBitmap.kt\ncom/blackhub/bronline/game/ui/widget/utils/ImageBitmapKt\n*L\n33#1:55,6\n33#1:61\n*E\n"})
/* loaded from: classes3.dex */
public final class ImageBitmapKt {
    @Composable
    /* renamed from: ImageBitmap-Ay9G7rc */
    public static final void m15118ImageBitmapAy9G7rc(@Nullable final Bitmap bitmap, @Nullable Modifier modifier, @Nullable Alignment alignment, @Nullable ContentScale contentScale, float f, @Nullable ColorFilter colorFilter, int i, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1281036303);
        Modifier modifier2 = (i3 & 2) != 0 ? Modifier.INSTANCE : modifier;
        final Alignment center = (i3 & 4) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        final ContentScale fit = (i3 & 8) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        final float f2 = (i3 & 16) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i3 & 32) != 0 ? null : colorFilter;
        int iM11891getDefaultFilterQualityfv9h1I = (i3 & 64) != 0 ? DrawScope.INSTANCE.m11891getDefaultFilterQualityfv9h1I() : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1281036303, i2, -1, "com.blackhub.bronline.game.ui.widget.utils.ImageBitmap (ImageBitmap.kt:31)");
        }
        composer.startReplaceableGroup(-1588779190);
        boolean zChanged = composer.changed(bitmap);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.blackhub.bronline.game.ui.widget.utils.ImageBitmapKt$ImageBitmap$visible$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Boolean invoke() {
                    return Boolean.valueOf(BooleanExtensionKt.getOrFalse(bitmap != null ? Boolean.TRUE : null));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final Modifier modifier3 = modifier2;
        final ColorFilter colorFilter3 = colorFilter2;
        final int i4 = iM11891getDefaultFilterQualityfv9h1I;
        AnimatedVisibilityKt.AnimatedVisibility(ImageBitmap_Ay9G7rc$lambda$1((State) objRememberedValue), modifier2, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.composableLambda(composer, -1496237513, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.utils.ImageBitmapKt$ImageBitmap$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                invoke(animatedVisibilityScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer2, int i5) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1496237513, i5, -1, "com.blackhub.bronline.game.ui.widget.utils.ImageBitmap.<anonymous> (ImageBitmap.kt:42)");
                }
                SingletonAsyncImageKt.m14279AsyncImage3HmZ8SU(bitmap, null, modifier3, null, null, center, fit, f2, colorFilter3, i4, composer2, 56, 24);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composer, (i2 & 112) | 200064, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    public static final boolean ImageBitmap_Ay9G7rc$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
