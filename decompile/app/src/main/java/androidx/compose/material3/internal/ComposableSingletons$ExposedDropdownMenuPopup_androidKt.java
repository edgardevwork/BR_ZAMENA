package androidx.compose.material3.internal;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExposedDropdownMenuPopup.android.kt */
@Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ExposedDropdownMenuPopup_androidKt {

    @NotNull
    public static final ComposableSingletons$ExposedDropdownMenuPopup_androidKt INSTANCE = new ComposableSingletons$ExposedDropdownMenuPopup_androidKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11132lambda1 = ComposableLambdaKt.composableLambdaInstance(-1952521318, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.ComposableSingletons$ExposedDropdownMenuPopup_androidKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1952521318, i, -1, "androidx.compose.material3.internal.ComposableSingletons$ExposedDropdownMenuPopup_androidKt.lambda-1.<anonymous> (ExposedDropdownMenuPopup.android.kt:263)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    /* renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10184getLambda1$material3_release() {
        return f11132lambda1;
    }
}
