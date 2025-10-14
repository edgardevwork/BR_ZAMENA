package com.blackhub.bronline.game.p019ui.widget.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.p003ui.graphics.painter.BitmapPainter;
import androidx.compose.p003ui.graphics.painter.ColorPainter;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ImageResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NativeKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FallbackPainterResource.kt */
@SourceDebugExtension({"SMAP\nFallbackPainterResource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FallbackPainterResource.kt\ncom/blackhub/bronline/game/ui/widget/utils/FallbackPainterResourceKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,91:1\n74#2:92\n74#2:105\n74#2:106\n1116#3,6:93\n1116#3,6:99\n*S KotlinDebug\n*F\n+ 1 FallbackPainterResource.kt\ncom/blackhub/bronline/game/ui/widget/utils/FallbackPainterResourceKt\n*L\n30#1:92\n89#1:105\n90#1:106\n32#1:93,6\n55#1:99,6\n*E\n"})
/* loaded from: classes3.dex */
public final class FallbackPainterResourceKt {
    @Composable
    @NotNull
    public static final Painter fallbackPainterResource(@DrawableRes int i, @Nullable Composer composer, int i2) throws Resources.NotFoundException {
        Painter colorPainter;
        composer.startReplaceableGroup(1779936741);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1779936741, i2, -1, "com.blackhub.bronline.game.ui.widget.utils.fallbackPainterResource (FallbackPainterResource.kt:28)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Resources resources = resources(composer, 0);
        composer.startReplaceableGroup(1845183152);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new TypedValue();
            composer.updateRememberedValue(objRememberedValue);
        }
        TypedValue typedValue = (TypedValue) objRememberedValue;
        composer.endReplaceableGroup();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && StringsKt__StringsKt.endsWith$default(charSequence, (CharSequence) ActivityChooserModel.HISTORY_FILE_EXTENSION, false, 2, (Object) null)) {
            composer.startReplaceableGroup(1845183733);
            colorPainter = PainterResources_androidKt.painterResource(i, composer, i2 & 14);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1845184048);
            Object theme = context.getTheme();
            composer.startReplaceableGroup(1845184062);
            boolean zChanged = composer.changed(charSequence) | ((((i2 & 14) ^ 6) > 4 && composer.changed(i)) || (i2 & 6) == 4) | composer.changed(theme);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = loadImageBitmapResource(resources, i);
                composer.updateRememberedValue(objRememberedValue2);
            }
            ImageBitmap imageBitmap = (ImageBitmap) objRememberedValue2;
            composer.endReplaceableGroup();
            if (imageBitmap != null) {
                colorPainter = new BitmapPainter(imageBitmap, 0L, 0L, 6, null);
            } else {
                colorPainter = new ColorPainter(Color.INSTANCE.m11372getLightGray0d7_KjU(), null);
            }
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return colorPainter;
    }

    public static final ImageBitmap loadImageBitmapResource(Resources resources, int i) {
        try {
            return ImageResources_androidKt.imageResource(ImageBitmap.INSTANCE, resources, i);
        } catch (Throwable th) {
            UtilsKt.crashlyticsRecordNewException("id = " + i + ", " + th.getMessage());
            return null;
        }
    }

    @Composable
    @ReadOnlyComposable
    public static final Resources resources(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2077105802, i, -1, "com.blackhub.bronline.game.ui.widget.utils.resources (FallbackPainterResource.kt:87)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return resources;
    }
}

