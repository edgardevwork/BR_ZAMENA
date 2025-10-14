package com.blackhub.bronline.game.gui.activetask;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.ivy.ant.IvyCleanCache;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActiveTaskEnum.kt */
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

