package com.blackhub.bronline.game.gui.calendar.model;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.ant.IvyCleanCache;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CalendarRewardStates.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/calendar/model/CalendarBonusRewardState;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", IvyCleanCache.NONE, "NOT_RECEIVED", "NOT_RECEIVED_LOW_LEVEL", "AVAILABLE_NORM_LEVEL", "AVAILABLE_LOW_LEVEL", "RECEIVED", "Companion", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class CalendarBonusRewardState {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ CalendarBonusRewardState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public final int value;
    public static final CalendarBonusRewardState NONE = new CalendarBonusRewardState(IvyCleanCache.NONE, 0, -1);
    public static final CalendarBonusRewardState NOT_RECEIVED = new CalendarBonusRewardState("NOT_RECEIVED", 1, 0);
    public static final CalendarBonusRewardState NOT_RECEIVED_LOW_LEVEL = new CalendarBonusRewardState("NOT_RECEIVED_LOW_LEVEL", 2, 1);
    public static final CalendarBonusRewardState AVAILABLE_NORM_LEVEL = new CalendarBonusRewardState("AVAILABLE_NORM_LEVEL", 3, 2);
    public static final CalendarBonusRewardState AVAILABLE_LOW_LEVEL = new CalendarBonusRewardState("AVAILABLE_LOW_LEVEL", 4, 3);
    public static final CalendarBonusRewardState RECEIVED = new CalendarBonusRewardState("RECEIVED", 5, 4);

    public static final /* synthetic */ CalendarBonusRewardState[] $values() {
        return new CalendarBonusRewardState[]{NONE, NOT_RECEIVED, NOT_RECEIVED_LOW_LEVEL, AVAILABLE_NORM_LEVEL, AVAILABLE_LOW_LEVEL, RECEIVED};
    }

    @NotNull
    public static EnumEntries<CalendarBonusRewardState> getEntries() {
        return $ENTRIES;
    }

    public static CalendarBonusRewardState valueOf(String str) {
        return (CalendarBonusRewardState) Enum.valueOf(CalendarBonusRewardState.class, str);
    }

    public static CalendarBonusRewardState[] values() {
        return (CalendarBonusRewardState[]) $VALUES.clone();
    }

    public CalendarBonusRewardState(String str, int i, int i2) {
        this.value = i2;
    }

    public /* synthetic */ CalendarBonusRewardState(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i3 & 1) != 0 ? -1 : i2);
    }

    public final int getValue() {
        return this.value;
    }

    static {
        CalendarBonusRewardState[] calendarBonusRewardStateArr$values = $values();
        $VALUES = calendarBonusRewardStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(calendarBonusRewardStateArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: CalendarRewardStates.kt */
    @Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/calendar/model/CalendarBonusRewardState$Companion;", "", "()V", "fromInt", "Lcom/blackhub/bronline/game/gui/calendar/model/CalendarBonusRewardState;", "value", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nCalendarRewardStates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarRewardStates.kt\ncom/blackhub/bronline/game/gui/calendar/model/CalendarBonusRewardState$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,12:1\n288#2,2:13\n*S KotlinDebug\n*F\n+ 1 CalendarRewardStates.kt\ncom/blackhub/bronline/game/gui/calendar/model/CalendarBonusRewardState$Companion\n*L\n10#1:13,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final CalendarBonusRewardState fromInt(int value) {
            CalendarBonusRewardState next;
            Iterator<CalendarBonusRewardState> it = CalendarBonusRewardState.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getValue() == value) {
                    break;
                }
            }
            CalendarBonusRewardState calendarBonusRewardState = next;
            return calendarBonusRewardState == null ? CalendarBonusRewardState.NONE : calendarBonusRewardState;
        }
    }
}
