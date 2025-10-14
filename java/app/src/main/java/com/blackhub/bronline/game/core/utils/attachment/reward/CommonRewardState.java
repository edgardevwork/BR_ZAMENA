package com.blackhub.bronline.game.core.utils.attachment.reward;

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
/* compiled from: CommonRewardState.kt */
/* loaded from: classes3.dex */
public final class CommonRewardState {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ CommonRewardState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public final int value;
    public static final CommonRewardState NONE = new CommonRewardState(IvyCleanCache.NONE, 0, -1);
    public static final CommonRewardState NORM_NOT_RECEIVED = new CommonRewardState("NORM_NOT_RECEIVED", 1, 0);
    public static final CommonRewardState EPIC_NOT_RECEIVED_LOW_LEVEL = new CommonRewardState("EPIC_NOT_RECEIVED_LOW_LEVEL", 2, 4);
    public static final CommonRewardState EPIC_NOT_RECEIVED_NORW_LEVEL = new CommonRewardState("EPIC_NOT_RECEIVED_NORW_LEVEL", 3, 5);
    public static final CommonRewardState NORM_TIMER = new CommonRewardState("NORM_TIMER", 4, 1);
    public static final CommonRewardState EPIC_TIMER_LOW_LEVEL = new CommonRewardState("EPIC_TIMER_LOW_LEVEL", 5, 6);
    public static final CommonRewardState EPIC_TIMER_NORM_LEVEL = new CommonRewardState("EPIC_TIMER_NORM_LEVEL", 6, 7);
    public static final CommonRewardState NORM_AVAILABLE = new CommonRewardState("NORM_AVAILABLE", 7, 2);
    public static final CommonRewardState EPIC_AVAILABLE_LOW_LEVEL = new CommonRewardState("EPIC_AVAILABLE_LOW_LEVEL", 8, 8);
    public static final CommonRewardState EPIC_AVAILABLE_NORW_LEVEL = new CommonRewardState("EPIC_AVAILABLE_NORW_LEVEL", 9, 9);
    public static final CommonRewardState NORM_RECEIVED = new CommonRewardState("NORM_RECEIVED", 10, 3);
    public static final CommonRewardState EPIC_RECEIVED = new CommonRewardState("EPIC_RECEIVED", 11, 10);

    public static final /* synthetic */ CommonRewardState[] $values() {
        return new CommonRewardState[]{NONE, NORM_NOT_RECEIVED, EPIC_NOT_RECEIVED_LOW_LEVEL, EPIC_NOT_RECEIVED_NORW_LEVEL, NORM_TIMER, EPIC_TIMER_LOW_LEVEL, EPIC_TIMER_NORM_LEVEL, NORM_AVAILABLE, EPIC_AVAILABLE_LOW_LEVEL, EPIC_AVAILABLE_NORW_LEVEL, NORM_RECEIVED, EPIC_RECEIVED};
    }

    @NotNull
    public static EnumEntries<CommonRewardState> getEntries() {
        return $ENTRIES;
    }

    public static CommonRewardState valueOf(String str) {
        return (CommonRewardState) Enum.valueOf(CommonRewardState.class, str);
    }

    public static CommonRewardState[] values() {
        return (CommonRewardState[]) $VALUES.clone();
    }

    public CommonRewardState(String str, int i, int i2) {
        this.value = i2;
    }

    public /* synthetic */ CommonRewardState(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i3 & 1) != 0 ? -1 : i2);
    }

    public final int getValue() {
        return this.value;
    }

    static {
        CommonRewardState[] commonRewardStateArr$values = $values();
        $VALUES = commonRewardStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(commonRewardStateArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: CommonRewardState.kt */
    @Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardState$Companion;", "", "()V", "fromInt", "Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardState;", "value", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nCommonRewardState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRewardState.kt\ncom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardState$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,13:1\n288#2,2:14\n*S KotlinDebug\n*F\n+ 1 CommonRewardState.kt\ncom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardState$Companion\n*L\n11#1:14,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final CommonRewardState fromInt(int value) {
            CommonRewardState next;
            Iterator<CommonRewardState> it = CommonRewardState.getEntries().iterator();
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
            CommonRewardState commonRewardState = next;
            return commonRewardState == null ? CommonRewardState.NONE : commonRewardState;
        }
    }
}

