package androidx.compose.material3;

import androidx.compose.runtime.Stable;
import com.google.gson.internal.bind.TypeAdapters;
import kotlin.Metadata;

/* compiled from: DatePicker.kt */
@Stable
@ExperimentalMaterial3Api
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m7105d2 = {"Landroidx/compose/material3/SelectableDates;", "", "isSelectableDate", "", "utcTimeMillis", "", "isSelectableYear", TypeAdapters.C786626.YEAR, "", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public interface SelectableDates {
    default boolean isSelectableDate(long utcTimeMillis) {
        return true;
    }

    default boolean isSelectableYear(int year) {
        return true;
    }
}
