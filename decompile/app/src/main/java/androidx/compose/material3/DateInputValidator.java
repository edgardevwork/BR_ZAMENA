package androidx.compose.material3;

import androidx.compose.material3.InputIdentifier;
import androidx.compose.runtime.Stable;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DateInput.kt */
@Stable
@Metadata(m7104d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0012J.\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\n\u0010\u001f\u001a\u00060 j\u0002`!ø\u0001\u0000¢\u0006\u0004\b\"\u0010#R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, m7105d2 = {"Landroidx/compose/material3/DateInputValidator;", "", "yearRange", "Lkotlin/ranges/IntRange;", "selectableDates", "Landroidx/compose/material3/SelectableDates;", "dateInputFormat", "Landroidx/compose/material3/DateInputFormat;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "errorDatePattern", "", "errorDateOutOfYearRange", "errorInvalidNotAllowed", "errorInvalidRangeInput", "currentStartDateMillis", "", "currentEndDateMillis", "(Lkotlin/ranges/IntRange;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DateInputFormat;Landroidx/compose/material3/DatePickerFormatter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getCurrentEndDateMillis$material3_release", "()Ljava/lang/Long;", "setCurrentEndDateMillis$material3_release", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCurrentStartDateMillis$material3_release", "setCurrentStartDateMillis$material3_release", "validate", "dateToValidate", "Landroidx/compose/material3/CalendarDate;", "inputIdentifier", "Landroidx/compose/material3/InputIdentifier;", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "validate-XivgLIo", "(Landroidx/compose/material3/CalendarDate;ILjava/util/Locale;)Ljava/lang/String;", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class DateInputValidator {
    public static final int $stable = 0;

    @Nullable
    private Long currentEndDateMillis;

    @Nullable
    private Long currentStartDateMillis;

    @NotNull
    private final DatePickerFormatter dateFormatter;

    @NotNull
    private final DateInputFormat dateInputFormat;

    @NotNull
    private final String errorDateOutOfYearRange;

    @NotNull
    private final String errorDatePattern;

    @NotNull
    private final String errorInvalidNotAllowed;

    @NotNull
    private final String errorInvalidRangeInput;

    @NotNull
    private final SelectableDates selectableDates;

    @NotNull
    private final IntRange yearRange;

    public DateInputValidator(@NotNull IntRange intRange, @NotNull SelectableDates selectableDates, @NotNull DateInputFormat dateInputFormat, @NotNull DatePickerFormatter datePickerFormatter, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable Long l, @Nullable Long l2) {
        this.yearRange = intRange;
        this.selectableDates = selectableDates;
        this.dateInputFormat = dateInputFormat;
        this.dateFormatter = datePickerFormatter;
        this.errorDatePattern = str;
        this.errorDateOutOfYearRange = str2;
        this.errorInvalidNotAllowed = str3;
        this.errorInvalidRangeInput = str4;
        this.currentStartDateMillis = l;
        this.currentEndDateMillis = l2;
    }

    public /* synthetic */ DateInputValidator(IntRange intRange, SelectableDates selectableDates, DateInputFormat dateInputFormat, DatePickerFormatter datePickerFormatter, String str, String str2, String str3, String str4, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(intRange, selectableDates, dateInputFormat, datePickerFormatter, str, str2, str3, str4, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : l2);
    }

    @Nullable
    /* renamed from: getCurrentStartDateMillis$material3_release, reason: from getter */
    public final Long getCurrentStartDateMillis() {
        return this.currentStartDateMillis;
    }

    public final void setCurrentStartDateMillis$material3_release(@Nullable Long l) {
        this.currentStartDateMillis = l;
    }

    @Nullable
    /* renamed from: getCurrentEndDateMillis$material3_release, reason: from getter */
    public final Long getCurrentEndDateMillis() {
        return this.currentEndDateMillis;
    }

    public final void setCurrentEndDateMillis$material3_release(@Nullable Long l) {
        this.currentEndDateMillis = l;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    @NotNull
    /* renamed from: validate-XivgLIo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m9346validateXivgLIo(@Nullable CalendarDate dateToValidate, int inputIdentifier, @NotNull Locale locale) {
        if (dateToValidate == null) {
            String str = this.errorDatePattern;
            String upperCase = this.dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String str2 = String.format(str, Arrays.copyOf(new Object[]{upperCase}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(this, *args)");
            return str2;
        }
        if (!this.yearRange.contains(dateToValidate.getYear())) {
            String str3 = String.format(this.errorDateOutOfYearRange, Arrays.copyOf(new Object[]{ActualJvm_jvmKt.toLocalString$default(this.yearRange.getFirst(), 0, 0, false, 7, null), ActualJvm_jvmKt.toLocalString$default(this.yearRange.getLast(), 0, 0, false, 7, null)}, 2));
            Intrinsics.checkNotNullExpressionValue(str3, "format(this, *args)");
            return str3;
        }
        SelectableDates selectableDates = this.selectableDates;
        if (!selectableDates.isSelectableYear(dateToValidate.getYear()) || !selectableDates.isSelectableDate(dateToValidate.getUtcTimeMillis())) {
            String str4 = String.format(this.errorInvalidNotAllowed, Arrays.copyOf(new Object[]{DatePickerFormatter.formatDate$default(this.dateFormatter, Long.valueOf(dateToValidate.getUtcTimeMillis()), locale, false, 4, null)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "format(this, *args)");
            return str4;
        }
        InputIdentifier.Companion companion = InputIdentifier.INSTANCE;
        if (InputIdentifier.m9514equalsimpl0(inputIdentifier, companion.m9520getStartDateInputJ2x2o4M())) {
            long utcTimeMillis = dateToValidate.getUtcTimeMillis();
            Long l = this.currentEndDateMillis;
            if (utcTimeMillis < (l != null ? l.longValue() : Long.MAX_VALUE)) {
                if (InputIdentifier.m9514equalsimpl0(inputIdentifier, companion.m9518getEndDateInputJ2x2o4M())) {
                    long utcTimeMillis2 = dateToValidate.getUtcTimeMillis();
                    Long l2 = this.currentStartDateMillis;
                    if (utcTimeMillis2 >= (l2 != null ? l2.longValue() : Long.MIN_VALUE)) {
                        return "";
                    }
                } else {
                    return "";
                }
            }
        }
        return this.errorInvalidRangeInput;
    }
}
