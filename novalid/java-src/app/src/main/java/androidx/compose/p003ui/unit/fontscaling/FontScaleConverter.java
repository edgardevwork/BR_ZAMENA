package androidx.compose.p003ui.unit.fontscaling;

import androidx.annotation.RestrictTo;
import com.blackhub.bronline.game.gui.calendar.CalendarKeys;
import kotlin.Metadata;

/* compiled from: FontScaleConverter.android.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m7105d2 = {"Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "", "convertDpToSp", "", CalendarKeys.DAYS_GAME_KEY, "convertSpToDp", "sp", "ui-unit_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public interface FontScaleConverter {
    float convertDpToSp(float dp);

    float convertSpToDp(float sp);
}
