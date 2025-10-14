package androidx.compose.material;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material.Strings;
import androidx.compose.p003ui.C1841R;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Strings.android.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, m7105d2 = {"getString", "", TypedValues.Custom.S_STRING, "Landroidx/compose/material/Strings;", "getString-4foXLRw", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "material_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nStrings.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material/Strings_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,39:1\n74#2:40\n74#2:41\n*S KotlinDebug\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material/Strings_androidKt\n*L\n26#1:40\n27#1:41\n*E\n"})
/* loaded from: classes2.dex */
public final class Strings_androidKt {
    @Composable
    @NotNull
    /* renamed from: getString-4foXLRw */
    public static final String m9023getString4foXLRw(int i, @Nullable Composer composer, int i2) {
        String string;
        composer.startReplaceableGroup(-726638443);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-726638443, i2, -1, "androidx.compose.material.getString (Strings.android.kt:24)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Strings.Companion companion = Strings.INSTANCE;
        if (Strings.m9012equalsimpl0(i, companion.m9020getNavigationMenuUdPEhr4())) {
            string = resources.getString(C1841R.string.navigation_menu);
        } else if (Strings.m9012equalsimpl0(i, companion.m9016getCloseDrawerUdPEhr4())) {
            string = resources.getString(C1841R.string.close_drawer);
        } else if (Strings.m9012equalsimpl0(i, companion.m9017getCloseSheetUdPEhr4())) {
            string = resources.getString(C1841R.string.close_sheet);
        } else if (Strings.m9012equalsimpl0(i, companion.m9018getDefaultErrorMessageUdPEhr4())) {
            string = resources.getString(C1841R.string.default_error_message);
        } else if (Strings.m9012equalsimpl0(i, companion.m9019getExposedDropdownMenuUdPEhr4())) {
            string = resources.getString(C1841R.string.dropdown_menu);
        } else if (Strings.m9012equalsimpl0(i, companion.m9022getSliderRangeStartUdPEhr4())) {
            string = resources.getString(C1841R.string.range_start);
        } else {
            string = Strings.m9012equalsimpl0(i, companion.m9021getSliderRangeEndUdPEhr4()) ? resources.getString(C1841R.string.range_end) : "";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return string;
    }
}
