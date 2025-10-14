package androidx.compose.p003ui.graphics;

import android.graphics.BlendModeColorFilter;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidColorFilter.android.kt */
@RequiresApi(29)
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m7105d2 = {"Landroidx/compose/ui/graphics/BlendModeColorFilterHelper;", "", "()V", "BlendModeColorFilter", "Landroid/graphics/BlendModeColorFilter;", "color", "Landroidx/compose/ui/graphics/Color;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "BlendModeColorFilter-xETnrds", "(JI)Landroid/graphics/BlendModeColorFilter;", "createBlendModeColorFilter", "Landroidx/compose/ui/graphics/BlendModeColorFilter;", "androidBlendModeColorFilter", "ui-graphics_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class BlendModeColorFilterHelper {

    @NotNull
    public static final BlendModeColorFilterHelper INSTANCE = new BlendModeColorFilterHelper();

    @DoNotInline
    @NotNull
    /* renamed from: BlendModeColorFilter-xETnrds, reason: not valid java name */
    public final BlendModeColorFilter m11286BlendModeColorFilterxETnrds(long color, int blendMode) {
        BlendModeColorFilterHelper$$ExternalSyntheticApiModelOutline3.m162m();
        return BlendModeColorFilterHelper$$ExternalSyntheticApiModelOutline2.m161m(ColorKt.m11394toArgb8_81llA(color), AndroidBlendMode_androidKt.m11191toAndroidBlendModes9anfk8(blendMode));
    }

    @DoNotInline
    @NotNull
    public final BlendModeColorFilter createBlendModeColorFilter(@NotNull BlendModeColorFilter androidBlendModeColorFilter) {
        return new BlendModeColorFilter(ColorKt.Color(androidBlendModeColorFilter.getColor()), AndroidBlendMode_androidKt.toComposeBlendMode(androidBlendModeColorFilter.getMode()), androidBlendModeColorFilter, null);
    }
}
