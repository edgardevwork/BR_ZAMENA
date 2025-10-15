package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DatePicker.kt */
@Stable
@Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0003\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\u0010\f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u001a\u001a\u0004\u0018\u00010\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, m7105d2 = {"Landroidx/compose/material3/DatePickerStateImpl;", "Landroidx/compose/material3/BaseDatePickerStateImpl;", "Landroidx/compose/material3/DatePickerState;", "initialSelectedDateMillis", "", "initialDisplayedMonthMillis", "yearRange", "Lkotlin/ranges/IntRange;", "initialDisplayMode", "Landroidx/compose/material3/DisplayMode;", "selectableDates", "Landroidx/compose/material3/SelectableDates;", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;Ljava/util/Locale;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "_displayMode", "Landroidx/compose/runtime/MutableState;", "_selectedDate", "Landroidx/compose/material3/CalendarDate;", "displayMode", "getDisplayMode-jFl-4v0", "()I", "setDisplayMode-vCnGnXg", "(I)V", "dateMillis", "selectedDateMillis", "getSelectedDateMillis", "()Ljava/lang/Long;", "setSelectedDateMillis", "(Ljava/lang/Long;)V", "Companion", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class DatePickerStateImpl extends BaseDatePickerStateImpl implements DatePickerState {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public MutableState<DisplayMode> _displayMode;

    @NotNull
    public MutableState<CalendarDate> _selectedDate;

    public /* synthetic */ DatePickerStateImpl(Long l, Long l2, IntRange intRange, int i, SelectableDates selectableDates, Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, intRange, i, selectableDates, locale);
    }

    public DatePickerStateImpl(Long l, Long l2, IntRange intRange, int i, SelectableDates selectableDates, Locale locale) {
        CalendarDate canonicalDate;
        super(l2, intRange, selectableDates, locale);
        if (l != null) {
            canonicalDate = getCalendarModel().getCanonicalDate(l.longValue());
            if (!intRange.contains(canonicalDate.getYear())) {
                throw new IllegalArgumentException(("The provided initial date's year (" + canonicalDate.getYear() + ") is out of the years range of " + intRange + '.').toString());
            }
        } else {
            canonicalDate = null;
        }
        this._selectedDate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(canonicalDate, null, 2, null);
        this._displayMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DisplayMode.m9413boximpl(i), null, 2, null);
    }

    @Override // androidx.compose.material3.DatePickerState
    @Nullable
    public Long getSelectedDateMillis() {
        CalendarDate value = this._selectedDate.getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Override // androidx.compose.material3.DatePickerState
    public void setSelectedDateMillis(@Nullable Long l) {
        if (l != null) {
            CalendarDate canonicalDate = getCalendarModel().getCanonicalDate(l.longValue());
            if (!getYearRange().contains(canonicalDate.getYear())) {
                throw new IllegalArgumentException(("The provided date's year (" + canonicalDate.getYear() + ") is out of the years range of " + getYearRange() + '.').toString());
            }
            this._selectedDate.setValue(canonicalDate);
            return;
        }
        this._selectedDate.setValue(null);
    }

    @Override // androidx.compose.material3.DatePickerState
    /* renamed from: getDisplayMode-jFl-4v0 */
    public int mo9389getDisplayModejFl4v0() {
        return this._displayMode.getValue().getValue();
    }

    @Override // androidx.compose.material3.DatePickerState
    /* renamed from: setDisplayMode-vCnGnXg */
    public void mo9390setDisplayModevCnGnXg(int i) {
        Long selectedDateMillis = getSelectedDateMillis();
        if (selectedDateMillis != null) {
            setDisplayedMonthMillis(getCalendarModel().getMonth(selectedDateMillis.longValue()).getStartUtcTimeMillis());
        }
        this._displayMode.setValue(DisplayMode.m9413boximpl(i));
    }

    /* compiled from: DatePicker.kt */
    @Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\n¨\u0006\u000b"}, m7105d2 = {"Landroidx/compose/material3/DatePickerStateImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/DatePickerStateImpl;", "selectableDates", "Landroidx/compose/material3/SelectableDates;", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Saver<DatePickerStateImpl, Object> Saver(@NotNull final SelectableDates selectableDates, @NotNull final Locale locale) {
            return ListSaverKt.listSaver(new Function2<SaverScope, DatePickerStateImpl, List<? extends Object>>() { // from class: androidx.compose.material3.DatePickerStateImpl$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final List<Object> invoke(@NotNull SaverScope saverScope, @NotNull DatePickerStateImpl datePickerStateImpl) {
                    return CollectionsKt__CollectionsKt.listOf(datePickerStateImpl.getSelectedDateMillis(), Long.valueOf(datePickerStateImpl.getDisplayedMonthMillis()), Integer.valueOf(datePickerStateImpl.getYearRange().getFirst()), Integer.valueOf(datePickerStateImpl.getYearRange().getLast()), Integer.valueOf(datePickerStateImpl.mo9389getDisplayModejFl4v0()));
                }
            }, new Function1<List, DatePickerStateImpl>() { // from class: androidx.compose.material3.DatePickerStateImpl$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ DatePickerStateImpl invoke(List list) {
                    return invoke2((List<? extends Object>) list);
                }

                @Nullable
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final DatePickerStateImpl invoke2(@NotNull List<? extends Object> list) {
                    Long l = (Long) list.get(0);
                    Long l2 = (Long) list.get(1);
                    Object obj = list.get(2);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) obj).intValue();
                    Object obj2 = list.get(3);
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                    IntRange intRange = new IntRange(iIntValue, ((Integer) obj2).intValue());
                    Object obj3 = list.get(4);
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                    return new DatePickerStateImpl(l, l2, intRange, DisplayMode.m9414constructorimpl(((Integer) obj3).intValue()), selectableDates, locale, null);
                }
            });
        }
    }
}
