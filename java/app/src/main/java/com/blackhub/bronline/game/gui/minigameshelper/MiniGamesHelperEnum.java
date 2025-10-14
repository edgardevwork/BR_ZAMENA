package com.blackhub.bronline.game.gui.minigameshelper;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.ivy.ant.IvyCleanCache;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MiniGamesHelperEnum.kt */
/* loaded from: classes3.dex */
public final class MiniGamesHelperEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ MiniGamesHelperEnum[] $VALUES;
    public static final MiniGamesHelperEnum NONE = new MiniGamesHelperEnum(IvyCleanCache.NONE, 0);
    public static final MiniGamesHelperEnum SCREEN_PRIZE = new MiniGamesHelperEnum("SCREEN_PRIZE", 1);
    public static final MiniGamesHelperEnum SCREEN_FINGER = new MiniGamesHelperEnum("SCREEN_FINGER", 2);
    public static final MiniGamesHelperEnum SCREEN_UNTIE = new MiniGamesHelperEnum("SCREEN_UNTIE", 3);

    public static final /* synthetic */ MiniGamesHelperEnum[] $values() {
        return new MiniGamesHelperEnum[]{NONE, SCREEN_PRIZE, SCREEN_FINGER, SCREEN_UNTIE};
    }

    @NotNull
    public static EnumEntries<MiniGamesHelperEnum> getEntries() {
        return $ENTRIES;
    }

    public static MiniGamesHelperEnum valueOf(String str) {
        return (MiniGamesHelperEnum) Enum.valueOf(MiniGamesHelperEnum.class, str);
    }

    public static MiniGamesHelperEnum[] values() {
        return (MiniGamesHelperEnum[]) $VALUES.clone();
    }

    public MiniGamesHelperEnum(String str, int i) {
    }

    static {
        MiniGamesHelperEnum[] miniGamesHelperEnumArr$values = $values();
        $VALUES = miniGamesHelperEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(miniGamesHelperEnumArr$values);
    }
}

