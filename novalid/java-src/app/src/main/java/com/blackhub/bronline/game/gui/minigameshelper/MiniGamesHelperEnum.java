package com.blackhub.bronline.game.gui.minigameshelper;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.ivy.ant.IvyCleanCache;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MiniGamesHelperEnum.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperEnum;", "", "(Ljava/lang/String;I)V", IvyCleanCache.NONE, "SCREEN_PRIZE", "SCREEN_FINGER", "SCREEN_UNTIE", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
