package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DatePicker.kt */
@Immutable
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0096\u0002J-\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\u0010\u0014\u001a\u00060\u0015j\u0002`\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0018J%\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u00132\n\u0010\u0014\u001a\u00060\u0015j\u0002`\u0016H\u0016¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u001e"}, m7105d2 = {"Landroidx/compose/material3/DatePickerFormatterImpl;", "Landroidx/compose/material3/DatePickerFormatter;", "yearSelectionSkeleton", "", "selectedDateSkeleton", "selectedDateDescriptionSkeleton", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "formatterCache", "", "", "getSelectedDateDescriptionSkeleton", "()Ljava/lang/String;", "getSelectedDateSkeleton", "getYearSelectionSkeleton", "equals", "", "other", "formatDate", "dateMillis", "", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "forContentDescription", "(Ljava/lang/Long;Ljava/util/Locale;Z)Ljava/lang/String;", "formatMonthYear", "monthMillis", "(Ljava/lang/Long;Ljava/util/Locale;)Ljava/lang/String;", "hashCode", "", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class DatePickerFormatterImpl implements DatePickerFormatter {

    @NotNull
    public final Map<String, Object> formatterCache = new LinkedHashMap();

    @NotNull
    public final String selectedDateDescriptionSkeleton;

    @NotNull
    public final String selectedDateSkeleton;

    @NotNull
    public final String yearSelectionSkeleton;

    public DatePickerFormatterImpl(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.yearSelectionSkeleton = str;
        this.selectedDateSkeleton = str2;
        this.selectedDateDescriptionSkeleton = str3;
    }

    @NotNull
    public final String getYearSelectionSkeleton() {
        return this.yearSelectionSkeleton;
    }

    @NotNull
    public final String getSelectedDateSkeleton() {
        return this.selectedDateSkeleton;
    }

    @NotNull
    public final String getSelectedDateDescriptionSkeleton() {
        return this.selectedDateDescriptionSkeleton;
    }

    @Override // androidx.compose.material3.DatePickerFormatter
    @Nullable
    public String formatMonthYear(@Nullable Long monthMillis, @NotNull Locale locale) {
        if (monthMillis == null) {
            return null;
        }
        return CalendarModel_androidKt.formatWithSkeleton(monthMillis.longValue(), this.yearSelectionSkeleton, locale, this.formatterCache);
    }

    @Override // androidx.compose.material3.DatePickerFormatter
    @Nullable
    public String formatDate(@Nullable Long dateMillis, @NotNull Locale locale, boolean forContentDescription) {
        String str;
        if (dateMillis == null) {
            return null;
        }
        long jLongValue = dateMillis.longValue();
        if (forContentDescription) {
            str = this.selectedDateDescriptionSkeleton;
        } else {
            str = this.selectedDateSkeleton;
        }
        return CalendarModel_androidKt.formatWithSkeleton(jLongValue, str, locale, this.formatterCache);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof DatePickerFormatterImpl)) {
            return false;
        }
        DatePickerFormatterImpl datePickerFormatterImpl = (DatePickerFormatterImpl) other;
        return Intrinsics.areEqual(this.yearSelectionSkeleton, datePickerFormatterImpl.yearSelectionSkeleton) && Intrinsics.areEqual(this.selectedDateSkeleton, datePickerFormatterImpl.selectedDateSkeleton) && Intrinsics.areEqual(this.selectedDateDescriptionSkeleton, datePickerFormatterImpl.selectedDateDescriptionSkeleton);
    }

    public int hashCode() {
        return (((this.yearSelectionSkeleton.hashCode() * 31) + this.selectedDateSkeleton.hashCode()) * 31) + this.selectedDateDescriptionSkeleton.hashCode();
    }
}
