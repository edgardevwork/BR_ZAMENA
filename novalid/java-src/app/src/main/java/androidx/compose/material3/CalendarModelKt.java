package androidx.compose.material3;

import com.blackhub.bronline.game.gui.menupausesettingandmap.NativeKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: CalendarModel.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, m7105d2 = {"DaysInWeek", "", "MillisecondsIn24Hours", "", "datePatternAsInputFormat", "Landroidx/compose/material3/DateInputFormat;", "localeFormat", "", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class CalendarModelKt {
    public static final int DaysInWeek = 7;
    public static final long MillisecondsIn24Hours = 86400000;

    @ExperimentalMaterial3Api
    @NotNull
    public static final DateInputFormat datePatternAsInputFormat(@NotNull String str) {
        String strRemoveSuffix = StringsKt__StringsKt.removeSuffix(StringsKt__StringsJVMKt.replace$default(new Regex("y{1,4}").replace(new Regex("M{1,2}").replace(new Regex("d{1,2}").replace(new Regex("[^dMy/\\-.]").replace(str, ""), NativeKeys.DRAW_DISTANCE_NK), "MM"), "yyyy"), "My", "M/y", false, 4, (Object) null), (CharSequence) ".");
        MatchResult matchResultFind$default = Regex.find$default(new Regex("[/\\-.]"), strRemoveSuffix, 0, 2, null);
        Intrinsics.checkNotNull(matchResultFind$default);
        MatchGroup matchGroup = matchResultFind$default.getGroups().get(0);
        Intrinsics.checkNotNull(matchGroup);
        int first = matchGroup.getRange().getFirst();
        String strSubstring = strRemoveSuffix.substring(first, first + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new DateInputFormat(strRemoveSuffix, strSubstring.charAt(0));
    }
}
