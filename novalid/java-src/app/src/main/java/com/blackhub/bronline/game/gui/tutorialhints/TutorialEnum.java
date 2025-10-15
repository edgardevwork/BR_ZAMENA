package com.blackhub.bronline.game.gui.tutorialhints;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.ivy.ant.IvyCleanCache;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TutorialEnum.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialEnum;", "", "(Ljava/lang/String;I)V", IvyCleanCache.NONE, "GUIDE", "TASKS", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
