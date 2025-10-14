package com.blackhub.bronline.game.gui.tutorialhints;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.ivy.ant.IvyCleanCache;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TutorialEnum.kt */
/* loaded from: classes3.dex */
public final class TutorialEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ TutorialEnum[] $VALUES;
    public static final TutorialEnum NONE = new TutorialEnum(IvyCleanCache.NONE, 0);
    public static final TutorialEnum GUIDE = new TutorialEnum("GUIDE", 1);
    public static final TutorialEnum TASKS = new TutorialEnum("TASKS", 2);

    public static final /* synthetic */ TutorialEnum[] $values() {
        return new TutorialEnum[]{NONE, GUIDE, TASKS};
    }

    @NotNull
    public static EnumEntries<TutorialEnum> getEntries() {
        return $ENTRIES;
    }

    public static TutorialEnum valueOf(String str) {
        return (TutorialEnum) Enum.valueOf(TutorialEnum.class, str);
    }

    public static TutorialEnum[] values() {
        return (TutorialEnum[]) $VALUES.clone();
    }

    public TutorialEnum(String str, int i) {
    }

    static {
        TutorialEnum[] tutorialEnumArr$values = $values();
        $VALUES = tutorialEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(tutorialEnumArr$values);
    }
}

