package com.blackhub.bronline.game.p019ui.widget.other;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GradientOffset.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m7105d2 = {"Lcom/blackhub/bronline/game/ui/widget/other/GradientAngle;", "", "(Ljava/lang/String;I)V", "CW0", "CW45", "CW90", "CW135", "CW180", "CW225", "CW270", "CW315", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class GradientAngle {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ GradientAngle[] $VALUES;
    public static final GradientAngle CW0 = new GradientAngle("CW0", 0);
    public static final GradientAngle CW45 = new GradientAngle("CW45", 1);
    public static final GradientAngle CW90 = new GradientAngle("CW90", 2);
    public static final GradientAngle CW135 = new GradientAngle("CW135", 3);
    public static final GradientAngle CW180 = new GradientAngle("CW180", 4);
    public static final GradientAngle CW225 = new GradientAngle("CW225", 5);
    public static final GradientAngle CW270 = new GradientAngle("CW270", 6);
    public static final GradientAngle CW315 = new GradientAngle("CW315", 7);

    public static final /* synthetic */ GradientAngle[] $values() {
        return new GradientAngle[]{CW0, CW45, CW90, CW135, CW180, CW225, CW270, CW315};
    }

    @NotNull
    public static EnumEntries<GradientAngle> getEntries() {
        return $ENTRIES;
    }

    public static GradientAngle valueOf(String str) {
        return (GradientAngle) Enum.valueOf(GradientAngle.class, str);
    }

    public static GradientAngle[] values() {
        return (GradientAngle[]) $VALUES.clone();
    }

    public GradientAngle(String str, int i) {
    }

    static {
        GradientAngle[] gradientAngleArr$values = $values();
        $VALUES = gradientAngleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(gradientAngleArr$values);
    }
}
