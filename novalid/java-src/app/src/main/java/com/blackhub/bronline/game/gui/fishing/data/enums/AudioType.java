package com.blackhub.bronline.game.gui.fishing.data.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.ivy.ant.IvyCleanCache;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioType.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fishing/data/enums/AudioType;", "", "(Ljava/lang/String;I)V", IvyCleanCache.NONE, "FISHING_FISH_BIT", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class AudioType {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ AudioType[] $VALUES;
    public static final AudioType NONE = new AudioType(IvyCleanCache.NONE, 0);
    public static final AudioType FISHING_FISH_BIT = new AudioType("FISHING_FISH_BIT", 1);

    public static final /* synthetic */ AudioType[] $values() {
        return new AudioType[]{NONE, FISHING_FISH_BIT};
    }

    @NotNull
    public static EnumEntries<AudioType> getEntries() {
        return $ENTRIES;
    }

    public static AudioType valueOf(String str) {
        return (AudioType) Enum.valueOf(AudioType.class, str);
    }

    public static AudioType[] values() {
        return (AudioType[]) $VALUES.clone();
    }

    public AudioType(String str, int i) {
    }

    static {
        AudioType[] audioTypeArr$values = $values();
        $VALUES = audioTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(audioTypeArr$values);
    }
}
