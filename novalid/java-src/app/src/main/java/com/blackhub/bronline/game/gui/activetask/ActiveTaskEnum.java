package com.blackhub.bronline.game.gui.activetask;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.ivy.ant.IvyCleanCache;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActiveTaskEnum.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/activetask/ActiveTaskEnum;", "", "(Ljava/lang/String;I)V", IvyCleanCache.NONE, "ACTIVE_TASK", "ACTIVE_HINT_WITH_BUTTON", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class ActiveTaskEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ ActiveTaskEnum[] $VALUES;
    public static final ActiveTaskEnum NONE = new ActiveTaskEnum(IvyCleanCache.NONE, 0);
    public static final ActiveTaskEnum ACTIVE_TASK = new ActiveTaskEnum("ACTIVE_TASK", 1);
    public static final ActiveTaskEnum ACTIVE_HINT_WITH_BUTTON = new ActiveTaskEnum("ACTIVE_HINT_WITH_BUTTON", 2);

    public static final /* synthetic */ ActiveTaskEnum[] $values() {
        return new ActiveTaskEnum[]{NONE, ACTIVE_TASK, ACTIVE_HINT_WITH_BUTTON};
    }

    @NotNull
    public static EnumEntries<ActiveTaskEnum> getEntries() {
        return $ENTRIES;
    }

    public static ActiveTaskEnum valueOf(String str) {
        return (ActiveTaskEnum) Enum.valueOf(ActiveTaskEnum.class, str);
    }

    public static ActiveTaskEnum[] values() {
        return (ActiveTaskEnum[]) $VALUES.clone();
    }

    public ActiveTaskEnum(String str, int i) {
    }

    static {
        ActiveTaskEnum[] activeTaskEnumArr$values = $values();
        $VALUES = activeTaskEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(activeTaskEnumArr$values);
    }
}
