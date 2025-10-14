package com.blackhub.bronline.game.gui.electric.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.ivy.ant.IvyCleanCache;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ColorTrafficLight.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/electric/enums/ColorTrafficLight;", "", "(Ljava/lang/String;I)V", IvyCleanCache.NONE, "RED", "YELLOW", "GREEN", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class ColorTrafficLight {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ ColorTrafficLight[] $VALUES;
    public static final ColorTrafficLight NONE = new ColorTrafficLight(IvyCleanCache.NONE, 0);
    public static final ColorTrafficLight RED = new ColorTrafficLight("RED", 1);
    public static final ColorTrafficLight YELLOW = new ColorTrafficLight("YELLOW", 2);
    public static final ColorTrafficLight GREEN = new ColorTrafficLight("GREEN", 3);

    public static final /* synthetic */ ColorTrafficLight[] $values() {
        return new ColorTrafficLight[]{NONE, RED, YELLOW, GREEN};
    }

    @NotNull
    public static EnumEntries<ColorTrafficLight> getEntries() {
        return $ENTRIES;
    }

    public static ColorTrafficLight valueOf(String str) {
        return (ColorTrafficLight) Enum.valueOf(ColorTrafficLight.class, str);
    }

    public static ColorTrafficLight[] values() {
        return (ColorTrafficLight[]) $VALUES.clone();
    }

    public ColorTrafficLight(String str, int i) {
    }

    static {
        ColorTrafficLight[] colorTrafficLightArr$values = $values();
        $VALUES = colorTrafficLightArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(colorTrafficLightArr$values);
    }
}
