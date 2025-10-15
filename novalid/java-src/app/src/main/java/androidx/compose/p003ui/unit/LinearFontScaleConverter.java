package androidx.compose.p003ui.unit;

import androidx.compose.p003ui.unit.fontscaling.FontScaleConverter;
import com.blackhub.bronline.game.gui.calendar.CalendarKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidDensity.android.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003HÂ\u0003J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m7105d2 = {"Landroidx/compose/ui/unit/LinearFontScaleConverter;", "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "fontScale", "", "(F)V", "component1", "convertDpToSp", CalendarKeys.DAYS_GAME_KEY, "convertSpToDp", "sp", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-unit_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LinearFontScaleConverter implements FontScaleConverter {
    public final float fontScale;

    public static /* synthetic */ LinearFontScaleConverter copy$default(LinearFontScaleConverter linearFontScaleConverter, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = linearFontScaleConverter.fontScale;
        }
        return linearFontScaleConverter.copy(f);
    }

    /* renamed from: component1, reason: from getter */
    public final float getFontScale() {
        return this.fontScale;
    }

    @NotNull
    public final LinearFontScaleConverter copy(float fontScale) {
        return new LinearFontScaleConverter(fontScale);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LinearFontScaleConverter) && Float.compare(this.fontScale, ((LinearFontScaleConverter) other).fontScale) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.fontScale);
    }

    @NotNull
    public String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.fontScale + ')';
    }

    public LinearFontScaleConverter(float f) {
        this.fontScale = f;
    }

    @Override // androidx.compose.p003ui.unit.fontscaling.FontScaleConverter
    public float convertSpToDp(float sp) {
        return sp * this.fontScale;
    }

    @Override // androidx.compose.p003ui.unit.fontscaling.FontScaleConverter
    public float convertDpToSp(float dp) {
        return dp / this.fontScale;
    }
}
