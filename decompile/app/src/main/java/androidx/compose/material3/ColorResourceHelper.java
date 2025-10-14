package androidx.compose.material3;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p003ui.graphics.ColorKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DynamicTonalPalette.android.kt */
@RequiresApi(23)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, m7105d2 = {"Landroidx/compose/material3/ColorResourceHelper;", "", "()V", "getColor", "Landroidx/compose/ui/graphics/Color;", "context", "Landroid/content/Context;", "id", "", "getColor-WaAFU9c", "(Landroid/content/Context;I)J", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class ColorResourceHelper {

    @NotNull
    public static final ColorResourceHelper INSTANCE = new ColorResourceHelper();

    @DoNotInline
    /* renamed from: getColor-WaAFU9c, reason: not valid java name */
    public final long m9249getColorWaAFU9c(@NotNull Context context, @ColorRes int id) {
        return ColorKt.Color(context.getResources().getColor(id, context.getTheme()));
    }
}
