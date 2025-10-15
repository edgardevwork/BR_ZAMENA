package androidx.compose.material3.windowsizeclass;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.compose.material3.windowsizeclass.WindowSizeClass;
import androidx.compose.p003ui.graphics.RectHelper_androidKt;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.window.layout.WindowMetricsCalculator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidWindowSizeClass.android.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m7105d2 = {"calculateWindowSizeClass", "Landroidx/compose/material3/windowsizeclass/WindowSizeClass;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroid/app/Activity;", "(Landroid/app/Activity;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/windowsizeclass/WindowSizeClass;", "material3-window-size-class_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAndroidWindowSizeClass.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidWindowSizeClass.android.kt\nandroidx/compose/material3/windowsizeclass/AndroidWindowSizeClass_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n74#2:49\n74#2:50\n1#3:51\n*S KotlinDebug\n*F\n+ 1 AndroidWindowSizeClass.android.kt\nandroidx/compose/material3/windowsizeclass/AndroidWindowSizeClass_androidKt\n*L\n42#1:49\n43#1:50\n*E\n"})
/* loaded from: classes3.dex */
public final class AndroidWindowSizeClass_androidKt {
    @Composable
    @ExperimentalMaterial3WindowSizeClassApi
    @NotNull
    public static final WindowSizeClass calculateWindowSizeClass(@NotNull Activity activity, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(866044206);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(866044206, i, -1, "androidx.compose.material3.windowsizeclass.calculateWindowSizeClass (AndroidWindowSizeClass.android.kt:36)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        WindowSizeClass windowSizeClassM10827calculateFromSizeqzXmJYc$default = WindowSizeClass.Companion.m10827calculateFromSizeqzXmJYc$default(WindowSizeClass.INSTANCE, ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo7872toDpSizekrfVVM(RectHelper_androidKt.toComposeRect(WindowMetricsCalculator.INSTANCE.getOrCreate().computeCurrentWindowMetrics(activity).getBounds()).m11132getSizeNHjbRc()), null, null, 6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return windowSizeClassM10827calculateFromSizeqzXmJYc$default;
    }
}
